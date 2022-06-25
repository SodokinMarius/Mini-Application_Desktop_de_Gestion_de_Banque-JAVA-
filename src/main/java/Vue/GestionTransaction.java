/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vue;

import Banque.Loan;
import static Banque.TP_GESTION_BANQUE.listOfTransactions;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sodyam
 */
public class GestionTransaction extends javax.swing.JFrame {

    /**
     * Creates new form GestionComptes
     */
    public GestionTransaction() {
        initComponents();
         this.displayListTransactions();
         
    }

    
     public void displayListTransactions()
    {

               DefaultTableModel model = new DefaultTableModel(new Object[]{ "Numéro  transacttion ","Compte","Montant","Type"}, 0);
              
             
        for(ArrayList <String> transaction : listOfTransactions)
        {
          
                model.addRow(new Object[]{transaction.get(0),transaction.get(1),
                    transaction.get(2),transaction.get(3)});
        }
          
          listTransactionTable.setModel(model);
        }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btn_supprimerTransaction1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_listeTransaction = new javax.swing.JButton();
        btn_supprimerTransaction = new javax.swing.JButton();
        btn_NewTransaction = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        choice_accounttype_for_transaction = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btn_supprimerTransaction2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTransactionTable = new javax.swing.JTable();
        btn_goToAccueil = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        btn_supprimerTransaction1.setBackground(new java.awt.Color(50, 143, 231));
        btn_supprimerTransaction1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_supprimerTransaction1.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimerTransaction1.setText("Supprimer");
        btn_supprimerTransaction1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_supprimerTransaction1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_supprimerTransaction1.setName("btn_menu"); // NOI18N
        btn_supprimerTransaction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerTransaction1ActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(200, 200));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("GESTION DES TRANSACTIONS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_listeTransaction.setBackground(new java.awt.Color(50, 143, 231));
        btn_listeTransaction.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_listeTransaction.setForeground(new java.awt.Color(255, 255, 255));
        btn_listeTransaction.setText("Liste");
        btn_listeTransaction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listeTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_listeTransaction.setName("btn_menu"); // NOI18N
        btn_listeTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeTransactionActionPerformed(evt);
            }
        });

        btn_supprimerTransaction.setBackground(new java.awt.Color(50, 143, 231));
        btn_supprimerTransaction.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_supprimerTransaction.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimerTransaction.setText("Annuler");
        btn_supprimerTransaction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_supprimerTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_supprimerTransaction.setName("btn_menu"); // NOI18N
        btn_supprimerTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerTransactionActionPerformed(evt);
            }
        });

        btn_NewTransaction.setBackground(new java.awt.Color(50, 143, 231));
        btn_NewTransaction.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_NewTransaction.setForeground(new java.awt.Color(255, 255, 255));
        btn_NewTransaction.setText("Nouveau");
        btn_NewTransaction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_NewTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_NewTransaction.setName("btn_menu"); // NOI18N
        btn_NewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewTransactionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(1, 231, 180));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Type  de Transaction");

        choice_accounttype_for_transaction.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        choice_accounttype_for_transaction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depôt", "Retrait", "Tout" }));
        choice_accounttype_for_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice_accounttype_for_transactionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compte");

        jComboBox2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Epargne" }));

        btn_supprimerTransaction2.setBackground(new java.awt.Color(0, 0, 0));
        btn_supprimerTransaction2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_supprimerTransaction2.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimerTransaction2.setText("Actualiser");
        btn_supprimerTransaction2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_supprimerTransaction2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_supprimerTransaction2.setName("btn_menu"); // NOI18N
        btn_supprimerTransaction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerTransaction2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice_accounttype_for_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_supprimerTransaction2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choice_accounttype_for_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_supprimerTransaction2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_listeTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btn_NewTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(btn_supprimerTransaction)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listeTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimerTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listTransactionTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listTransactionTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listTransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Compte conserné", "Montant", "Type"
            }
        ));
        listTransactionTable.setColumnSelectionAllowed(true);
        listTransactionTable.setRequestFocusEnabled(false);
        listTransactionTable.setRowHeight(40);
        jScrollPane1.setViewportView(listTransactionTable);
        listTransactionTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_goToAccueil.setBackground(new java.awt.Color(1, 231, 180));
        btn_goToAccueil.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btn_goToAccueil.setForeground(new java.awt.Color(255, 0, 0));
        btn_goToAccueil.setText("Accueil");
        btn_goToAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToAccueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_goToAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btn_goToAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_listeTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeTransactionActionPerformed
        this.displayListTransactions();
    }//GEN-LAST:event_btn_listeTransactionActionPerformed

    private void btn_supprimerTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerTransactionActionPerformed
       DeleteTransaction supprimerTransaction=new DeleteTransaction();
       supprimerTransaction.setVisible(true);
       //this.hide();
    }//GEN-LAST:event_btn_supprimerTransactionActionPerformed

    private void btn_NewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewTransactionActionPerformed
        CreateTransaction nouveauTransation=new CreateTransaction();
        nouveauTransation.setVisible(true);
        //this.hide();
    }//GEN-LAST:event_btn_NewTransactionActionPerformed

    private void choice_accounttype_for_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice_accounttype_for_transactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice_accounttype_for_transactionActionPerformed

    private void btn_supprimerTransaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerTransaction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimerTransaction1ActionPerformed

    private void btn_supprimerTransaction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerTransaction2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimerTransaction2ActionPerformed

    private void btn_goToAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToAccueilActionPerformed
 DashBoard accueil=new DashBoard();
        accueil.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btn_goToAccueilActionPerformed

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
            java.util.logging.Logger.getLogger(GestionTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NewTransaction;
    private javax.swing.JButton btn_goToAccueil;
    private javax.swing.JButton btn_listeTransaction;
    private javax.swing.JButton btn_supprimerTransaction;
    private javax.swing.JButton btn_supprimerTransaction1;
    private javax.swing.JButton btn_supprimerTransaction2;
    private javax.swing.JComboBox<String> choice_accounttype_for_transaction;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable listTransactionTable;
    // End of variables declaration//GEN-END:variables
}
