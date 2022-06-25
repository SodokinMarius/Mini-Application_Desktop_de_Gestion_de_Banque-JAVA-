/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vue;

import Banque.Loan;
import Banque.NormalAccount;
import static Banque.NormalAccount.listOfLoans;
import Banque.SparingAccount;
import static Banque.TP_GESTION_BANQUE.listOfBanks;
import static Banque.TP_GESTION_BANQUE.listOfOwners;
import static Vue.GestionComptes.addListOfAccoutInCombobox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sodyam
 */
public class GestionLoans extends javax.swing.JFrame {

    /**
     * Creates new form GestionComptes
     */
    public GestionLoans() {
        initComponents();
        
        this.displayListLoans();
        addListOfAccoutInCombobox(account_number);
    }

       public void displayListLoans()
    {

               DefaultTableModel model = new DefaultTableModel(new Object[]{ "Numéro du Prêt","Montant","Mensualité","Compte"}, 0);
              
             
      int i=0;
        for(Loan loan : listOfLoans)
        {
          
                model.addRow(new Object[]{i+1,loan.getAmount(),
                    loan.getMensuality(),loan.getCompte().getProprietaire()});
        }
          
          listLoansTable.setModel(model);
        }

         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btn_supprimerTransaction1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_listeEmprunts = new javax.swing.JButton();
        btn_rembourserEmprunt = new javax.swing.JButton();
        btn_NewEmprunt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        account_number = new javax.swing.JComboBox<>();
        btn_actualiser_Emprunt = new javax.swing.JButton();
        btn_modifierEmprunt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLoansTable = new javax.swing.JTable();
        btn_goto_accueil = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(200, 200));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("GESTION DES EMPRUNTS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_listeEmprunts.setBackground(new java.awt.Color(50, 143, 231));
        btn_listeEmprunts.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_listeEmprunts.setForeground(new java.awt.Color(255, 255, 255));
        btn_listeEmprunts.setText("Liste");
        btn_listeEmprunts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listeEmprunts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_listeEmprunts.setName("btn_menu"); // NOI18N
        btn_listeEmprunts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeEmpruntsActionPerformed(evt);
            }
        });

        btn_rembourserEmprunt.setBackground(new java.awt.Color(50, 143, 231));
        btn_rembourserEmprunt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_rembourserEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        btn_rembourserEmprunt.setText("Rembourser");
        btn_rembourserEmprunt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_rembourserEmprunt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_rembourserEmprunt.setName("btn_menu"); // NOI18N
        btn_rembourserEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rembourserEmpruntActionPerformed(evt);
            }
        });

        btn_NewEmprunt.setBackground(new java.awt.Color(50, 143, 231));
        btn_NewEmprunt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_NewEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        btn_NewEmprunt.setText("Nouveau");
        btn_NewEmprunt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_NewEmprunt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_NewEmprunt.setName("btn_menu"); // NOI18N
        btn_NewEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewEmpruntActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(1, 231, 180));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compte ");

        account_number.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        btn_actualiser_Emprunt.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualiser_Emprunt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_actualiser_Emprunt.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualiser_Emprunt.setText("Actualiser");
        btn_actualiser_Emprunt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualiser_Emprunt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_actualiser_Emprunt.setName("btn_menu"); // NOI18N
        btn_actualiser_Emprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualiser_EmpruntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(account_number, 0, 155, Short.MAX_VALUE)
                .addGap(104, 104, 104)
                .addComponent(btn_actualiser_Emprunt)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualiser_Emprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_modifierEmprunt.setBackground(new java.awt.Color(50, 143, 231));
        btn_modifierEmprunt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_modifierEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        btn_modifierEmprunt.setText("Modifier");
        btn_modifierEmprunt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_modifierEmprunt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_modifierEmprunt.setName("btn_menu"); // NOI18N
        btn_modifierEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierEmpruntActionPerformed(evt);
            }
        });

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
                .addComponent(btn_listeEmprunts, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btn_NewEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_rembourserEmprunt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modifierEmprunt)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listeEmprunts, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rembourserEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifierEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listLoansTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listLoansTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listLoansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Montant", "Mensualités", "Compte partenaire"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listLoansTable.setColumnSelectionAllowed(true);
        listLoansTable.setRequestFocusEnabled(false);
        listLoansTable.setRowHeight(40);
        jScrollPane1.setViewportView(listLoansTable);
        listLoansTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_goto_accueil.setBackground(new java.awt.Color(1, 231, 180));
        btn_goto_accueil.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_goto_accueil.setForeground(new java.awt.Color(255, 0, 0));
        btn_goto_accueil.setText("Accueil");
        btn_goto_accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goto_accueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_goto_accueil, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_goto_accueil, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_listeEmpruntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeEmpruntsActionPerformed
    this.displayListLoans();
    }//GEN-LAST:event_btn_listeEmpruntsActionPerformed

    private void btn_rembourserEmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rembourserEmpruntActionPerformed
        ReimburseLoan     rembourser=new ReimburseLoan();
        rembourser.setVisible(true);
        //this.hide();
    }//GEN-LAST:event_btn_rembourserEmpruntActionPerformed

    private void btn_NewEmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewEmpruntActionPerformed
    CreateLoan nouveauPret=new CreateLoan();
    nouveauPret.setVisible(true);
   // this.hide();

    }//GEN-LAST:event_btn_NewEmpruntActionPerformed

    private void btn_supprimerTransaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerTransaction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimerTransaction1ActionPerformed

    private void btn_actualiser_EmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualiser_EmpruntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualiser_EmpruntActionPerformed

    private void btn_modifierEmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierEmpruntActionPerformed
ChangeLoan modifierLoan=new ChangeLoan();
    modifierLoan.setVisible(true);
    //this.hide();
    }//GEN-LAST:event_btn_modifierEmpruntActionPerformed

    private void btn_goto_accueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goto_accueilActionPerformed
 DashBoard accueil=new DashBoard();
        accueil.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btn_goto_accueilActionPerformed

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
            java.util.logging.Logger.getLogger(GestionLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionLoans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> account_number;
    private javax.swing.JButton btn_NewEmprunt;
    private javax.swing.JButton btn_actualiser_Emprunt;
    private javax.swing.JButton btn_goto_accueil;
    private javax.swing.JButton btn_listeEmprunts;
    private javax.swing.JButton btn_modifierEmprunt;
    private javax.swing.JButton btn_rembourserEmprunt;
    private javax.swing.JButton btn_supprimerTransaction1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable listLoansTable;
    // End of variables declaration//GEN-END:variables
}
