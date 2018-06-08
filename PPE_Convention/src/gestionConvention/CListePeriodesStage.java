/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionConvention;

import java.util.ArrayList;

/**
 *
 * @author stagiaire
 */
public class CListePeriodesStage {

    ArrayList<CPeriodeStage> listePeriodesStage = new ArrayList<>();

    public CListePeriodesStage() {
    }

    public ArrayList<CPeriodeStage> getListePeriodesStage() {
        return listePeriodesStage;
    }

    public void setListePeriodesStage(ArrayList<CPeriodeStage> listePeriodesStage) {
        this.listePeriodesStage = listePeriodesStage;
    }

    boolean ajouterConvention(CPeriodeStage convention) {
        return listePeriodesStage.add(convention);//renvoie true si OK
    }

    boolean mettreAJourConvention(CPeriodeStage convention) {
        for (int i = 0; i < listePeriodesStage.size(); i++) {
            if (listePeriodesStage.get(i).getIdPeriodeStage() == convention.getIdPeriodeStage()) {
                listePeriodesStage.remove(i);
                listePeriodesStage.add(i, convention);
                return true;
            }
        }
        return false;
    }

    boolean modifierConvention(CPeriodeStage convention) {
        for (int i = 0; i < listePeriodesStage.size(); i++) {
            if (listePeriodesStage.get(i).getIdPeriodeStage() == convention.getIdPeriodeStage()) {
                listePeriodesStage.remove(i);
                listePeriodesStage.add(i, convention);
                return true;
            }
        }
        return false;
    }

    ArrayList<CPeriodeStage> lireLesConventions() {
        return this.listePeriodesStage;
    }

    boolean supprimerConvention(int id) {
        for (int i = 0; i < listePeriodesStage.size(); i++) {
            if (listePeriodesStage.get(i).getIdPeriodeStage() == id) {
                listePeriodesStage.remove(i);
                return true;
            }
        }
        return false;
    }
    
    boolean supprimerToutesLesConventions() {
        for (int i = 0; i < listePeriodesStage.size(); i++) {
            
                listePeriodesStage.remove(i);
                return true;
                   }
        return false;
    }

    

    @Override
    public String toString() {
        return "CListePeriodesStage{" + "listePeriodesStage=" + listePeriodesStage + '}';
    }

}
