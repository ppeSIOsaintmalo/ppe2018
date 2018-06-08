/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author stagiaire
 */
public class CPersonne {
    
    private String nom;
    private String prenom;
    private int id;             //-ajout- ma recherche se fait par id, il faut penser au constructeur
    public CPersonne() {
    }

    public CPersonne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public CPersonne(int id, String nom, String prenom) {       //ma recherche se fait par id
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "CPersonne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
    
    
}
