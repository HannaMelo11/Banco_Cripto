/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco_cripto.view;

import banco_cripto.model.Investidor;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanna
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Investidor investidorLogado;
    
    public MenuPrincipal(Investidor investidor) {
        initComponents();
        this.investidorLogado = investidor;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ConsultarSaldo = new javax.swing.JButton();
        Depositar = new javax.swing.JButton();
        Sacar = new javax.swing.JButton();
        ComprarCripto = new javax.swing.JButton();
        VenderCripto = new javax.swing.JButton();
        Cotacao = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Consultar Saldo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem vindo(a)");

        jLabel1.setFont(new java.awt.Font("Alegreya Sans SC Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecione a opção desejada");

        ConsultarSaldo.setBackground(new java.awt.Color(51, 51, 255));
        ConsultarSaldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ConsultarSaldo.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarSaldo.setText("Consultar Saldo");
        ConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSaldoActionPerformed(evt);
            }
        });

        Depositar.setBackground(new java.awt.Color(51, 51, 255));
        Depositar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Depositar.setForeground(new java.awt.Color(255, 255, 255));
        Depositar.setText("Depositar");
        Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarActionPerformed(evt);
            }
        });

        Sacar.setBackground(new java.awt.Color(51, 51, 255));
        Sacar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Sacar.setForeground(new java.awt.Color(255, 255, 255));
        Sacar.setText("Sacar");
        Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacarActionPerformed(evt);
            }
        });

        ComprarCripto.setBackground(new java.awt.Color(51, 51, 255));
        ComprarCripto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ComprarCripto.setForeground(new java.awt.Color(255, 255, 255));
        ComprarCripto.setText("Comprar Criptomoedas");
        ComprarCripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarCriptoActionPerformed(evt);
            }
        });

        VenderCripto.setBackground(new java.awt.Color(51, 51, 255));
        VenderCripto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        VenderCripto.setForeground(new java.awt.Color(255, 255, 255));
        VenderCripto.setText("Vender Criptomoedas");
        VenderCripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderCriptoActionPerformed(evt);
            }
        });

        Cotacao.setBackground(new java.awt.Color(51, 51, 255));
        Cotacao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Cotacao.setForeground(new java.awt.Color(255, 255, 255));
        Cotacao.setText("Atualizar Cotação");
        Cotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotacaoActionPerformed(evt);
            }
        });

        Sair.setBackground(new java.awt.Color(51, 51, 255));
        Sair.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ConsultarSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Depositar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComprarCripto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cotacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VenderCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(Depositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComprarCripto)
                .addGap(12, 12, 12)
                .addComponent(VenderCripto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cotacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultarSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sair)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSaldoActionPerformed
        ConsultaSaldo consultaSaldo = new ConsultaSaldo(investidorLogado);
        consultaSaldo.setVisible(true);
        dispose(); // Fecha a janela atual 
    }//GEN-LAST:event_ConsultarSaldoActionPerformed

    private void DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarActionPerformed
        Depositar depositarFrame = new Depositar(investidorLogado);
        depositarFrame.setVisible(true);
        dispose(); // Fecha a janela atual
    }//GEN-LAST:event_DepositarActionPerformed

    private void SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacarActionPerformed
        Sacar sacarFrame = new Sacar(investidorLogado);
        sacarFrame.setVisible(true);
        dispose(); // Fecha a janela atual
    }//GEN-LAST:event_SacarActionPerformed

    private void ComprarCriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarCriptoActionPerformed
        ComprarCriptomoedas comprarCriptomoedasFrame = new ComprarCriptomoedas();
        comprarCriptomoedasFrame.setVisible(true);
    }//GEN-LAST:event_ComprarCriptoActionPerformed

    private void VenderCriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderCriptoActionPerformed
        VenderCriptomoedas venderCriptomoedasFrame = new VenderCriptomoedas();
        venderCriptomoedasFrame.setVisible(true);
    }//GEN-LAST:event_VenderCriptoActionPerformed

    private void CotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CotacaoActionPerformed
        Cotacao cotacaoFrame = new Cotacao();
        cotacaoFrame.setVisible(true);
        dispose(); // Fecha a janela atual
    }//GEN-LAST:event_CotacaoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        JOptionPane.showMessageDialog(this, "Saindo do sistema. Até mais!");
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprarCripto;
    private javax.swing.JButton ConsultarSaldo;
    private javax.swing.JButton Cotacao;
    private javax.swing.JButton Depositar;
    private javax.swing.JButton Sacar;
    private javax.swing.JButton Sair;
    private javax.swing.JButton VenderCripto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
