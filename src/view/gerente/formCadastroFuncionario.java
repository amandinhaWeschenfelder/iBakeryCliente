/**
 * NOME: Luana Kuntz e Amanda Weschenfelder
 * TURMA: INF4AT
 * DATA: 02/02/2022
 */
package view.gerente;

import controller.Verificacoes;
import javax.swing.JOptionPane;
import view.*;

public class formCadastroFuncionario extends javax.swing.JDialog {

    public formCadastroFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFNomeFuncionario = new javax.swing.JTextField();
        jTFIdentificadorFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFSobrenomeFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCpfFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFTelefoneFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFEmailFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFSenhaFuncionario = new javax.swing.JTextField();
        jBCadastrarFuncionario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jBAtualizarProduto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela cadastro de funcionário");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(215, 181, 109));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N
        logo2.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(215, 181, 109));

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

        jTFIdentificadorFuncionario.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cadastro de funcionários");
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

        jBCadastrarFuncionario.setBackground(new java.awt.Color(140, 61, 44));
        jBCadastrarFuncionario.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastrarFuncionario.setText("Cadastrar ");
        jBCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel10.setText("Ajuda");
        jLabel10.setToolTipText("A senha deve possuir ...");

        jBAtualizarProduto1.setBackground(new java.awt.Color(140, 61, 44));
        jBAtualizarProduto1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBAtualizarProduto1.setForeground(new java.awt.Color(255, 255, 255));
        jBAtualizarProduto1.setText("Voltar");
        jBAtualizarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarProduto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBCadastrarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAtualizarProduto1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFIdentificadorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(jTFSobrenomeFuncionario)
                        .addComponent(jTFCpfFuncionario)
                        .addComponent(jTFTelefoneFuncionario)
                        .addComponent(jTFEmailFuncionario)
                        .addComponent(jTFSenhaFuncionario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(43, 43, 43))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTFIdentificadorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSobrenomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAtualizarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarProduto1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBAtualizarProduto1ActionPerformed

    private void jBCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarFuncionarioActionPerformed
        int erro = -1;

        if (!jTFNomeFuncionario.getText().equals("")) {
            if (!jTFSobrenomeFuncionario.getText().equals("")) {
                if (jTFTelefoneFuncionario.getText().equals("") || !jTFTelefoneFuncionario.getText().equals("") && Verificacoes.telefoneValido(jTFTelefoneFuncionario.getText()) == true) {
                    if (!jTFCpfFuncionario.getText().equals("") && Verificacoes.cpfValido(jTFCpfFuncionario.getText()) == true) {
                        if (!jTFEmailFuncionario.getText().equals("") && Verificacoes.emailValido(jTFEmailFuncionario.getText()) == true) {
                            if (!jTFSenhaFuncionario.getText().equals("")) {
                                System.out.println(jTFTelefoneFuncionario.getText());
                                if (!jTFTelefoneFuncionario.getText().equals("")) { // SE O TELEFONE ESTIVER PREENCHIDO                                    
                                    erro = iBakeryCliente.conexaoController.inserirUsuario(
                                            jTFNomeFuncionario.getText(), // NOME
                                            jTFSobrenomeFuncionario.getText(), // SOBRENOME
                                            jTFTelefoneFuncionario.getText(), // TELEFONE
                                            jTFEmailFuncionario.getText(), // EMAIL
                                            jTFSenhaFuncionario.getText(), // SENHA
                                            "0", // CNPJ
                                            jTFCpfFuncionario.getText(), // CPF
                                            3); // TIPO                           
                                    
                                    dispose();
                                } else { // SE NÃO TIVER TELEFONE PREENCHIDO
                                    erro = iBakeryCliente.conexaoController.inserirUsuario(
                                            jTFNomeFuncionario.getText(),
                                            jTFSobrenomeFuncionario.getText(),
                                            "0",
                                            jTFEmailFuncionario.getText(),
                                            jTFSenhaFuncionario.getText(),
                                            "0",
                                            jTFCpfFuncionario.getText(),
                                            3);                                                  
                                    
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

                                    jTFNomeFuncionario.setText("");
                                    jTFSobrenomeFuncionario.setText("");
                                    jTFTelefoneFuncionario.setText("");
                                    jTFEmailFuncionario.setText("");
                                    jTFSenhaFuncionario.setText("");
                                    jTFCpfFuncionario.setText("");
                                }
                            } else { // ELSE DA SENHA //
                                JOptionPane.showMessageDialog(this, "O campo 'Senha' deve ser preenchido atendendo os requisitos do sistema");
                                jTFSenhaFuncionario.setText("");
                                jTFSenhaFuncionario.requestFocus();
                            }
                        } else { // ELSE DO E-MAIL //
                            JOptionPane.showMessageDialog(this, "O campo 'E-mail' deve ser preenchido com um valor válido");
                            jTFEmailFuncionario.setText("");
                            jTFEmailFuncionario.requestFocus();
                        }
                    } else { // ELSE DO CPF //
                        JOptionPane.showMessageDialog(this, "O campo 'CPF' deve ser preenchido com um valor válido");
                        jTFCpfFuncionario.setText("");
                        jTFCpfFuncionario.requestFocus();
                    }
                } else { // ELSE DO TELEFONE //                                                
                    JOptionPane.showMessageDialog(this, "O campo 'Telefone' deve ser preenchido com um valor válido");
                    jTFTelefoneFuncionario.setText("");
                    jTFTelefoneFuncionario.requestFocus();
                }
            } else { // ELSE DO SOBRENOME //
                JOptionPane.showMessageDialog(this, "Preencha o campo 'Sobrenome'");
                jTFSobrenomeFuncionario.requestFocus();
            }
        } else { // ELSE DO NOME // 
            JOptionPane.showMessageDialog(this, "Preencha o campo 'Nome'");
            jTFNomeFuncionario.requestFocus();
        }
    }//GEN-LAST:event_jBCadastrarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(formCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizarProduto1;
    private javax.swing.JButton jBCadastrarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTFCpfFuncionario;
    private javax.swing.JTextField jTFEmailFuncionario;
    private javax.swing.JTextField jTFIdentificadorFuncionario;
    private javax.swing.JTextField jTFNomeFuncionario;
    private javax.swing.JTextField jTFSenhaFuncionario;
    private javax.swing.JTextField jTFSobrenomeFuncionario;
    private javax.swing.JTextField jTFTelefoneFuncionario;
    private javax.swing.JLabel logo2;
    // End of variables declaration//GEN-END:variables
}
