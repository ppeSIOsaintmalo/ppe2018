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
public class ClisteEntreprise {

    public ArrayList<CEntreprise> listeEntreprise = new ArrayList();
    public CTableEntreprise tableEntreprise = new CTableEntreprise();

    public ClisteEntreprise() {
        chargerTable();
    }

    public ArrayList<CEntreprise> getListeEntreprise() {
        return listeEntreprise;
    }

    public CEntreprise selectionnerEntreprise(int id) {
        for (CEntreprise uneEntreprise : this.listeEntreprise) {
            if (uneEntreprise.getId() == id) {
                return uneEntreprise;
            }
        }
        return null;
    }

    public void chargerTable() {
        this.listeEntreprise = this.tableEntreprise.lireEntreprise();         // charge la liste à partir de la table de la BDD

    }

    public static void main(String[] args) {
        ClisteEntreprise liste = new ClisteEntreprise();
        liste.tableEntreprise.lireEntreprise();
        if (liste.selectionnerEntreprise(1) != null) {
            System.out.println("nom : " + liste.selectionnerEntreprise(1).getNom());
        } else {
            System.out.println("Entreprise inexistante !");
        }
    }
}
