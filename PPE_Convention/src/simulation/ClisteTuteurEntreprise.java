/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.util.ArrayList;

/**
 *
 * @author stagiaire
 */
public class ClisteTuteurEntreprise {

    public ArrayList<CTuteurEntreprise> listeTuteurEntreprise = new ArrayList();
    public CTableTuteurEntreprise tableTuteurEntreprise = new CTableTuteurEntreprise();

    public ClisteTuteurEntreprise() {
        chargerTable();
    }

    public ArrayList<CTuteurEntreprise> getListeTuteurEntreprise() {
        return listeTuteurEntreprise;
    }

    public CTuteurEntreprise selectionnerTuteurEntreprise(int id) {
        for (CTuteurEntreprise unTuteurEntreprise : this.listeTuteurEntreprise) {
            if (unTuteurEntreprise.getId() == id) {
                return unTuteurEntreprise;
            }
        }
        return null;
    }

    public void chargerTable() {
        this.listeTuteurEntreprise = this.tableTuteurEntreprise.lireTuteurEntreprise();         // charge la liste à partir de la table de la BDD

    }

    public static void main(String[] args) {
        ClisteTuteurEntreprise liste = new ClisteTuteurEntreprise();
        liste.tableTuteurEntreprise.lireTuteurEntreprise();
        if (liste.selectionnerTuteurEntreprise(1) != null) {
            System.out.println("nom : " + liste.selectionnerTuteurEntreprise(1).getNom());
        } else {
            System.out.println("TuteurEntreprise inexistant !");
        }
    }
}
