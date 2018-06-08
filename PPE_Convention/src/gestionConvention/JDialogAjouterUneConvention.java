package gestionConvention;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import simulation.CEntreprise;
import simulation.CEtudiant;
import simulation.CPersonnelPedagogique;
import simulation.CTuteurEntreprise;
import simulation.ClisteEntreprise;
import simulation.ClisteEtudiants;
import simulation.ClistePersonnelPedagogique;
import simulation.ClisteTuteurEntreprise;

public class JDialogAjouterUneConvention extends javax.swing.JDialog {

    private CListePeriodesStagePersistance listePeriodeStagePersistance = new CListePeriodesStagePersistance();
    private ClisteEtudiants listeEtudiants = new ClisteEtudiants();
    private ClistePersonnelPedagogique listePersonnelPedagogique = new ClistePersonnelPedagogique();
    private ClisteTuteurEntreprise listeTuteurEntreprise = new ClisteTuteurEntreprise();
    private ClisteEntreprise listeEntreprise = new ClisteEntreprise();

    public JDialogAjouterUneConvention(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);   // place la fenêtre jdialog au centre
        this.AfficherComboEtudiants();
        this.AfficherDateAujourdhui();
        this.AfficherjComboBoxEntreprise();
        this.AfficherjComboBoxNomTuteurEntreprise();
        this.AfficherjComboBoxNomPersonnelPedagogique();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jComboBoxNomEtudiant = new javax.swing.JComboBox<>();
        jLabelDateDebut = new javax.swing.JLabel();
        jButtonAjouterUneConvention = new javax.swing.JButton();
        jLabelDateFin = new javax.swing.JLabel();
        jButtonAnnuler = new javax.swing.JButton();
        jDateChooserDebut = new com.toedter.calendar.JDateChooser();
        jDateChooserFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Création d'une Convention");

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

        jLabelDureeHebdomadaire.setText("Durée hebdomadaire (en heures)");

        jLabelEtudiant.setText("Etudiant");

        jTextFieldDureeHebdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDureeHebdoActionPerformed(evt);
            }
        });

        jComboBoxNomEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomEtudiantActionPerformed(evt);
            }
        });

        jLabelDateDebut.setText("Date de début");

        jButtonAjouterUneConvention.setText("Ajouter la Convention");
        jButtonAjouterUneConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterUneConventionActionPerformed(evt);
            }
        });

        jLabelDateFin.setText("Date de fin");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDateDebut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooserDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEntreprise)
                                        .addGap(7, 7, 7)
                                        .addComponent(jComboBoxEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDateFin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTuteurEntreprise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxNomTuteurEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDureeHebdomadaire)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDureeHebdo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEtudiant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxNomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPersonnelPedagogique)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxNomPersonnelPedagogique, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonAjouterUneConvention)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonAnnuler))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEtatConvention)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEtatConvention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxNomEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEtudiant))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDateDebut)
                                .addComponent(jLabelDateFin))
                            .addComponent(jDateChooserDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jButtonAjouterUneConvention)
                    .addComponent(jButtonAnnuler))
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void jComboBoxNomEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomEtudiantActionPerformed

    }//GEN-LAST:event_jComboBoxNomEtudiantActionPerformed

    
    //Reprend l'ensemble des données selectionnées pour les traiter dans la BDD(ajouter)
    private void jButtonAjouterUneConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterUneConventionActionPerformed
         
        int indexEtudiantSelectionne = jComboBoxNomEtudiant.getSelectedIndex(); 
        int idEtudiant = this.listeEtudiants.getListeEtudiants().get(indexEtudiantSelectionne).getId();
       
        GregorianCalendar dateDebutGc = new GregorianCalendar();
        dateDebutGc.setTime(jDateChooserDebut.getDate());
       
        GregorianCalendar dateFinGc = new GregorianCalendar();
        dateFinGc.setTime(jDateChooserFin.getDate());
        
        int indexEntrepriseSelectionne = jComboBoxEntreprise.getSelectedIndex();
        int idEntreprise = this.listeEntreprise.getListeEntreprise().get(indexEntrepriseSelectionne).getId();
       
        int indexTuteurEntrepriseSelectionne = jComboBoxNomTuteurEntreprise.getSelectedIndex();
        int idTuteurEntreprise = this.listeTuteurEntreprise.getListeTuteurEntreprise().get(indexTuteurEntrepriseSelectionne).getId();
        
        int indexPersonnelPedagogique = jComboBoxNomPersonnelPedagogique.getSelectedIndex();
        int idPersonnelPedagogique = this.listePersonnelPedagogique.getListePersonnelPedagogique().get(indexPersonnelPedagogique).getId();
        
        int dureeHebdomadaire = Integer.parseInt(jTextFieldDureeHebdo.getText());
       
        String etatConvention = (String) jComboBoxEtatConvention.getSelectedItem();
       
// Intervention sur la base de données
        this.listePeriodeStagePersistance.ajouterConvention(new CPeriodeStage(-1, idEtudiant, idPersonnelPedagogique, idTuteurEntreprise, idEntreprise, dateDebutGc, dateFinGc, dureeHebdomadaire, etatConvention));
          
        this.dispose();     //fermeture de la fenêtre
    }//GEN-LAST:event_jButtonAjouterUneConventionActionPerformed

//Méthodes qui permettent d'afficher l'ensemble des elements sur les listes déroulantes
    public void AfficherComboEtudiants() {
        ArrayList<CEtudiant> list = listeEtudiants.getListeEtudiants();

        for (int i = 0; i < list.size(); i++) {
            this.jComboBoxNomEtudiant.addItem(list.get(i).getNom() + ' ' + list.get(i).getPrenom());
        }
    }

    public void AfficherDateAujourdhui() { //Preremplit le calendrier de la fenêtre "ajouter une convention"
        Date aujourdhui = new Date();
        jDateChooserDebut.setDate(aujourdhui);
        jDateChooserFin.setDate(aujourdhui);

    }

    public void AfficherjComboBoxEntreprise() {
        ArrayList<CEntreprise> list = listeEntreprise.getListeEntreprise();

        for (int i = 0; i < list.size(); i++) {
            this.jComboBoxEntreprise.addItem(list.get(i).getNom());
        }

    }

    public void AfficherjComboBoxNomPersonnelPedagogique() {
        ArrayList<CPersonnelPedagogique> list = listePersonnelPedagogique.getListePersonnelPedagogique();

        for (int i = 0; i < list.size(); i++) {
            this.jComboBoxNomPersonnelPedagogique.addItem(list.get(i).getNom() + ' ' + list.get(i).getPrenom());
        }

    }

    public void AfficherjComboBoxNomTuteurEntreprise() {
        ArrayList<CTuteurEntreprise> list = listeTuteurEntreprise.getListeTuteurEntreprise();

        for (int i = 0; i < list.size(); i++) {
            this.jComboBoxNomTuteurEntreprise.addItem(list.get(i).getNom() + ' ' + list.get(i).getPrenom());
        }

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDialogAjouterUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAjouterUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAjouterUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAjouterUneConvention.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDialogAjouterUneConvention dialog = new JDialogAjouterUneConvention(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAjouterUneConvention;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JComboBox<String> jComboBoxEntreprise;
    private javax.swing.JComboBox<String> jComboBoxEtatConvention;
    private javax.swing.JComboBox<String> jComboBoxNomEtudiant;
    private javax.swing.JComboBox<String> jComboBoxNomPersonnelPedagogique;
    private javax.swing.JComboBox<String> jComboBoxNomTuteurEntreprise;
    private com.toedter.calendar.JDateChooser jDateChooserDebut;
    private com.toedter.calendar.JDateChooser jDateChooserFin;
    private javax.swing.JLabel jLabelDateDebut;
    private javax.swing.JLabel jLabelDateFin;
    private javax.swing.JLabel jLabelDureeHebdomadaire;
    private javax.swing.JLabel jLabelEntreprise;
    private javax.swing.JLabel jLabelEtatConvention;
    private javax.swing.JLabel jLabelEtudiant;
    private javax.swing.JLabel jLabelPersonnelPedagogique;
    private javax.swing.JLabel jLabelTuteurEntreprise;
    private javax.swing.JTextField jTextFieldDureeHebdo;
    // End of variables declaration//GEN-END:variables
}