package atividade2.view;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import atividade2.model.Filmes;
import atividade2.model.FilmesDAO;
import static atividade2.model.FilmesDAO.buscar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * Classe responsável pela interface gráfica de cadastro de filmes.
 */
public class CadastroFilmes extends javax.swing.JFrame 
{   
    /**
    * Construtor da classe CadastroFilmes.
    * Inicializa os componentes da interface gráfica.
    */
    public CadastroFilmes()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstado = new javax.swing.ButtonGroup();
        AreaDeBoasVindas = new javax.swing.JPanel();
        jCenaflix = new javax.swing.JLabel();
        jCadastroFilmes = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        jNomeFilme = new javax.swing.JLabel();
        txNomeFilme = new javax.swing.JTextField();
        jDataLancamento = new javax.swing.JLabel();
        txDataLancamento = new javax.swing.JTextField();
        jCategoria = new javax.swing.JLabel();
        txCategoria = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        AreaDaTabela = new javax.swing.JPanel();
        jCatalogoFilmes = new javax.swing.JLabel();
        jPesquisaFilme = new javax.swing.JLabel();
        txBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jFiltrarFilme = new javax.swing.JLabel();
        txFiltrar = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        ScrollDaTabela = new javax.swing.JScrollPane();
        CatalogoDeFilmes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreaDeBoasVindas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        AreaDeBoasVindas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCenaflix.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jCenaflix.setForeground(new java.awt.Color(255, 0, 51));
        jCenaflix.setText("CENAFLIX");
        AreaDeBoasVindas.add(jCenaflix, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 8, -1, -1));

        jCadastroFilmes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCadastroFilmes.setText("CADASTRO DE FILMES");
        AreaDeBoasVindas.add(jCadastroFilmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 62, -1, -1));

        getContentPane().add(AreaDeBoasVindas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 768, 102));

        Formulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jNomeFilme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNomeFilme.setLabelFor(txNomeFilme);
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
        txCategoria.setToolTipText("Preencha a categoria do filme.");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setToolTipText("Pressione para cadastrar o filme.");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

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
        btnAtualizar.setToolTipText("Pressione para abrir a janela de atualização o filme.");
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
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jNomeFilme)
                        .addGap(18, 18, 18)
                        .addComponent(txNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jDataLancamento)
                        .addGap(18, 18, 18)
                        .addComponent(txDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addComponent(jCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(txCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jNomeFilme))
                    .addComponent(txNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jDataLancamento))
                    .addComponent(txDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCategoria))
                    .addComponent(txCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jNomeFilme.getAccessibleContext().setAccessibleDescription("Texto informando que o campo abaixo deve ser preenchido com \"nome\".");
        txNomeFilme.getAccessibleContext().setAccessibleName("Campo de entrada de dados (nome)");
        txNomeFilme.getAccessibleContext().setAccessibleDescription("Campo de entrada de dados para ser informado o nome do produto.");

        getContentPane().add(Formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, 768, -1));

        AreaDaTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jCatalogoFilmes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCatalogoFilmes.setText("CATALOGO DE FILMES");

        jPesquisaFilme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPesquisaFilme.setText("Pesquisar filme por nome:");

        txBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txBuscar.setToolTipText("Preencha o campo com o nome do filme.");
        txBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txBuscarFocusGained(evt);
            }
        });
        txBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Pressione para buscar o filme pelo nome.");
        btnBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnBuscarFocusGained(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jFiltrarFilme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jFiltrarFilme.setText("Filtrar filme por nome:");

        txFiltrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txFiltrar.setToolTipText("Preencha o campo com o nome do filme.");
        txFiltrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txFiltrarFocusGained(evt);
            }
        });

        btnFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setToolTipText("Pressione para filtrar o filme pelo nome.");
        btnFiltrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnFiltrarFocusGained(evt);
            }
        });
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        CatalogoDeFilmes.setModel(montarTabela());
        CatalogoDeFilmes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CatalogoDeFilmesFocusGained(evt);
            }
        });
        ScrollDaTabela.setViewportView(CatalogoDeFilmes);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setToolTipText("Pressione para excluir um filme do catalogo.");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDaTabelaLayout = new javax.swing.GroupLayout(AreaDaTabela);
        AreaDaTabela.setLayout(AreaDaTabelaLayout);
        AreaDaTabelaLayout.setHorizontalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jFiltrarFilme)
                                .addComponent(jPesquisaFilme))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCatalogoFilmes)
                                .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                                    .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                                    .addComponent(txFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        AreaDaTabelaLayout.setVerticalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jCatalogoFilmes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPesquisaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFiltrarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        getContentPane().add(AreaDaTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, -1, -1));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Atualizar a lista de filmes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
    * Limpa os campos de texto da interface gráfica.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpa os campos de texto
        txNomeFilme.setText("");
        txCategoria.setText("");
        txDataLancamento.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txDataLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDataLancamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataLancamentoActionPerformed

    private void txNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeFilmeActionPerformed
    /**
    * Evento acionado ao clicar no botão "Cadastrar".
    * Realiza o cadastro de um novo filme utilizando os dados inseridos nos campos de texto.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
         // Cria um novo objeto Filme.
        Filmes filme = new Filmes();
        try 
        {
            // Define os atributos do filme com os valores dos campos de texto.
            filme.setNomeFilme(txNomeFilme.getText());
            filme.setDataLancamento(txDataLancamento.getText());
            filme.setCategoria(txCategoria.getText());
           
            // Tenta cadastrar o filme no banco de dados.
            if(FilmesDAO.cadastrar(filme)) 
            {
                // Exibe uma mensagem de sucesso caso o cadastro seja realizado com sucesso.
                JOptionPane.showMessageDialog(null, "FILME CADASTRADO COM SUCESSO!\n\n"
                                                  + "Nome: " + txNomeFilme.getText() 
                                                  + "\nData de Lançamento: " + txDataLancamento.getText() 
                                                  + "\nCategoria: " + txCategoria.getText());
            }
            // Limpa os campos de texto
            txNomeFilme.setText("");
            txCategoria.setText("");
            txDataLancamento.setText("");
            // Atualiza a tabela de filmes exibida na interface gráfica.
            CatalogoDeFilmes.setModel(montarTabela());
            ScrollDaTabela.setViewportView(CatalogoDeFilmes);
        }
        
        catch(SQLException ex) 
        {
            // Exibe uma mensagem de erro caso o cadastro não possa ser realizado.
            JOptionPane.showMessageDialog(null, "Filme não pode ser cadastrado! Tente novamente!");
            System.out.println(ex);
        }  
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txFiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txFiltrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txFiltrarFocusGained

    private void CatalogoDeFilmesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CatalogoDeFilmesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CatalogoDeFilmesFocusGained

    private void btnBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarFocusGained
    /**
    * Evento acionado ao clicar no botão "Excluir".
    * Realiza a exclusão do filme selecionado.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Obtém o ID do filme a ser excluído.
        int id = getPosicao();
        // Pergunta ao usuário se ele realmente deseja excluir o filme.
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse filme?");
        // Se o usuário confirmar a exclusão (resposta igual a 0)
        if(resposta == 0) 
        {
            // Exclui o filme
            FilmesDAO.excluir(id);
            // Exibe uma mensagem de sucesso.
            JOptionPane.showMessageDialog(null, "Filme excluído com sucesso!");
        }
        // Atualiza a tabela de filmes exibida na interface gráfica.
        CatalogoDeFilmes.setModel(montarTabela());
        ScrollDaTabela.setViewportView(CatalogoDeFilmes);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        JOptionPane.showMessageDialog(null, "Tecla foi pressionada.");
        if(evt.getKeyCode() == evt.VK_F5) {}
    }//GEN-LAST:event_formKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained
    /**
    * Evento acionado ao clicar no botão "Atualizar".
    * Abre a tela de atualização de filmes.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // Cria uma instância da tela de atualização de filmes
        AtualizarFilmes tela = new AtualizarFilmes();
        // Torna a tela visível
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed
    /**
    * Evento acionado ao clicar no botão "Buscar".
    * Realiza a busca de um filme pelo nome e exibe suas informações nos campos de texto.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    // Obtém o nome do filme a ser buscado.
    String nomeFilme = txBuscar.getText();
    
    // Realiza a busca do filme no banco de dados.
    Filmes filmeEncontrado = buscar(nomeFilme);
    
    // Se o filme foi encontrado.
    if (filmeEncontrado.getId() != 0) 
    {    
        // Limpa o conteúdo da tabela
        DefaultTableModel model = (DefaultTableModel) CatalogoDeFilmes.getModel();
        model.setRowCount(0);
        
        // Adiciona o filme encontrado à tabela.
        Object[] row = {filmeEncontrado.getId(), filmeEncontrado.getNomeFilme(), filmeEncontrado.getDataLancamento(), filmeEncontrado.getCategoria()};
        model.addRow(row);
    } 
    else 
    {
        // Limpa o texto nos campos de texto.
        txNomeFilme.setText("");
        txDataLancamento.setText("");
        txCategoria.setText("");
        
        // Exibe uma mensagem informando que o filme não foi encontrado.
        JOptionPane.showMessageDialog(this, "Filme não encontrado.");
    }
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
    * Evento acionado quando a janela recebe foco.
    * Atualiza a tabela de filmes exibida na interface gráfica.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // Atualiza a tabela de filmes exibida na interface gráfica.
        CatalogoDeFilmes.setModel(montarTabela());
        ScrollDaTabela.setViewportView(CatalogoDeFilmes);
    }//GEN-LAST:event_formWindowGainedFocus

    private void txBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscarFocusGained

    private void btnFiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnFiltrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarFocusGained
    /**
    * Evento acionado ao clicar no botão "Filtrar".
    * Realiza uma busca filtrada de filmes pelo nome e exibe o primeiro filme encontrado no campo de texto.
    * 
    * @param evt O evento que acionou o método (não utilizado neste método)
    */
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
    // Cria uma instância de FilmesDAO.
    FilmesDAO filmesDAO = new FilmesDAO();
    // Obtém o nome do filme a ser filtrado.
    String nomeFilme = txFiltrar.getText();
    // Realiza o filtro de filmes pelo nome.
    List<Filmes> lista = filmesDAO.filtrar(nomeFilme);
    // Se a lista de filmes retornada for nula.
    if (lista == null || lista.isEmpty()) 
    {
        // Exibe uma mensagem informando que o filme não foi encontrado.
        JOptionPane.showMessageDialog(null, "Filme não encontrado!");
    } 
    else 
    {
        // Exibe o nome do filme
        txNomeFilme.setText(lista.get(0).getNomeFilme());
        // Exibe a data de lançamento do filme, se disponível
        String dataLancamento = lista.get(0).getDataLancamento();
        if (dataLancamento != null) 
        {
            txDataLancamento.setText(dataLancamento);
        } 
        else 
        {
            txDataLancamento.setText("Data de lançamento indisponível");
        }
        // Exibe a categoria do filme, se disponível
        String categoria = lista.get(0).getCategoria();
        if (categoria != null) 
        {
            txCategoria.setText(categoria);
        } 
        else
        {
            txCategoria.setText("Categoria indisponível");
        }
    }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() 
    {
        CadastroFilmes mainApp = new CadastroFilmes(); // Criar uma instância apenas aqui
        mainApp.setResizable(false); // Impede redimensionamento da janela
        mainApp.setVisible(true); // Torna a janela visível
    }});
    }
        
    /**
    * Monta e retorna um modelo de tabela contendo todos os filmes cadastrados.
    * 
    * @return O modelo de tabela contendo os filmes cadastrados.
    */
    private DefaultTableModel montarTabela() 
    {
        // Define as colunas da tabela.
        String[] colunas = {"ID", "Nome do Filme", "Data de Lançamento", "Categoria"};
        
        // Cria o modelo de tabela.
        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);
        
        // Obtém a lista de todos os filmes cadastrados.
        List<Filmes> lista = FilmesDAO.listarTodos();
        
        // Itera sobre a lista de filmes.
        for (int i = 0; i < lista.size(); i++) 
        {
            Filmes filme = lista.get(i);
            // Criamos uma linha com os dados do filme.
            String[] linha = 
            {
                Integer.toString(filme.getId()),
                filme.getNomeFilme(),
                filme.getDataLancamento(),
                filme.getCategoria(),
            };
            // Adiciona a linha ao modelo de tabela.
            tabela.addRow(linha);
        }
        // Retorna o modelo de tabela montado.
        return tabela;
    }
    
    /**
     * Obtém a posição do item selecionado na tabela de filmes.
     * 
     * @return A posição do item selecionado na tabela.
     */
    private int getPosicao() 
    {
        // Obtém a posição do item selecionado na tabela.
        int posicao = CatalogoDeFilmes.getSelectedRow();
        
        // Se não houver nenhum item selecionado (-1), exibe uma mensagem de aviso.
        if (posicao <= -1) 
        {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");
        }
        
        // Retorna o ID do filme selecionado.
        return Integer.parseInt((String) CatalogoDeFilmes.getValueAt(posicao, 0));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDaTabela;
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JTable CatalogoDeFilmes;
    private javax.swing.JPanel Formulario;
    private javax.swing.ButtonGroup GrupoEstado;
    private javax.swing.JScrollPane ScrollDaTabela;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jCadastroFilmes;
    private javax.swing.JLabel jCatalogoFilmes;
    private javax.swing.JLabel jCategoria;
    private javax.swing.JLabel jCenaflix;
    private javax.swing.JLabel jDataLancamento;
    private javax.swing.JLabel jFiltrarFilme;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jNomeFilme;
    private javax.swing.JLabel jPesquisaFilme;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txCategoria;
    private javax.swing.JTextField txDataLancamento;
    private javax.swing.JTextField txFiltrar;
    private javax.swing.JTextField txNomeFilme;
    // End of variables declaration//GEN-END:variables
}
