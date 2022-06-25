/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vue;

import Banque.BankAccount;
import Banque.Loan;
import Banque.NormalAccount;
import static Banque.NormalAccount.listOfLoans;
import Banque.OwnerCompte;
import Banque.SparingAccount;
import static Banque.TP_GESTION_BANQUE.listOfBanks;
import static Banque.TP_GESTION_BANQUE.listOfOwners;
import javax.swing.JOptionPane;

/**
 *
 * @author sodyam
 */
public class CreateAccount extends javax.swing.JFrame {
  BankAccount compte;
 
    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        loadlistofLoanInCombo(choice_owner);
    }

    
     static   public void loadlistofLoanInCombo(javax.swing.JComboBox<String>  combo)
    {
        int i=0;
        for(OwnerCompte owner : listOfOwners)    
        {
            
            int num=i+1;
            combo.addItem(Integer.toString(num));
            i++;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        choice_owner = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        choice_account_type = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        account_solde_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        account_interest_input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        account_number_input = new javax.swing.JTextField();
        choice_account_state = new javax.swing.JComboBox<>();
        btn_new_compte = new javax.swing.JButton();
        btn_new_compte1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(1, 0, 255));

        jLabel1.setFont(new java.awt.Font("Noto Mono", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENREGISTREMENT D'UN NOUVEAU COMPTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(1, 231, 180));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proprietaire");

        choice_owner.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        choice_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice_ownerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type de Compte");

        choice_account_type.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        choice_account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Epargne" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(choice_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choice_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choice_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Noto Mono", 1, 24)); // NOI18N
        jLabel4.setText("Solde Initial");

        account_solde_input.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        account_solde_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_solde_inputActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Mono", 1, 24)); // NOI18N
        jLabel5.setText("Taux d'Interêt");

        account_interest_input.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        account_interest_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_interest_inputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Mono", 1, 24)); // NOI18N
        jLabel6.setText("Compte Bloque");

        jLabel7.setFont(new java.awt.Font("Noto Mono", 1, 24)); // NOI18N
        jLabel7.setText("Numéro ");

        account_number_input.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        account_number_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_number_inputActionPerformed(evt);
            }
        });

        choice_account_state.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        choice_account_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oui", "non" }));

        btn_new_compte.setBackground(new java.awt.Color(50, 143, 231));
        btn_new_compte.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_new_compte.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_compte.setText("Enregistrer");
        btn_new_compte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_new_compte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_new_compte.setName("btn_menu"); // NOI18N
        btn_new_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_compteActionPerformed(evt);
            }
        });

        btn_new_compte1.setBackground(new java.awt.Color(50, 143, 231));
        btn_new_compte1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_new_compte1.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_compte1.setText("Annuler");
        btn_new_compte1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_new_compte1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_new_compte1.setName("btn_menu"); // NOI18N
        btn_new_compte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_compte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 173, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_new_compte1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(btn_new_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(account_number_input, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(choice_account_state, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(account_interest_input, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(account_solde_input, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_number_input, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_solde_input, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_interest_input, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_account_state, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new_compte1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice_ownerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice_ownerActionPerformed

    private void account_solde_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_solde_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_solde_inputActionPerformed

    private void account_interest_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_interest_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_interest_inputActionPerformed

    private void btn_new_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_compteActionPerformed
 /* private javax.swing.JTextField account_interest_input;
    private javax.swing.JTextField account_number_input;
    private javax.swing.JTextField account_solde_input;
    private javax.swing.JButton btn_new_compte;
    private javax.swing.JButton btn_new_compte1;
    private javax.swing.JComboBox<String> choice_account_state;
    private javax.swing.JComboBox<String> choice_account_type;
    private javax.swing.JComboBox<String> choice_owner;
    private javax.swing.JLabel jLabel1;    */
  
 try
 {
       Double interest=Double.parseDouble(account_interest_input.getText());
   Double account_solde=Double.parseDouble(account_solde_input.getText());
   
   String account_type=choice_account_type.getSelectedItem().toString();
   String account_state=choice_account_state.getSelectedItem().toString();
   Integer owner=Integer.parseInt(choice_owner.getSelectedItem().toString());
   Integer account_number=Integer.parseInt(account_number_input.getText());
   if(interest==0 || account_solde==0 || account_type.isEmpty() || account_state.isEmpty() || owner==0)
   {
       JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs !!");
   }
   
   else
   {
       //String owner,String number,double solde,double interest
       if(account_type.equals("Normal"))
       {
          compte=new NormalAccount(owner,account_solde,interest);
         
       }
       else if(account_type.equals("Sparing"))
       {
           compte=new SparingAccount(owner,account_solde,interest);

       }
        listOfBanks.add(compte);
            JOptionPane.showMessageDialog(this, "Compte crée avec succès !!"+listOfBanks.size());

   }
 }
 
 catch(Exception ex)
 {
     JOptionPane.showMessageDialog(this, "Données Invalides !! Veuillez verifier les valeurs ");
 }
 
    }//GEN-LAST:event_btn_new_compteActionPerformed

    private void btn_new_compte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_compte1ActionPerformed
        this.dispose()   ;    // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_compte1ActionPerformed

    private void account_number_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_number_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_number_inputActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_interest_input;
    private javax.swing.JTextField account_number_input;
    private javax.swing.JTextField account_solde_input;
    private javax.swing.JButton btn_new_compte;
    private javax.swing.JButton btn_new_compte1;
    private javax.swing.JComboBox<String> choice_account_state;
    private javax.swing.JComboBox<String> choice_account_type;
    private javax.swing.JComboBox<String> choice_owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
