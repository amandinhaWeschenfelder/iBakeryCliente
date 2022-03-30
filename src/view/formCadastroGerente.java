/**
 * NOME: Luana Kuntz e Amanda Weschenfelder
 * TURMA: INF4AT
 * DATA: 02/02/2022
 */
package view;

import controller.Conexao;
import controller.Verificacoes;
import javax.swing.JOptionPane;
import modelDominio.Usuario;

public class formCadastroGerente extends javax.swing.JDialog {

    public formCadastroGerente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFNomeGerente = new javax.swing.JTextField();
        jTFIdentificadorGerente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFSobrenomeGerente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCnpjGerente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFTelefoneGerente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFEmailGerente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFSenhaGerente = new javax.swing.JTextField();
        jBCadastrarGerente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTFCpfGerente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela cadastro de gerente");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(570, 565));

        jPanel5.setBackground(new java.awt.Color(215, 181, 109));
        jPanel5.setPreferredSize(new java.awt.Dimension(366, 111));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N
        logo2.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(215, 181, 109));
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(570, 61));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jTFIdentificadorGerente.setEditable(false);
        jTFIdentificadorGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdentificadorGerenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cadastro de gerente");
        jLabel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Nome (*):");
        jLabel2.setToolTipText("O seu nome será utilizado para login. Ex: amanda.");

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Sobrenome (*):");

        jLabel5.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel5.setText("CPF (*):");

        jLabel6.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel7.setText("E-mail (*):");

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel8.setText("Senha (*):");

        jBCadastrarGerente.setBackground(new java.awt.Color(140, 61, 44));
        jBCadastrarGerente.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBCadastrarGerente.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastrarGerente.setText("Cadastrar ");
        jBCadastrarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarGerenteActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel10.setText("Ajuda");
        jLabel10.setToolTipText("A senha deve possuir ...");

        jBVoltar.setBackground(new java.awt.Color(140, 61, 44));
        jBVoltar.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel9.setText("CNPJ (*):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFSenhaGerente)
                                    .addComponent(jTFEmailGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jBCadastrarGerente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBVoltar))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFCnpjGerente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFTelefoneGerente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jTFIdentificadorGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNomeGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTFSobrenomeGerente)
                            .addComponent(jTFCpfGerente))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdentificadorGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSobrenomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCpfGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCnpjGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefoneGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmailGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCadastrarGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIdentificadorGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdentificadorGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdentificadorGerenteActionPerformed

    private void jBCadastrarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarGerenteActionPerformed
        int erro = -1;

        if (!jTFNomeGerente.getText().equals("")) {
            if (!jTFSobrenomeGerente.getText().equals("")) {
                if (!jTFCpfGerente.getText().equals("") && Verificacoes.cpfValido(jTFCpfGerente.getText()) == true) {
                    if (!jTFCnpjGerente.getText().equals("") && Verificacoes.cnpjValido(jTFCnpjGerente.getText()) == true) {
                        if (jTFTelefoneGerente.getText().equals("") || !jTFTelefoneGerente.getText().equals("") && Verificacoes.telefoneValido(jTFTelefoneGerente.getText()) == true) {
                            if (!jTFEmailGerente.getText().equals("") && Verificacoes.emailValido(jTFEmailGerente.getText()) == true) {
                                if (!jTFSenhaGerente.getText().equals("")) {

                                    if (!jTFTelefoneGerente.getText().equals("")) { // SE O TELEFONE ESTIVER PREENCHIDO                                    
                                        erro = iBakeryCliente.conexaoController.inserirUsuario(
                                                jTFNomeGerente.getText(), 
                                                jTFSobrenomeGerente.getText(), 
                                                jTFTelefoneGerente.getText(),
                                                jTFEmailGerente.getText(),
                                                jTFSenhaGerente.getText(), 
                                                jTFCnpjGerente.getText(), 
                                                jTFCpfGerente.getText(), 
                                                2);                          

                                        dispose();
                                    } else { // SE NÃO TIVER TELEFONE PREENCHIDO
                                        erro = iBakeryCliente.conexaoController.inserirUsuario(
                                                jTFNomeGerente.getText(),
                                                jTFSobrenomeGerente.getText(),
                                                "0",
                                                jTFEmailGerente.getText(),
                                                jTFSenhaGerente.getText(),
                                                jTFCnpjGerente.getText(),
                                                jTFCpfGerente.getText(),
                                                2);

                                        dispose();
                                    }

                                    if (erro == 0) {
                                        JOptionPane.showMessageDialog(this, "Ocorreu um erro de comunicação com o servidor!",
                                                this.getTitle(), JOptionPane.ERROR_MESSAGE);
                                    } else if (erro > 0) {
                                        JOptionPane.showMessageDialog(this, "Ocorreu um erro ao gravar registro: "
                                                + erro, this.getTitle(), JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!",
                                                this.getTitle(), JOptionPane.INFORMATION_MESSAGE);

                                        jTFNomeGerente.setText("");
                                        jTFSobrenomeGerente.setText("");
                                        jTFTelefoneGerente.setText("");
                                        jTFEmailGerente.setText("");
                                        jTFSenhaGerente.setText("");
                                        jTFCnpjGerente.setText("");
                                        jTFCpfGerente.setText("");
                                    }
                                } else { // ELSE DA SENHA //
                                    JOptionPane.showMessageDialog(this, "O campo 'Senha' deve ser preenchido atendendo os requisitos do sistema");
                                    jTFSenhaGerente.setText("");
                                    jTFSenhaGerente.requestFocus();
                                }
                            } else { // ELSE DO E-MAIL //
                                JOptionPane.showMessageDialog(this, "O campo 'E-mail' deve ser preenchido com um valor válido");
                                jTFEmailGerente.setText("");
                                jTFEmailGerente.requestFocus();
                            }
                        } else { // ELSE DO TELEFONE //

                            JOptionPane.showMessageDialog(this, "O campo 'Telefone' deve ser preenchido com um valor válido");
                            jTFTelefoneGerente.setText("");
                            jTFTelefoneGerente.requestFocus();
                        }
                    } else { // ELSE DO CNPJ //                                                
                        JOptionPane.showMessageDialog(this, "O campo 'CNPJ' deve ser preenchido com um valor válido");
                        jTFCnpjGerente.setText("");
                        jTFCnpjGerente.requestFocus();
                    }
                } else { // ELSE DO CPF //                                                
                    JOptionPane.showMessageDialog(this, "O campo 'CPF' deve ser preenchido com um valor válido");
                    jTFCpfGerente.setText("");
                    jTFCpfGerente.requestFocus();
                }
            } else { // ELSE DO SOBRENOME //
                JOptionPane.showMessageDialog(this, "Preencha o campo 'Sobrenome'");
                jTFSobrenomeGerente.requestFocus();
            }
        } else { // ELSE DO NOME // 
            JOptionPane.showMessageDialog(this, "Preencha o campo 'Nome'");
            jTFNomeGerente.requestFocus();
        }
    }//GEN-LAST:event_jBCadastrarGerenteActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();

    }//GEN-LAST:event_jBVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(formCadastroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCadastroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCadastroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCadastroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastroGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarGerente;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTFCnpjGerente;
    private javax.swing.JTextField jTFCpfGerente;
    private javax.swing.JTextField jTFEmailGerente;
    private javax.swing.JTextField jTFIdentificadorGerente;
    private javax.swing.JTextField jTFNomeGerente;
    private javax.swing.JTextField jTFSenhaGerente;
    private javax.swing.JTextField jTFSobrenomeGerente;
    private javax.swing.JTextField jTFTelefoneGerente;
    private javax.swing.JLabel logo2;
    // End of variables declaration//GEN-END:variables
}
