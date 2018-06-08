/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import gestionConvention.JFrameGestionConventions;
import java.util.ArrayList;

/**
 *
 * @author stagiaire
 */
public class CTestPS {

    public static void main(String[] args) {

        /*     CPeriodeStage stage1 = new CPeriodeStage();
        stage1.setDateDebut(2019, 4, 9);
        stage1.setDateFin(2019, 6, 15);
        System.out.println("la date du début est: " + stage1.gregorianCalendarToString(stage1.getDateDebut()));
        System.out.println("la date de fin est: " + stage1.gregorianCalendarToString(stage1.getDateFin()));

        CFormation bts = new CFormation("BTS SIO", "SLAM");
        CEtudiant claudia = new CEtudiant(bts, "Le Bournault", "Claudia");
        stage1.setEtudiant(claudia);
        System.out.println("stage 1 du " + stage1.gregorianCalendarToString(stage1.getDateDebut())
                + " au " + stage1.gregorianCalendarToString(stage1.getDateFin())
                + " pour " + stage1.getEtudiant().getNom() + " " + stage1.getEtudiant().getPrenom()
                + " en " + stage1.getEtudiant().getFormation().getLibelleDiplome() + " " + stage1.getEtudiant().getFormation().getOptionDiplome()
        );

        CPersonnelPedagogique PGreta = new CPersonnelPedagogique("Marchand", "Marie-Anne");
        stage1.setPersonnelPeda(PGreta);
        System.out.println("le stage n°1 est suivi par : " + stage1.getPersonnelPeda().getNom() + stage1.getPersonnelPeda().getPrenom());

        CTuteurEntreprise Monier = new CTuteurEntreprise("Monier", "Sylvain");
        CEntreprise lycee = new CEntreprise("Lycée Bel Air", new CAdresse("Tinténiac", 35190, 7, "rue", "Ernest Renan"), new CContact("0299680234"));
        stage1.setTuteurEntreprise(Monier); //Rappel associer l'objet Monier à stage1
        stage1.setEntreprise(lycee);
        System.out.println("Entreprise " + stage1.getEntreprise().getNom() + stage1.getEntreprise().toString());

        CCentreFormation greta = new CCentreFormation(new CAdresse("Rennes", 35069, 0, "", ""), new CContact(""));
        claudia.setSessionformation(new CSessionFormation(greta));
        System.out.println("le centre de formation se situe " + claudia.getSessionformation().getCentre());

         */
        JFrameGestionConventions ihm = new JFrameGestionConventions();
        ihm.setVisible(true);

    }

}
