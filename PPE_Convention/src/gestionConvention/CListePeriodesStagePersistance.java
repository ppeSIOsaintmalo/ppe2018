/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionConvention;

import gestionConvention.CListePeriodesStage;
import gestionConvention.CTablePeriodesStage;
import bdd.CParametresStockageBDD;
import bdd.CBDD;
import java.util.ArrayList;

/**
 *
 * @author stagiaire
 */
public class CListePeriodesStagePersistance extends CListePeriodesStage {

    public CTablePeriodesStage tablePeriodesStage = null;

    public CListePeriodesStagePersistance() {
        this.tablePeriodesStage = new CTablePeriodesStage();
        this.chargerTable();
    }

    public void setTablePeriodesStage(CTablePeriodesStage tablePeriodesStage) {
        this.tablePeriodesStage = tablePeriodesStage;
    }

    public boolean ajouterConvention(CPeriodeStage convention) {
        if (super.ajouterConvention(convention) == false) {
            return false;
        }
        this.tablePeriodesStage.ajouterUneConvention(convention);
        this.listePeriodesStage.clear();
        this.chargerTable();
        return true;
    }

    public boolean mettreAJourConvention(CPeriodeStage convention) {
        if (super.mettreAJourConvention(convention) == false) {
            return false;
        }
        this.tablePeriodesStage.mettreAJourConvention(convention);
        return true;

    }

    public boolean modifierConvention(CPeriodeStage convention) {
        if (super.modifierConvention(convention) == false) {
            return false;
        }
        this.tablePeriodesStage.modifierConvention(convention);
        return true;

    }

    public boolean supprimerConvention(int id) {
        if (super.supprimerConvention(id) == false) {
            return false;
        }
        this.tablePeriodesStage.supprimerConvention(id);
        return true;
    }

    public boolean supprimerToutesLesConventions() {
        if (super.supprimerToutesLesConventions() == false) {
            return false;
        }
        this.tablePeriodesStage.supprimerToutesLesConventions();
        return true;
    }

    public void chargerTable() {
        super.listePeriodesStage = this.tablePeriodesStage.lireLesConventions();

    }

    public static void main(String[] args) {
        CBDD bdd = new CBDD(new CParametresStockageBDD("parametresBdd.properties"));
        CTablePeriodesStage tableperiodesstages = new CTablePeriodesStage();
        tableperiodesstages.setBdd(bdd);

        CListePeriodesStagePersistance liste = new CListePeriodesStagePersistance();
        liste.setTablePeriodesStage(tableperiodesstages);
        liste.tablePeriodesStage.setBdd(bdd);
        ArrayList<CPeriodeStage> listeConvention = liste.tablePeriodesStage.lireLesConventions();
        liste.chargerTable();
    }

}
