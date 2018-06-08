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
public class CEtudiant extends CPersonne {

    protected CSessionFormation sessionformation;
    protected CFormation formation;

   

    public CEtudiant() {
    }

    public CEtudiant(String nom, String prenom) {
        super(nom, prenom);
    }

    
    public CEtudiant(int id, String nom, String prenom) {       // ajouté par Claudia
        super(id, nom, prenom);
    }
    
    public CEtudiant(CFormation formation, String nom, String prenom) {
        super(nom, prenom);
        this.formation = formation;
    }

     public CEtudiant(CSessionFormation sessionformation, CFormation formation) {
        this.sessionformation = sessionformation;
        this.formation = formation;
    }

    public CEtudiant(CSessionFormation sessionformation, CFormation formation, String nom, String prenom) {
        super(nom, prenom);
        this.sessionformation = sessionformation;
        this.formation = formation;
    }

    
    
    public CSessionFormation getSessionformation() {
        return sessionformation;
    }

    public void setSessionformation(CSessionFormation sessionformation) {
        this.sessionformation = sessionformation;
    }

    public CFormation getFormation() {
        return formation;
    }

    public void setFormation(CFormation formation) {
        this.formation = formation;
    }

    @Override
    public String toString() {
        return "CEtudiant{" + "formation=" + formation + '}';
    }

}
