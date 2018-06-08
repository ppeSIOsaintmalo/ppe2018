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
public class CContact {
    
    protected String telephone1;

    public CContact(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    @Override
    public String toString() {
        return "CContact{" + "telephone1=" + telephone1 + '}';
    }
    
    
    
}
