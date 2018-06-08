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
public class CSessionFormation {
    
    protected CCentreFormation centre;

    public CSessionFormation() {
    }

    public CSessionFormation(CCentreFormation centre) {
        this.centre = centre;
    }

    public CCentreFormation getCentre() {
        return centre;
    }

    public void setCentre(CCentreFormation centre) {
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "CSessionFormation{" + "centre=" + centre + '}';
    }
    
    
    
    
}
