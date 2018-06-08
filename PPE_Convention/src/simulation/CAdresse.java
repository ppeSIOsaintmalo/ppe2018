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
public class CAdresse {
    
    protected String commune;
    protected int codePostal;
    protected int numeroVoie;
    protected String typeVoie;
    protected String nomVoie;

    public CAdresse() {
    }

    public CAdresse(String commune, int codePostal, int numeroVoie, String typeVoie, String nomVoie) {
        this.commune = commune;
        this.codePostal = codePostal;
        this.numeroVoie = numeroVoie;
        this.typeVoie = typeVoie;
        this.nomVoie = nomVoie;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(int numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    @Override
    public String toString() {
        return "CAdresse{" + "commune=" + commune + ", codePostal=" + codePostal + ", numeroVoie=" + numeroVoie + ", typeVoie=" + typeVoie + ", nomVoie=" + nomVoie + '}';
    }
    
    
    
    
    
    
}
