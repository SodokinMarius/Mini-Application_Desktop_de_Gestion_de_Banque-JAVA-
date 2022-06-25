/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vue;

import Banque.BankAccount;
import Banque.NormalAccount;
import Banque.OwnerCompte;
import Banque.SparingAccount;
import static Banque.TP_GESTION_BANQUE.listOfBanks;
import static Banque.TP_GESTION_BANQUE.listOfOwners;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sodyam
 */
public class GestionComptes extends javax.swing.JFrame {

     
    /**
     * Creates new form GestionComptes
     */
    public GestionComptes() {
        initComponents();
        
              
        this.displayListComptes();
        addListOfAccoutInCombobox(choice_list_account);
        
   
    }

    public static void addListOfAccoutInCombobox(javax.swing.JComboBox<String> combo)
    
    {
        int i;
        for(i=0;i<listOfBanks.size();i++)
        {
            int number=i+1;
            combo.addItem(Integer.toString(number));
        }
        i++;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_listeCompte = new javax.swing.JButton();
        btn_supprimer_compte = new javax.swing.JButton();
        btn_new_compte = new javax.swing.JButton();
        btn_modifier_compte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listComptesTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        choiceAcount_type = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        choice_list_account = new javax.swing.JComboBox<>();
        btn_refreshTransaction2 = new javax.swing.JButton();
        btn_retour_accueil = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(200, 200));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("GESTION DES COMPTES");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_listeCompte.setBackground(new java.awt.Color(50, 143, 231));
        btn_listeCompte.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_listeCompte.setForeground(new java.awt.Color(255, 255, 255));
        btn_listeCompte.setText("Liste");
        btn_listeCompte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listeCompte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_listeCompte.setName("btn_menu"); // NOI18N
        btn_listeCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeCompteActionPerformed(evt);
            }
        });

        btn_supprimer_compte.setBackground(new java.awt.Color(50, 143, 231));
        btn_supprimer_compte.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_supprimer_compte.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimer_compte.setText("Supprimer");
        btn_supprimer_compte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_supprimer_compte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_supprimer_compte.setName("btn_menu"); // NOI18N
        btn_supprimer_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimer_compteActionPerformed(evt);
            }
        });

        btn_new_compte.setBackground(new java.awt.Color(50, 143, 231));
        btn_new_compte.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_new_compte.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_compte.setText("Nouveau");
        btn_new_compte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_new_compte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_new_compte.setName("btn_menu"); // NOI18N
        btn_new_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_compteActionPerformed(evt);
            }
        });

        btn_modifier_compte.setBackground(new java.awt.Color(50, 143, 231));
        btn_modifier_compte.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_modifier_compte.setForeground(new java.awt.Color(255, 255, 255));
        btn_modifier_compte.setText("Modifier");
        btn_modifier_compte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_modifier_compte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_modifier_compte.setName("btn_menu"); // NOI18N
        btn_modifier_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifier_compteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_listeCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_new_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btn_modifier_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btn_supprimer_compte)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listeCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        listComptesTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listComptesTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listComptesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Solde", "Taux Interêt", "Proprietaire"
            }
        ));
        listComptesTable.setColumnSelectionAllowed(true);
        listComptesTable.setRequestFocusEnabled(false);
        listComptesTable.setRowHeight(40);
        jScrollPane1.setViewportView(listComptesTable);
        listComptesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel3.setBackground(new java.awt.Color(1, 231, 180));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Type  de Compte");

        choiceAcount_type.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        choiceAcount_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Epargne", "Tout" }));
        choiceAcount_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAcount_typeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compte n°");

        choice_list_account.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        btn_refreshTransaction2.setBackground(new java.awt.Color(0, 0, 0));
        btn_refreshTransaction2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_refreshTransaction2.setForeground(new java.awt.Color(255, 255, 255));
        btn_refreshTransaction2.setText("Actualiser");
        btn_refreshTransaction2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refreshTransaction2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_refreshTransaction2.setName("btn_menu"); // NOI18N
        btn_refreshTransaction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshTransaction2ActionPerformed(evt);
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
                .addComponent(choiceAcount_type, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice_list_account, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refreshTransaction2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choiceAcount_type, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choice_list_account, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_refreshTransaction2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_retour_accueil.setBackground(new java.awt.Color(1, 231, 180));
        btn_retour_accueil.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_retour_accueil.setForeground(new java.awt.Color(255, 255, 255));
        btn_retour_accueil.setText("Accueil");
        btn_retour_accueil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_retour_accueil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_retour_accueil.setName("btn_menu"); // NOI18N
        btn_retour_accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retour_accueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_retour_accueil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_retour_accueil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_refreshTransaction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshTransaction2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refreshTransaction2ActionPerformed

    private void choiceAcount_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAcount_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAcount_typeActionPerformed

    private void btn_modifier_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifier_compteActionPerformed
        ChangeAccount modifierAccount=new ChangeAccount();
        modifierAccount.setVisible(true);
    }//GEN-LAST:event_btn_modifier_compteActionPerformed

    private void btn_new_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_compteActionPerformed
       CreateAccount newAccount=new CreateAccount();
       newAccount.setVisible(true);
      //this.hide();
    }//GEN-LAST:event_btn_new_compteActionPerformed

    private void btn_supprimer_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimer_compteActionPerformed
//  this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimer_compteActionPerformed

    private void btn_listeCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeCompteActionPerformed
         this.displayListComptes();
    }//GEN-LAST:event_btn_listeCompteActionPerformed

    private void btn_retour_accueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retour_accueilActionPerformed
        DashBoard accueil=new DashBoard();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_retour_accueilActionPerformed

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
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionComptes().setVisible(true);
            }
        });
    }
    
         //fonctionnqui affiche la liste
    public void displayListComptes()
    {
    //                    compte=new SparingAccount(owner, account_number,account_solde,interest);

               DefaultTableModel model = new DefaultTableModel(new Object[]{ "Numéro du Compte","Solde","Taux Interet","Proprietaire"}, 0);
              
           int i=0;   
        for(Object compte : listOfBanks)
        {
         
                model.addRow(new Object[]{i+1,((BankAccount) compte).getSolde(),
                    ((BankAccount) compte).getTauxInteret(),
                    listOfOwners.get(((BankAccount) compte).getProprietaire()-1).getName()+" "+listOfOwners.get(((BankAccount) compte).getProprietaire()-1).getSurname()});
        
            
        
          i++;
        }
          listComptesTable.setModel(model);

         }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_listeCompte;
    private javax.swing.JButton btn_modifier_compte;
    private javax.swing.JButton btn_new_compte;
    private javax.swing.JButton btn_refreshTransaction2;
    private javax.swing.JButton btn_retour_accueil;
    private javax.swing.JButton btn_supprimer_compte;
    private javax.swing.JComboBox<String> choiceAcount_type;
    private javax.swing.JComboBox<String> choice_list_account;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable listComptesTable;
    // End of variables declaration//GEN-END:variables
}
