package gestionConvention;

import java.util.ArrayList;
import simulation.CEntreprise;
import simulation.CPersonnelPedagogique;
import simulation.CTuteurEntreprise;
import simulation.ClisteEntreprise;
import simulation.ClistePersonnelPedagogique;
import simulation.ClisteTuteurEntreprise;

public class JDialogModifierUneConvention extends javax.swing.JDialog {

    private CListePeriodesStagePersistance listePeriodeStagePersistance = new CListePeriodesStagePersistance();
    private ClistePersonnelPedagogique listePersonnelPedagogique = new ClistePersonnelPedagogique();
    private ClisteTuteurEntreprise listeTuteurEntreprise = new ClisteTuteurEntreprise();
    private ClisteEntreprise listeEntreprise = new ClisteEntreprise();
    private  int idPeriodeStage;

    public JDialogModifierUneConvention(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);   // place la fenêtre jdialog au centre
    }

    public JDialogModifierUneConvention(java.awt.Frame parent, boolean modal, int idPeriodeStage, String dateDebut, String dateFin, String nom, String entreprise, String tuteurEntreprise, String personnelPedagogique, int dureeHebdomadaire, String etatConvention) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);   // place la fenêtre jdialog au centre
        this.idPeriodeStage = idPeriodeStage;
        this.AfficherLabelNom(nom);
        this.AfficherDates(dateDebut, dateFin);
        this.AfficherjComboBoxEntreprise(entreprise);
        this.AfficherjComboBoxNomTuteurEntreprise(tuteurEntreprise);
        this.AfficherjComboBoxNomPersonnelPedagogique(personnelPedagogique);
        this.AfficherDureeHebdo(dureeHebdomadaire);
        this.AfficherEtatConvention(etatConvention);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEntreprise = new javax.swing.JLabel();
        jComboBoxEntreprise = new javax.swing.JComboBox<>();
        jLabelEtatConvention = new javax.swing.JLabel();
        jLabelTuteurEntreprise = new javax.swing.JLabel();
        jComboBoxEtatConvention = new javax.swing.JComboBox<>();
        jComboBoxNomTuteurEntreprise = new javax.swing.JComboBox<>();
        jLabelPersonnelPedagogique = new javax.swing.JLabel();
        jComboBoxNomPersonnelPedagogique = new javax.swing.JComboBox<>();
        jLabelDureeHebdomadaire = new javax.swing.JLabel();
        jLabelEtudiant = new javax.swing.JLabel();
        jTextFieldDureeHebdo = new javax.swing.JTextField();
        jLabelDateDebut = new javax.swing.JLabel();
        jButtonEnregistrerLaModification = new javax.swing.JButton();
        jLabelDateFin = new javax.swing.JLabel();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelNomEtudiant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modification d'une Convention");

        jLabelEntreprise.setText("Entreprise");

        jComboBoxEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEntrepriseActionPerformed(evt);
            }
        });

        jLabelEtatConvention.setText("Etat de la convention");

        jLabelTuteurEntreprise.setText("Tuteur de l'entreprise");

        jComboBoxEtatConvention.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non créée", "En cours", "Validée", "Non signée", "Signée" }));
        jComboBoxEtatConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEtatConventionActionPerformed(evt);
            }
        });

        jComboBoxNomTuteurEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomTuteurEntrepriseActionPerformed(evt);
            }
        });

        jLabelPersonnelPedagogique.setText("Personnel pédagogique");

        jComboBoxNomPersonnelPedagogique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomPersonnelPedagogiqueActionPerformed(evt);
            }
        });

        jLabelDureeHebdomadaire.setText("Durée hebdomadaire (en heures)");

        jLabelEtudiant.setText("Etudiant");

        jTextFieldDureeHebdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDureeHebdoActionPerformed(evt);
            }
        });

        jLabelDateDebut.setText("Date de début :");

        jButtonEnregistrerLaModification.setText("Enregistrer la modification");
        jButtonEnregistrerLaModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnregistrerLaModificationActionPerformed(evt);
            }
        });

        jLabelDateFin.setText("Date de fin : ");

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDateDebut)
                                            .addComponent(jLabelEtudiant))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelNomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEntreprise)
                                        .addGap(7, 7, 7)
                                        .addComponent(jComboBoxEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDateFin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTuteurEntreprise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxNomTuteurEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDureeHebdomadaire)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDureeHebdo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPersonnelPedagogique)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxNomPersonnelPedagogique, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonEnregistrerLaModification)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonAnnuler))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEtatConvention)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEtatConvention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEtudiant)
                    .addComponent(jLabelNomEtudiant))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateDebut)
                    .addComponent(jLabelDateFin))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntreprise)
                    .addComponent(jComboBoxEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTuteurEntreprise)
                    .addComponent(jComboBoxNomTuteurEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPersonnelPedagogique)
                    .addComponent(jComboBoxNomPersonnelPedagogique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDureeHebdomadaire)
                    .addComponent(jTextFieldDureeHebdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEtatConvention)
                    .addComponent(jComboBoxEtatConvention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnregistrerLaModification)
                    .addComponent(jButtonAnnuler))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        this.dispose();     //fermeture de la fenêtre
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jComboBoxEtatConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEtatConventionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEtatConventionActionPerformed

    private void jComboBoxNomTuteurEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomTuteurEntrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomTuteurEntrepriseActionPerformed

    private void jTextFieldDureeHebdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDureeHebdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDureeHebdoActionPerformed

    private void jComboBoxEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEntrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEntrepriseActionPerformed

    
     //Reprend l'ensemble des données selectionnées pour les traiter dans la BDD(modifier)
    private void jButtonEnregistrerLaModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnregistrerLaModificationActionPerformed
        
        int indexEntrepriseSelectionne = jComboBoxEntreprise.getSelectedIndex();
        int idEntreprise = this.listeEntreprise.getListeEntreprise().get(indexEntrepriseSelectionne).getId();

        int indexTuteurEntrepriseSelectionne = jComboBoxNomTuteurEntreprise.getSelectedIndex();
        int idTuteurEntreprise = this.listeTuteurEntreprise.getListeTuteurEntreprise().get(indexTuteurEntrepriseSelectionne).getId();

        int indexPersonnelPedagogique = jComboBoxNomPersonnelPedagogique.getSelectedIndex();
        int idPersonnelPedagogique = this.listePersonnelPedagogique.getListePersonnelPedagogique().get(indexPersonnelPedagogique).getId();

        int dureeHebdomadaire = Integer.parseInt(jTextFieldDureeHebdo.getText());

        String etatConvention = (String) jComboBoxEtatConvention.getSelectedItem();

// Intervention sur la base de données
       
        this.listePeriodeStagePersistance.modifierConvention(new CPeriodeStage(this.idPeriodeStage, idPersonnelPedagogique, idTuteurEntreprise,idEntreprise, dureeHebdomadaire, etatConvention));
      
        this.dispose();     //fermeture de la fenêtre
    }//GEN-LAST:event_jButtonEnregistrerLaModificationActionPerformed

    private void jComboBoxNomPersonnelPedagogiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomPersonnelPedagogiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomPersonnelPedagogiqueActionPerformed

//Récupère les valeurs de la table pour les afficher en preselectionné dans les label ou comboBox sur Modifier lors de la construction de l'objet
    public void AfficherLabelNom(String nom) {
        this.jLabelNomEtudiant.setText(nom);
    }

    public void AfficherDates(String DateDebut, String dateFin) { //Preremplit le calendrier de la fenêtre "ajouter une convention"
        jLabelDateDebut.setText("Date de début : " + DateDebut);
         jLabelDateFin.setText("Date de Fin : " + dateFin);
    }

    public void AfficherjComboBoxEntreprise(String entreprise) {
        ArrayList<CEntreprise> list = listeEntreprise.getListeEntreprise();

        for (int i = 0; i < list.size(); i++) {
            this.jComboBoxEntreprise.addItem(list.get(i).getNom());
            if (list.get(i).getNom().equals(entreprise)) {
                this.jComboBoxEntreprise.setSelectedIndex(i);
            }
        }

    }

    public void AfficherjComboBoxNomTuteurEntreprise(String tuteurEntreprise) {

        ArrayList<CTuteurEntreprise> list = listeTuteurEntreprise.getListeTuteurEntreprise();
        
        String nomPrenom;
        for (int i = 0; i < list.size(); i++) {
            nomPrenom = list.get(i).getNom() +" " +list.get(i).getPrenom();
            this.jComboBoxNomTuteurEntreprise.addItem(nomPrenom);
            
            if (nomPrenom.equals(tuteurEntreprise)) {
                this.jComboBoxNomTuteurEntreprise.setSelectedIndex(i);
            }
        }

    }

    public void AfficherjComboBoxNomPersonnelPedagogique(String personnelPedagogique) {
        ArrayList<CPersonnelPedagogique> list = listePersonnelPedagogique.getListePersonnelPedagogique();
        String nomPrenom;
        for (int i = 0; i < list.size(); i++) {
            nomPrenom = list.get(i).getNom() +" " +list.get(i).getPrenom();
            this.jComboBoxNomPersonnelPedagogique.addItem(nomPrenom);
            
            if (nomPrenom.equals(personnelPedagogique)) {
                this.jComboBoxNomPersonnelPedagogique.setSelectedIndex(i);
            }
        }

    }

    public void AfficherDureeHebdo(int dureeHebdomadaire) {
        this.jTextFieldDureeHebdo.setText(String.valueOf(dureeHebdomadaire));
    }
    
    
    
    public void AfficherEtatConvention(String etatConvention) {
    
        this.jComboBoxEtatConvention.setSelectedItem(etatConvention);
    }    
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogModifierUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogModifierUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogModifierUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogModifierUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogModifierUneConvention dialog = new JDialogModifierUneConvention(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonEnregistrerLaModification;
    private javax.swing.JComboBox<String> jComboBoxEntreprise;
    private javax.swing.JComboBox<String> jComboBoxEtatConvention;
    private javax.swing.JComboBox<String> jComboBoxNomPersonnelPedagogique;
    private javax.swing.JComboBox<String> jComboBoxNomTuteurEntreprise;
    private javax.swing.JLabel jLabelDateDebut;
    private javax.swing.JLabel jLabelDateFin;
    private javax.swing.JLabel jLabelDureeHebdomadaire;
    private javax.swing.JLabel jLabelEntreprise;
    private javax.swing.JLabel jLabelEtatConvention;
    private javax.swing.JLabel jLabelEtudiant;
    private javax.swing.JLabel jLabelNomEtudiant;
    private javax.swing.JLabel jLabelPersonnelPedagogique;
    private javax.swing.JLabel jLabelTuteurEntreprise;
    private javax.swing.JTextField jTextFieldDureeHebdo;
    // End of variables declaration//GEN-END:variables
}
