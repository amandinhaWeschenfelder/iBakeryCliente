/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 07/03/2022
 */
package view;

import modelDominio.Usuario;
import view.gerente.formListaFuncionarios;

public class formPrincipal extends javax.swing.JFrame {
   
    public formPrincipal() {
        initComponents();
    }
    
    public formPrincipal(Usuario usuario) {
        initComponents();
        
        if (usuario.getTipoUsuario() == 3) 
            jBMenuFuncionario.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBMenuProdutos = new javax.swing.JButton();
        jBMenuFuncionario = new javax.swing.JButton();
        jBMenuProducao = new javax.swing.JButton();
        jBMenuEncomendas = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        logo3 = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jBMenuProdutos.setBackground(new java.awt.Color(215, 181, 109));
        jBMenuProdutos.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBMenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produtos.png"))); // NOI18N
        jBMenuProdutos.setText("Produtos");
        jBMenuProdutos.setBorderPainted(false);
        jBMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuProdutosActionPerformed(evt);
            }
        });

        jBMenuFuncionario.setBackground(new java.awt.Color(215, 181, 109));
        jBMenuFuncionario.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBMenuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User.png"))); // NOI18N
        jBMenuFuncionario.setText("Funcionários");
        jBMenuFuncionario.setBorderPainted(false);
        jBMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuFuncionarioActionPerformed(evt);
            }
        });

        jBMenuProducao.setBackground(new java.awt.Color(215, 181, 109));
        jBMenuProducao.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBMenuProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Producao.png"))); // NOI18N
        jBMenuProducao.setText("Produção");
        jBMenuProducao.setBorderPainted(false);
        jBMenuProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuProducaoActionPerformed(evt);
            }
        });

        jBMenuEncomendas.setBackground(new java.awt.Color(215, 181, 109));
        jBMenuEncomendas.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBMenuEncomendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entrega-rapida.png"))); // NOI18N
        jBMenuEncomendas.setText("Encomendas");
        jBMenuEncomendas.setBorderPainted(false);
        jBMenuEncomendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuEncomendasActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(215, 181, 109));

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N

        jBSair.setBackground(new java.awt.Color(215, 181, 109));
        jBSair.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jBSair.setForeground(new java.awt.Color(255, 255, 255));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBSair)
                .addGap(10, 10, 10)
                .addComponent(logo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Tela inicial");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBMenuEncomendas, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBMenuProducao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBMenuProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBMenuFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMenuFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMenuProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMenuProducao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMenuEncomendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuProdutosActionPerformed
        formListaProdutos form = new formListaProdutos();
        form.setModal(true); //Não permite clicar em outra tela até terminar a que está executando
        form.setVisible(true);
    }//GEN-LAST:event_jBMenuProdutosActionPerformed

    private void jBMenuProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuProducaoActionPerformed
        formCadastroProducao form = new formCadastroProducao(); 
        form.setModal(true); //Não permite clicar em outra tela até terminar a que está executando
        form.setVisible(true);
    }//GEN-LAST:event_jBMenuProducaoActionPerformed

    private void jBMenuEncomendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuEncomendasActionPerformed
        formListaEncomendas form = new formListaEncomendas();
        form.setModal(true); //Não permite clicar em outra tela até terminar a que está executando
        form.setVisible(true);
    }//GEN-LAST:event_jBMenuEncomendasActionPerformed

    private void jBMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuFuncionarioActionPerformed
        formListaFuncionarios form = new formListaFuncionarios();
        form.setModal(true); //Não permite clicar em outra tela até terminar a que está executando
        form.setVisible(true);
    }//GEN-LAST:event_jBMenuFuncionarioActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
        formLogin form = new formLogin();
        form.setVisible(true);
    }//GEN-LAST:event_jBSairActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMenuEncomendas;
    private javax.swing.JButton jBMenuFuncionario;
    private javax.swing.JButton jBMenuProducao;
    private javax.swing.JButton jBMenuProdutos;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logo3;
    // End of variables declaration//GEN-END:variables
}
