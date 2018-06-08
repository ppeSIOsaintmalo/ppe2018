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
public class CEntreprise {
    
    protected int id;   
    protected String nom;
    protected CAdresse adresse;
    protected CContact contact;

    public CEntreprise() {
    }

    public CEntreprise(String nom, CAdresse adresse, CContact contact) {
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public CEntreprise(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
        
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public CAdresse getAdresse() {
        return adresse;
    }

    public void setAdresse(CAdresse adresse) {
        this.adresse = adresse;
    }

    public CContact getContact() {
        return contact;
    }

    public void setContact(CContact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CEntreprise{" + "nom=" + nom + ", adresse=" + adresse + ", contact=" + contact + '}';
    }
    
    
    
}
