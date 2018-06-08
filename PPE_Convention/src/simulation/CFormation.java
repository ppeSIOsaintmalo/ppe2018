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
public class CFormation {
    
    String libelleDiplome;
    String optionDiplome;

    public CFormation() {
    }

    public CFormation(String libelleDiplome, String optionDiplome) {
        this.libelleDiplome = libelleDiplome;
        this.optionDiplome = optionDiplome;
    }

    public String getLibelleDiplome() {
        return libelleDiplome;
    }

    public void setLibelleDiplome(String libelleDiplome) {
        this.libelleDiplome = libelleDiplome;
    }

    public String getOptionDiplome() {
        return optionDiplome;
    }

    public void setOptionDiplome(String optionDiplome) {
        this.optionDiplome = optionDiplome;
    }

    @Override
    public String toString() {
        return "CFormation{" + "libelleDiplome=" + libelleDiplome + ", optionDiplome=" + optionDiplome + '}';
    }
    
    
    
}
