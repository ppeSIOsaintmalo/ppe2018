/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionConvention;

import simulation.CEntreprise;
import simulation.CEtudiant;
import simulation.CPersonnelPedagogique;
import simulation.CTuteurEntreprise;
import java.util.GregorianCalendar;

/**
 *
 * @author stagiaire
 */
public class CPeriodeStage {

    protected int idPeriodeStage;
    protected int idEtudiant;
    protected int idPersonnelPedagogique;
    protected int idTuteurEntreprise;
    protected int idEntreprise;
    protected String sujet;
    protected GregorianCalendar dateDebut; //null = l'obj n'est pas créé
    protected GregorianCalendar dateFin;
//    protected String infosComplementaires;
    protected int dureeHebdomadaire;
    protected String etatConvention;

    protected CEtudiant etudiant;
    protected CPersonnelPedagogique personnelPeda;
    protected CTuteurEntreprise tuteurEntreprise;
    protected CEntreprise entreprise;
    protected CConvention convention;

//    protected GregorianCalendar dateVisite;
//    protected GregorianCalendar heureDebutVisite;
//    protected GregorianCalendar heureFinVisite;
//    protected boolean visiteRealisee;
//    protected boolean omValide;
    public CPeriodeStage() {
    }

    public CPeriodeStage(int idPeriodeStage, int idEtudiant, int idPersonnelPedagogique, int idTuteurEntreprise, int idEntreprise, GregorianCalendar dateDebut, GregorianCalendar dateFin, int dureeHebdomadaire, String etatConvention) {
        this.setIdPeriodeStage(idPeriodeStage);
        this.setIdEtudiant(idEtudiant);
        this.setIdPersonnelPedagogique(idPersonnelPedagogique);
        this.setIdTuteurEntreprise(idTuteurEntreprise);
        this.setIdEntreprise(idEntreprise);
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
        this.setDureeHebdomadaire(dureeHebdomadaire);
        this.setEtatConvention(etatConvention);
    }

    public CPeriodeStage(int idPeriodeStage, int idEtudiant, int idPersonnelPedagogique, int idTuteurEntreprise, int idEntreprise, int anneeDebut, int moisDebut, int jourDebut, int anneeFin, int moisFin, int jourFin, int dureeHebdomadaire, String etatConvention) {
        this.setIdPeriodeStage(idPeriodeStage);
        this.setIdEtudiant(idEtudiant);
        this.setIdPersonnelPedagogique(idPersonnelPedagogique);
        this.setIdTuteurEntreprise(idTuteurEntreprise);
        this.setIdEntreprise(idEntreprise);
        this.setDateDebut(new GregorianCalendar(anneeDebut, moisDebut, jourDebut));
        this.setDateFin(new GregorianCalendar(anneeFin, moisFin, jourFin));
        this.setDureeHebdomadaire(dureeHebdomadaire);
        this.setEtatConvention(etatConvention);
    }
//Constructeur pour JDialogModifierUneConvention
    CPeriodeStage(int idPeriodeStage,int idPersonnelPedagogique, int idTuteurEntreprise, int idEntreprise, int dureeHebdomadaire, String etatConvention) {
     this.setIdPeriodeStage(idPeriodeStage);        
        this.setIdPersonnelPedagogique(idPersonnelPedagogique);
        this.setIdTuteurEntreprise(idTuteurEntreprise);
        this.setIdEntreprise(idEntreprise);
        this.setDureeHebdomadaire(dureeHebdomadaire);
        this.setEtatConvention(etatConvention);   
    }

    public int getIdPeriodeStage() {
        return idPeriodeStage;
    }

    public void setIdPeriodeStage(int idPeriodeStage) {
        this.idPeriodeStage = idPeriodeStage;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdPersonnelPedagogique() {
        return idPersonnelPedagogique;
    }

    public void setIdPersonnelPedagogique(int idPersonnelPedagogique) {
        this.idPersonnelPedagogique = idPersonnelPedagogique;
    }

    public int getIdTuteurEntreprise() {
        return idTuteurEntreprise;
    }

    public void setIdTuteurEntreprise(int idTuteurEntreprise) {
        this.idTuteurEntreprise = idTuteurEntreprise;
    }

    public int getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(int idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
        
    public GregorianCalendar getDateDebut() {
        return dateDebut;
    }

    public String getDateDebutToString() {
        return this.gregorianCalendarToString(this.dateDebut);
    }

    public void setDateDebut(GregorianCalendar dateDebut) {
//        if (this.verifDateOK(dateDebut)) {
        this.dateDebut = dateDebut;
//        }
    }

    public void setDateDebut(int annee, int mois, int jour) {  //faire des vefifications sur l'année, le mois  et le jour
        GregorianCalendar dateSaisie = new GregorianCalendar(annee, mois, jour);

//        if (mois >= 0 && mois <= 11 && jour > 0 && jour <= 31) {
//            if (this.verifDateOK(dateSaisie)) {
        this.dateDebut = dateSaisie;
//            }
//        }
    }

    public GregorianCalendar getDateFin() {
        return dateFin;
    }

    public String getDateFinToString() {
        return this.gregorianCalendarToString(this.dateFin);
    }

    public void setDateFin(GregorianCalendar dateFin) {
//        if (this.verifDateFinOK(dateFin)) {
        this.dateFin = dateFin;
//        }

    }

    public void setDateFin(int annee, int mois, int jour) {
        GregorianCalendar dateSaisie = new GregorianCalendar(annee, mois, jour);

//        if (mois >= 0 && mois <= 11 && jour > 0 && jour <= 31) {
//            if (this.verifDateFinOK(dateSaisie)) {
        this.dateFin = dateSaisie;

//            }
//        }
    }

    public int getDureeHebdomadaire() {
        return dureeHebdomadaire;
    }

    public void setDureeHebdomadaire(int dureeHebdomadaire) {
        this.dureeHebdomadaire = dureeHebdomadaire;
    }

    public String getEtatConvention() {
        return etatConvention;
    }

    public void setEtatConvention(String etatConvention) {
        this.etatConvention = etatConvention;
    }

    public CEtudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(CEtudiant etudiant) {
        this.etudiant = etudiant;
    }

    public CPersonnelPedagogique getPersonnelPeda() {
        return personnelPeda;
    }

    public void setPersonnelPeda(CPersonnelPedagogique personnelPeda) {
        this.personnelPeda = personnelPeda;
    }

    public CTuteurEntreprise getTuteurEntreprise() {
        return tuteurEntreprise;
    }

    public void setTuteurEntreprise(CTuteurEntreprise tuteurEntreprise) {
        this.tuteurEntreprise = tuteurEntreprise;
    }

    public CEntreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(CEntreprise entreprise) {
        this.entreprise = entreprise;
    }

    public CConvention getConvention() {
        return convention;
    }

    public void setConvention(CConvention convention) {
        this.convention = convention;
    }

    public boolean verifDateOK(GregorianCalendar date) {
        boolean resultat = false;
        GregorianCalendar aujourdhui = new GregorianCalendar();

        if (date.compareTo(aujourdhui) > 0) {
            resultat = true;
        }

        return resultat;
    }

    public boolean verifDateFinOK(GregorianCalendar dateFin) {
        boolean resultat = false;

        if (this.verifDateOK(dateFin) && this.dateDebut != null) {
            if (dateFin.compareTo(this.dateDebut) == 1) {
                resultat = true;
            }
        }
        return resultat;
    }

    public String formatDate(int date) {
        String dateToString = "" + date;
        if (date < 10) {
            dateToString = "0" + date;

        }
        return dateToString;
    }

    public String gregorianCalendarToString(GregorianCalendar gc) {
        if (gc != null) {

            return " " + formatDate(gc.get(GregorianCalendar.DAY_OF_MONTH)) + " / "
                    + formatDate(gc.get(GregorianCalendar.MONTH) +1) + " / "                // +1 car Gregorian commence à 0 pour janvier
                            + gc.get(GregorianCalendar.YEAR);
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "CPeriodeStage{" + "idPeriodeStage=" + idPeriodeStage + ", idEtudiant=" + idEtudiant + ", idPersonnelPedagogique=" + idPersonnelPedagogique + ", idTuteurEntreprise=" + idTuteurEntreprise + ", idEntreprise=" + idEntreprise + ", dateDebut=" + this.gregorianCalendarToString(dateDebut) + ", dateFin=" + this.gregorianCalendarToString(dateFin) + ", dureeHebdomadaire=" + dureeHebdomadaire + ", etatConvention=" + etatConvention + '}';
    }

}
