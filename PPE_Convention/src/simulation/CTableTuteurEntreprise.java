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

public class CTableTuteurEntreprise {

    protected CBDD bdd;

    public CTableTuteurEntreprise() {
        this.bdd = new CBDD();
    }

        
    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

 
    CTuteurEntreprise convertir_RS_TuteurEntreprise(ResultSet rs) {
        try {
            int id = rs.getInt("idPersonnes");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenoms");
            return new CTuteurEntreprise(id, nom, prenom);
        } catch (SQLException ex) {
            Logger.getLogger(CTableTuteurEntreprise.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CTuteurEntreprise> lireTuteurEntreprise() {

        if (bdd.connecter() == true) {
            ArrayList<CTuteurEntreprise> listeTuteurEntreprise = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from tablePersonnes WHERE role='tuteurEntreprise'");
            try {
                while (rs.next()) {
                    CTuteurEntreprise tuteurEntreprise = convertir_RS_TuteurEntreprise(rs);
                    listeTuteurEntreprise.add(tuteurEntreprise);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeTuteurEntreprise;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public static void main(String[] args) {
        CTableTuteurEntreprise table = new CTableTuteurEntreprise();
        table.lireTuteurEntreprise();
    }


}
