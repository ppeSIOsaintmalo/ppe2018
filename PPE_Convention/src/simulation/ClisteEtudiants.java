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
public class ClisteEtudiants {

    public ArrayList<CEtudiant> listeEtudiants = new ArrayList();
    public CTableEtudiants tableEtudiants = new CTableEtudiants();

    public ClisteEtudiants() {
        chargerTable();
    }

    public ArrayList<CEtudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public CEtudiant selectionnerEtudiant(int id) {
        for (CEtudiant unEtudiant : this.listeEtudiants) {
            if (unEtudiant.getId() == id) {
                return unEtudiant;
            }
        }
        return null;
    }

    public void chargerTable() {
        this.listeEtudiants = this.tableEtudiants.lireEtudiants();         // charge la liste à partir de la table de la BDD

    }

    public static void main(String[] args) {
        ClisteEtudiants liste = new ClisteEtudiants();
        liste.tableEtudiants.lireEtudiants();
        if (liste.selectionnerEtudiant(1) != null) {
            System.out.println("nom : " + liste.selectionnerEtudiant(1).getNom());
        } else {
            System.out.println("etudiant inexistant !");
        }
    }
}
