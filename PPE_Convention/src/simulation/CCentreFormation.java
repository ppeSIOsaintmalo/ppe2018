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
public class CCentreFormation {
    protected CAdresse adresse;
    protected CContact contact;

    public CCentreFormation() {
    }

    public CCentreFormation(CAdresse adresse, CContact contact) {
        this.adresse = adresse;
        this.contact = contact;
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
        return "CCentreFormation{" + "adresse=" + adresse + ", contact=" + contact + '}';
    }
    
    
    
    
}
