package gestionConvention;

import simulation.CEntreprise;
import simulation.CEtudiant;
import simulation.CPersonnelPedagogique;
import simulation.CTuteurEntreprise;
import simulation.ClisteEntreprise;
import simulation.ClisteEtudiants;
import simulation.ClistePersonnelPedagogique;
import simulation.ClisteTuteurEntreprise;
import gestionConvention.CPeriodeStage;
import gestionConvention.CListePeriodesStagePersistance;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFrameGestionConventions extends javax.swing.JFrame {

    private CListePeriodesStagePersistance listePeriodeStagePersistance = new CListePeriodesStagePersistance();
    private ClisteEtudiants listeEtudiants = new ClisteEtudiants();
    private ClistePersonnelPedagogique listePersonnelPedagogique = new ClistePersonnelPedagogique();
    private ClisteTuteurEntreprise listeTuteurEntreprise = new ClisteTuteurEntreprise();
    private ClisteEntreprise listeEntreprise = new ClisteEntreprise();

    public JFrameGestionConventions() {
        initComponents();
        this.setLocationRelativeTo(null);   // place la fenêtre jdialog au centre        
        //commandes poour masquer la colonne contenant l'id de la convention pour l'affichage (la colonne reste active)
        int idColonne = 0;
        jTable.getColumnModel().getColumn(idColonne).setMaxWidth(0);
        jTable.getColumnModel().getColumn(idColonne).setMinWidth(0);
        jTable.getColumnModel().getColumn(idColonne).setPreferredWidth(0);

        this.afficherInfoConventions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupTable = new javax.swing.JPopupMenu();
        jMenuModifierConvention = new javax.swing.JMenuItem();
        jMenuGenererPDF = new javax.swing.JMenuItem();
        jMenuImprimerConvention = new javax.swing.JMenuItem();
        jMenuSupprimer = new javax.swing.JMenuItem();
        jButtonAjouterConvention = new javax.swing.JButton();
        jButtonSupprimerConventions = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jMenuModifierConvention.setText("Modifier une convention");
        jMenuModifierConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModifierConventionActionPerformed(evt);
            }
        });
        jPopupTable.add(jMenuModifierConvention);

        jMenuGenererPDF.setText("Générer PDF");
        jPopupTable.add(jMenuGenererPDF);

        jMenuImprimerConvention.setText("ImprimerConvention");
        jPopupTable.add(jMenuImprimerConvention);

        jMenuSupprimer.setText("Supprimer Convention");
        jMenuSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSupprimerActionPerformed(evt);
            }
        });
        jPopupTable.add(jMenuSupprimer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des conventions");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));

        jButtonAjouterConvention.setText("Ajouter une Convention");
        jButtonAjouterConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterConventionActionPerformed(evt);
            }
        });

        jButtonSupprimerConventions.setText("Supprimer toutes les conventions");
        jButtonSupprimerConventions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerConventionsActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Etudiant", "Date Début", "Date Fin", "Entreprise", "Tuteur Entreprise", "Personnel Pedagogique", "Durée Hebdomadaire", "Etat"
            }
        ));
        jTable.setComponentPopupMenu(jPopupTable);
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButtonAjouterConvention)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSupprimerConventions)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouterConvention)
                    .addComponent(jButtonSupprimerConventions))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSupprimerActionPerformed

    private void jButtonAjouterConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterConventionActionPerformed
        new JDialogAjouterUneConvention(this, true).setVisible(true);
        this.actualiserJTable();
    }//GEN-LAST:event_jButtonAjouterConventionActionPerformed

//Récupère les données sélectionnées sur le jtable pour les passer à JdialogModifier
    private void jMenuModifierConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModifierConventionActionPerformed
        int ligneSelectionnee = this.jTable.getSelectedRow();                   //Récupere la ligne selectionée de la table

        int idPeriodeStage = (int) this.jTable.getValueAt(ligneSelectionnee, 0);
        String nom = (String) this.jTable.getValueAt(ligneSelectionnee, 1);
        String dateDebut = (String) this.jTable.getValueAt(ligneSelectionnee, 2);
        String dateFin = (String) this.jTable.getValueAt(ligneSelectionnee, 3);
        String entreprise = (String) this.jTable.getValueAt(ligneSelectionnee, 4);
        String tuteurEntreprise = (String) this.jTable.getValueAt(ligneSelectionnee, 5);
        String personnelPedagogique = (String) this.jTable.getValueAt(ligneSelectionnee, 6);
        int dureeHebdomadaire = (int) this.jTable.getValueAt(ligneSelectionnee, 7);
        String etatConvention = (String) this.jTable.getValueAt(ligneSelectionnee, 8);

        new JDialogModifierUneConvention(this, true, idPeriodeStage, nom, dateDebut, dateFin, entreprise, tuteurEntreprise, personnelPedagogique, dureeHebdomadaire, etatConvention).setVisible(true);
        this.actualiserJTable();
    }//GEN-LAST:event_jMenuModifierConventionActionPerformed

    private void jButtonSupprimerConventionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerConventionsActionPerformed
// Intervention sur la base de données
        this.listePeriodeStagePersistance.supprimerToutesLesConventions();
        this.actualiserJTable();

    }//GEN-LAST:event_jButtonSupprimerConventionsActionPerformed
//Complète le jTable avec toutes les informations de la BDD

    public void afficherInfoConventions() {
        ArrayList<CPeriodeStage> list = listePeriodeStagePersistance.getListePeriodesStage();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        Object[] row = new Object[9];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdPeriodeStage();

            int idEtudiant = list.get(i).getIdEtudiant();
            CEtudiant etudiant = this.listeEtudiants.selectionnerEtudiant(idEtudiant);
            if (etudiant != null) {
                row[1] = this.listeEtudiants.selectionnerEtudiant(idEtudiant).getNom() + ' '
                        + this.listeEtudiants.selectionnerEtudiant(idEtudiant).getPrenom();
            } else {
                row[1] = idEtudiant;
            }
            row[2] = list.get(i).getDateDebutToString();
            row[3] = list.get(i).getDateFinToString();

            int idEntreprise = list.get(i).getIdEntreprise();
            CEntreprise entreprise = this.listeEntreprise.selectionnerEntreprise(idEntreprise);
            if (entreprise != null) {
                row[4] = this.listeEntreprise.selectionnerEntreprise(idEntreprise).getNom();
            } else {
                row[4] = idEntreprise;
            }

            int idTuteurEntreprise = list.get(i).getIdTuteurEntreprise();
            CTuteurEntreprise tuteurEntreprise = this.listeTuteurEntreprise.selectionnerTuteurEntreprise(idTuteurEntreprise);
            if (tuteurEntreprise != null) {
                row[5] = this.listeTuteurEntreprise.selectionnerTuteurEntreprise(idTuteurEntreprise).getNom() + ' '
                        + this.listeTuteurEntreprise.selectionnerTuteurEntreprise(idTuteurEntreprise).getPrenom();
            } else {
                row[5] = idTuteurEntreprise;
            }

            int idPersonnelPedagogique = list.get(i).getIdPersonnelPedagogique();
            CPersonnelPedagogique PersonnelPedagogique = this.listePersonnelPedagogique.selectionnerPersonnelPedagogique(idPersonnelPedagogique);
            if (PersonnelPedagogique != null) {
                row[6] = this.listePersonnelPedagogique.selectionnerPersonnelPedagogique(idPersonnelPedagogique).getNom() + ' '
                        + this.listePersonnelPedagogique.selectionnerPersonnelPedagogique(idPersonnelPedagogique).getPrenom();
            } else {
                row[6] = idPersonnelPedagogique;
            }

            row[7] = list.get(i).getDureeHebdomadaire();
            row[8] = list.get(i).getEtatConvention();
            model.addRow(row);

        }

    }

    public void actualiserJTable() {
        this.listePeriodeStagePersistance.chargerTable();       // on recharge la table pour la mettre à jour
        DefaultTableModel model = (DefaultTableModel) this.jTable.getModel();
        model.setRowCount(0);
        this.afficherInfoConventions();
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
            java.util.logging.Logger.getLogger(JFrameGestionConventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionConventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionConventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionConventions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestionConventions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouterConvention;
    private javax.swing.JButton jButtonSupprimerConventions;
    private javax.swing.JMenuItem jMenuGenererPDF;
    private javax.swing.JMenuItem jMenuImprimerConvention;
    private javax.swing.JMenuItem jMenuModifierConvention;
    private javax.swing.JMenuItem jMenuSupprimer;
    private javax.swing.JPopupMenu jPopupTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
