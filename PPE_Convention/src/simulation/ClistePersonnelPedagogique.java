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
public class ClistePersonnelPedagogique {

    public ArrayList<CPersonnelPedagogique> listePersonnelPedagogique = new ArrayList();
    public CTablePersonnelPedagogique tablePersonnelPedagogique = new CTablePersonnelPedagogique();

    public ClistePersonnelPedagogique() {
        chargerTable();
    }

    public ArrayList<CPersonnelPedagogique> getListePersonnelPedagogique() {
        return listePersonnelPedagogique;
    }

    public CPersonnelPedagogique selectionnerPersonnelPedagogique(int id) {
        for (CPersonnelPedagogique unPersonnelPedagogique : this.listePersonnelPedagogique) {
            if (unPersonnelPedagogique.getId() == id) {
                return unPersonnelPedagogique;
            }
        }
        return null;
    }

    public void chargerTable() {
        this.listePersonnelPedagogique = this.tablePersonnelPedagogique.lirePersonnelPedagogique();         // charge la liste à partir de la table de la BDD

    }

    public static void main(String[] args) {
        ClistePersonnelPedagogique liste = new ClistePersonnelPedagogique();
        liste.tablePersonnelPedagogique.lirePersonnelPedagogique();
        if (liste.selectionnerPersonnelPedagogique(1) != null) {
            System.out.println("nom : " + liste.selectionnerPersonnelPedagogique(1).getNom());
        } else {
            System.out.println("PersonnelPedagogique inexistant !");
        }
    }
}
