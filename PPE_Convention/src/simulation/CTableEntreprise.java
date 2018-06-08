package simulation;

import bdd.CBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTableEntreprise {

    protected CBDD bdd;

    public CTableEntreprise() {
        this.bdd = new CBDD();
    }

        
    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

 
    CEntreprise convertir_RS_Entreprise(ResultSet rs) {
        try {
            int id = rs.getInt("idEntreprise");
            String nom = rs.getString("nom");            
            return new CEntreprise(id, nom);
        } catch (SQLException ex) {
            Logger.getLogger(CTableEntreprise.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CEntreprise> lireEntreprise() {

        if (bdd.connecter() == true) {
            ArrayList<CEntreprise> listeEntreprise = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from tableEntreprises");
            try {
                while (rs.next()) {
                    CEntreprise entreprise = convertir_RS_Entreprise(rs);
                    listeEntreprise.add(entreprise);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeEntreprise;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public static void main(String[] args) {
        CTableEntreprise table = new CTableEntreprise();
        table.lireEntreprise();
    }


}
