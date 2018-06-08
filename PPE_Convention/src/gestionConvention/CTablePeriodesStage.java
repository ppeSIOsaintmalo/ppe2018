/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionConvention;

import bdd.CParametresStockageBDD;
import bdd.CBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author stagiaire
 */
public class CTablePeriodesStage {

    public CBDD bdd;

    public CTablePeriodesStage() {
        this.bdd = new CBDD();
    }

    public CTablePeriodesStage(CBDD bdd) {
        this.bdd = bdd;
    }

    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

    public String formaterDate(GregorianCalendar gc) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        fmt.setCalendar(gc);
        return fmt.format(gc.getTime());
    }

    public CPeriodeStage convertir_RS_PeriodeStage(ResultSet rs) {
        try {
            int idPeriodeStage = rs.getInt("idPeriodeStage");
            int idEtudiant = rs.getInt("idEtudiant");
            int idPersonnelPedagogique = rs.getInt("idPersonnelPedagogique");
            int idTuteurEntreprise = rs.getInt("idTuteurEntreprise");
            int idEntreprise = rs.getInt("idEntreprise");
            Date dateDebut = rs.getDate("dateDebut");
            Date dateFin = rs.getDate("dateFin");
            int dureeHebdomadaire = rs.getInt("dureeHebdomadaire");
            String etatConvention = rs.getString("etatConvention");

            GregorianCalendar gcDDebut = new GregorianCalendar();
            gcDDebut.setTime(dateDebut);
            GregorianCalendar gcDFin = new GregorianCalendar();
            gcDFin.setTime(dateFin);

            return new CPeriodeStage(idPeriodeStage, idEtudiant, idPersonnelPedagogique, idTuteurEntreprise, idEntreprise, gcDDebut, gcDFin, dureeHebdomadaire, etatConvention);
        } catch (SQLException ex) {
            Logger.getLogger(CPeriodeStage.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<CPeriodeStage> lireLesConventions() {

        if (bdd.connecter() == true) {
            ArrayList<CPeriodeStage> listeConvention = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from tableperiodesstages");
            try {
                while (rs.next()) {
                    CPeriodeStage convention = convertir_RS_PeriodeStage(rs);
                    listeConvention.add(convention);

                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeConvention;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public CPeriodeStage lireUneConvention(int idEtudiant) {
        CPeriodeStage convention = null;
        if (bdd.connecter() == true) {
            System.out.println("Connexion OK");
            ResultSet rs = bdd.executerRequeteQuery("select * from tableperiodesstages  WHERE `tableperiodesstages`.`idEtudiant` = " + idEtudiant);
            try {
                if (rs.next()) {
                    convention = convertir_RS_PeriodeStage(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return convention;
    }

    public int ajouterUneConvention(CPeriodeStage convention) {
        int res = -1;
        if (bdd.connecter() == true) {
            String dateDebut = formaterDate(convention.getDateDebut());
            String dateFin = formaterDate(convention.getDateFin());
            String req = "INSERT INTO "
                    + bdd.getParametresStockageBDD().getNomBase()
                    + ".`tableperiodesstages`"
                    + " (`idEtudiant`, `idPersonnelPedagogique`,"
                    + " `idTuteurEntreprise`, `idEntreprise`, `sujet`, `dateDebut`,"
                    + " `dateFin`, `dureeHebdomadaire`, "
                    + "`etatConvention`)"
                    + "VALUES ( '" + convention.getIdEtudiant()
                    + "', '" + convention.getIdPersonnelPedagogique()
                    + "', '" + convention.getIdTuteurEntreprise()
                    + "', '" + convention.getIdEntreprise()
                    + "' , '" + convention.getSujet()
                    + "', '" + dateDebut
                    + "', '" + dateFin
                    + "', '" + convention.getDureeHebdomadaire()
                    + "', '" + convention.getEtatConvention() + "');";

            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int mettreAJourConvention(CPeriodeStage convention) {
        int res = -1;
        if (bdd.connecter() == true) {
            String dateDebut = formaterDate(convention.getDateDebut());
            String dateFin = formaterDate(convention.getDateFin());
            String req = "UPDATE "
                    + bdd.getParametresStockageBDD().getNomBase() + ".`tableperiodesstages`"
                    + "SET "
                    + "`idEtudiant` = '" + convention.getIdEtudiant() + "', "
                    + "`idPersonnelPedagogique` = '" + convention.getIdPersonnelPedagogique() + "', "
                    + "`idTuteurEntreprise` = '" + convention.getIdTuteurEntreprise() + "', "
                    + "`idEntreprise` = '" + convention.getIdEntreprise() + "', "
                    + "`dateDebut` = '" + dateDebut + "', "
                    + "`dateFin` = '" + dateFin + "', "
                    + "`dureeHebdomadaire` = '" + convention.getDureeHebdomadaire() + "', "
                    + "`etatConvention` = '" + convention.getEtatConvention()
                    + "' WHERE `tableperiodesstages`.`idPeriodeStage` =" + convention.getIdPeriodeStage();

            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int modifierConvention(CPeriodeStage convention) {
        int res = -1;
        if (bdd.connecter() == true) {

            String req = "UPDATE "
                    + bdd.getParametresStockageBDD().getNomBase() + ".`tableperiodesstages`"
                    + "SET "
                    + "`idPersonnelPedagogique` = '" + convention.getIdPersonnelPedagogique() + "', "
                    + "`idTuteurEntreprise` = '" + convention.getIdTuteurEntreprise() + "', "
                    + "`idEntreprise` = '" + convention.getIdEntreprise() + "', "
                    + "`dureeHebdomadaire` = '" + convention.getDureeHebdomadaire() + "', "
                    + "`etatConvention` = '" + convention.getEtatConvention()
                    + "' WHERE `tableperiodesstages`.`idPeriodeStage` =" + convention.getIdPeriodeStage();

            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int supprimerConvention(int idPeriodeStage) {
        int res = -1;
        if (bdd.connecter() == true) {

            String req = "DELETE FROM " + bdd.getParametresStockageBDD().getNomBase() + ".`tableperiodesstages`"
                    + "WHERE `tableperiodesstages`.`idPeriodeStage` = " + idPeriodeStage;

            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int supprimerToutesLesConventions() {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM " + bdd.getParametresStockageBDD().getNomBase() + ".`tableperiodesstages`";
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public static void main(String[] args) {

        CBDD bdd = new CBDD(new CParametresStockageBDD("parametresBdd.properties"));
        CTablePeriodesStage tableperiodesstages = new CTablePeriodesStage();
        tableperiodesstages.setBdd(bdd);

        ArrayList<CPeriodeStage> listeConvention = tableperiodesstages.lireLesConventions();

        for (CPeriodeStage convention : listeConvention) {
            System.out.println("" + convention.toString());
        }

        CPeriodeStage testConv = tableperiodesstages.lireUneConvention(1);
        if (testConv != null) {
            System.out.println("" + testConv.toString());
        }

        CTablePeriodesStage tableperiodesstages2 = new CTablePeriodesStage();

        ArrayList<CPeriodeStage> listeConvention2 = tableperiodesstages2.lireLesConventions();

        for (CPeriodeStage convention : listeConvention2) {
            System.out.println("" + convention.toString());
        }

//        CPeriodeStage testConv2 = tableperiodesstages2.lireUneConvention(1);
//        if (testConv2 != null) {
//            System.out.println("" + testConv2.toString());
    }

    //       tableperiodesstages.ajouterUneConvention(new CPeriodeStage(-1, 45, 56, 21, 45, "test", new GregorianCalendar(), new GregorianCalendar(), "aucune info", 35, "signé")); 
    //     tableperiodesstages.mettreAJourConvention(new CPeriodeStage(12, 52, 68, 39, 27, new GregorianCalendar(), new GregorianCalendar(), 32, "non signé"));
//        tableperiodesstages.supprimerConvention(23);
//        tableperiodesstages.supprimerToutesLesConventions();
}
