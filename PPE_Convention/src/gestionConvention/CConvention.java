/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionConvention;

import gestionConvention.CPeriodeStage;

/**
 *
 * @author stagiaire
 */
public class CConvention {
    
    protected CPeriodeStage periodeStage;

    public CConvention() {
    }

        
    public CConvention(CPeriodeStage periodeStage) {
        this.periodeStage = periodeStage;
    }
        

    public CPeriodeStage getPeriodeStage() {
        return periodeStage;
    }

    public void setPeriodeStage(CPeriodeStage periodeStage) {
        this.periodeStage = periodeStage;
    }

    @Override
    public String toString() {
        return "CConvention{" + "periodeStage=" + periodeStage + '}';
    }
    
    
    
}
