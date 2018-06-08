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

public class CTableEtudiants {

    protected CBDD bdd;

    public CTableEtudiants() {
        this.bdd = new CBDD();
    }

        
    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

 
    CEtudiant convertir_RS_Etudiant(ResultSet rs) {
        try {
            int id = rs.getInt("idPersonnes");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenoms");
            return new CEtudiant(id, nom, prenom);
        } catch (SQLException ex) {
            Logger.getLogger(CTableEtudiants.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CEtudiant> lireEtudiants() {

        if (bdd.connecter() == true) {
            ArrayList<CEtudiant> listeEtudiants = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from tablePersonnes WHERE role='etudiant'");
            try {
                while (rs.next()) {
                    CEtudiant etudiant = convertir_RS_Etudiant(rs);
                    listeEtudiants.add(etudiant);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeEtudiants;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public static void main(String[] args) {
        CTableEtudiants table = new CTableEtudiants();
        table.lireEtudiants();
    }


}
