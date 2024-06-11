package atividade2.view;
import atividade2.model.Filmes;
import atividade2.model.FilmesDAO;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
* Classe responsável pela interface gráfica de atualização de filmes.
*/
public class AtualizarFilmes extends javax.swing.JFrame 
{
    /**
    * Construtor da classe AtualizarFilmes.
    * Inicializa os componentes da interface gráfica.
    */
    public AtualizarFilmes()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaDeBoasVindas = new javax.swing.JPanel();
        jCenaflix = new javax.swing.JLabel();
        jAtualizarFilmes = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        Formulario = new javax.swing.JPanel();
        jId = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        jNomeFilme = new javax.swing.JLabel();
        txNomeFilme = new javax.swing.JTextField();
        jDataLancamento = new javax.swing.JLabel();
        txDataLancamento = new javax.swing.JTextField();
        jCategoria = new javax.swing.JLabel();
        txCategoria = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        AreaDeBoasVindas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jCenaflix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaflix.setForeground(new java.awt.Color(255, 0, 51));
        jCenaflix.setText("CENAFLIX");

        jAtualizarFilmes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jAtualizarFilmes.setText("ATUALIZAR FILMES");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Pressione para voltar para tela de cadastro.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDeBoasVindasLayout = new javax.swing.GroupLayout(AreaDeBoasVindas);
        AreaDeBoasVindas.setLayout(AreaDeBoasVindasLayout);
        AreaDeBoasVindasLayout.setHorizontalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jAtualizarFilmes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jCenaflix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        AreaDeBoasVindasLayout.setVerticalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCenaflix))
                .addGap(4, 4, 4)
                .addComponent(jAtualizarFilmes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Formulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jId.setText("ID:");

        txId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txId.setToolTipText("Preencha o campo com o ID do filme.");
        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });

        jNomeFilme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNomeFilme.setText("Nome do Filme:");

        txNomeFilme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNomeFilme.setToolTipText("Preencha o campo com o nome do filme.");
        txNomeFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeFilmeActionPerformed(evt);
            }
        });

        jDataLancamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDataLancamento.setText("Data de Lançamento:");

        txDataLancamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txDataLancamento.setToolTipText("Preencha o campo com a data de lançamento do filme.");
        txDataLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDataLancamentoActionPerformed(evt);
            }
        });

        jCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCategoria.setText("Categoria:");

        txCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txCategoria.setToolTipText("Preencha o campo com a categoria do filme.");

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.setToolTipText("Pressione para limpar os campos com os dados do filme.");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("Pressione para atualizar os dados do filme.");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCategoria)
                    .addComponent(jNomeFilme)
                    .addComponent(jDataLancamento)
                    .addComponent(jId))
                .addGap(18, 18, 18)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jId)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomeFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataLancamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCategoria)
                    .addComponent(txCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Cria uma instância da tela de atualização de filmes
        CadastroFilmes tela = new CadastroFilmes();
        // Torna a tela visível
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

    private void txNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeFilmeActionPerformed

    private void txDataLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDataLancamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataLancamentoActionPerformed
    /**
     * Limpa os campos de texto da interface gráfica.
     * 
     * @param evt O evento que acionou o método (não utilizado neste método).
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpa os campos de texto.
        txId.setText("");
        txNomeFilme.setText("");
        txCategoria.setText("");
        txDataLancamento.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed
    /**
    * Evento acionado ao clicar no botão "Atualizar".
    * Atualiza as informações do filme com base nos dados fornecidos nos campos de texto.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // Obtém o ID, nome, data de lançamento e categoria do filme a ser atualizado.
        int id = Integer.parseInt(txId.getText());
        String nomeFilme = txNomeFilme.getText();
        String dataLancamento = txDataLancamento.getText();
        String categoria = txCategoria.getText();

        try
        {
            // Cria um objeto Filme com os dados fornecidos.
            Filmes filme = new Filmes();
            filme.setNomeFilme(nomeFilme);
            filme.setDataLancamento(dataLancamento);
            filme.setCategoria(categoria);
            filme.setId(id);

            // Atualiza o filme no banco de dados e exibe uma mensagem de sucesso.
            if(FilmesDAO.atualizar(filme))
            {
                JOptionPane.showMessageDialog(this, "Filme atualizado com sucesso!");
            }
            // Limpa os campos de texto
            txId.setText("");
            txNomeFilme.setText("");
            txCategoria.setText("");
            txDataLancamento.setText("");
        }
        catch (SQLException e)
        {
            // Exibe uma mensagem de erro amigável para o usuário.
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o filme: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JPanel Formulario;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jAtualizarFilmes;
    private javax.swing.JLabel jCategoria;
    private javax.swing.JLabel jCenaflix;
    private javax.swing.JLabel jDataLancamento;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jNomeFilme;
    private javax.swing.JTextField txCategoria;
    private javax.swing.JTextField txDataLancamento;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNomeFilme;
    // End of variables declaration//GEN-END:variables
}
