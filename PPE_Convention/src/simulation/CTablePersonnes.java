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

public class CTablePersonnes {

    protected CBDD bdd;

    public CTablePersonnes() {
        this.bdd = new CBDD();
    }

        
    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

 
    CPersonnelPedagogique convertir_RS_Personnes(ResultSet rs) {
        try {
            int id = rs.getInt("idPersonnes");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenoms");
            return new CPersonnelPedagogique(id, nom, prenom);
        } catch (SQLException ex) {
            Logger.getLogger(CTablePersonnes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CPersonnelPedagogique> lirePersonnes() {

        if (bdd.connecter() == true) {
            ArrayList<CPersonnelPedagogique> listePersonnes = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from tablePersonnes");
            try {
                while (rs.next()) {
                    CPersonnelPedagogique PersonnelPedagogique = convertir_RS_Personnes(rs);
                    listePersonnes.add(PersonnelPedagogique);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listePersonnes;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public static void main(String[] args) {
        CTablePersonnes table = new CTablePersonnes();
        table.lirePersonnes();
    }


}
