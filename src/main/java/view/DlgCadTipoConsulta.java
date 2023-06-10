/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ControllerView;
import domain.TipoConsulta;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
/**
 *
 * @author joaop
 */
public class DlgCadTipoConsulta extends javax.swing.JDialog {
    private final ControllerView gerIG;
    private TipoConsulta tipoSelecionado;
    /**
     * Creates new form DlgCliente
     * @param parent
     * @param modal
     * @param controller
     */
    public DlgCadTipoConsulta(java.awt.Frame parent, boolean modal, ControllerView controller) {
        super(parent, modal);
        initComponents();
        gerIG = controller;
        tipoSelecionado = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSimNao = new javax.swing.ButtonGroup();
        jtpTelas = new javax.swing.JTabbedPane();
        CadastroServico = new javax.swing.JPanel();
        jpDados = new javax.swing.JPanel();
        jpInfoDados = new javax.swing.JPanel();
        jpID = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtIdServico = new javax.swing.JFormattedTextField();
        jpNome = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jpPlano = new javax.swing.JPanel();
        btNao = new javax.swing.JRadioButton();
        btSim = new javax.swing.JRadioButton();
        jpPreco = new javax.swing.JPanel();
        lbPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        jpBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        ListarPreco = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btLupa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpServico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jpBotoes1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbPesquisar = new javax.swing.JLabel();
        btListarTodos = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar / Listar Serviços");
        setMinimumSize(new java.awt.Dimension(390, 470));
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpTelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtpTelas.setOpaque(false);

        CadastroServico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CadastroServico.setOpaque(false);

        jpDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpDados.setOpaque(false);
        jpDados.setPreferredSize(new java.awt.Dimension(570, 130));
        jpDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInfoDados.setOpaque(false);

        jpID.setLayout(new java.awt.GridLayout(1, 2, -120, 15));
        jpID.setVisible(false);

        lbID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbID.setText("ID");
        jpID.add(lbID);

        txtIdServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIdServico.setEnabled(false);
        jpID.add(txtIdServico);

        jpNome.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNome.setText("Descriçao");
        jpNome.add(lbNome);
        jpNome.add(txtNome);

        jpPlano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "É plano de saúde?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jpPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpPlano.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grpSimNao.add(btNao);
        btNao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btNao.setText("Não");
        btNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoActionPerformed(evt);
            }
        });
        jpPlano.add(btNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 80, 30));

        grpSimNao.add(btSim);
        btSim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSim.setText("Sim");
        btSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimActionPerformed(evt);
            }
        });
        jpPlano.add(btSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        jpPreco.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPreco.setText("Preço");
        jpPreco.add(lbPreco);

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        jpPreco.add(txtPreco);

        javax.swing.GroupLayout jpInfoDadosLayout = new javax.swing.GroupLayout(jpInfoDados);
        jpInfoDados.setLayout(jpInfoDadosLayout);
        jpInfoDadosLayout.setHorizontalGroup(
            jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpNome, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addComponent(jpID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jpInfoDadosLayout.setVerticalGroup(
            jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpDados.add(jpInfoDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 220));

        CadastroServico.add(jpDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 369, 250));

        jpBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpBotoes.setOpaque(false);

        btConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/confirmar 24x24.png"))); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jpBotoes.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 40));

        btAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/atualizar 24x24.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jpBotoes.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 40));
        btAtualizar.setVisible(false);

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-vassoura-24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jpBotoes.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 120, 40));

        CadastroServico.add(jpBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 387, 60));

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CadastroServico.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 390, 10));

        jtpTelas.addTab("Cadastrar Serviço", CadastroServico);

        ListarPreco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ListarPreco.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 40));

        btLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lupa24-icon.png"))); // NOI18N
        btLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLupaActionPerformed(evt);
            }
        });
        ListarPreco.add(btLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPreco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 10));

        jpServico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Serviços", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jpServico.setLayout(new java.awt.BorderLayout());
        jpServico.setOpaque(false);

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "PLANO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionarios.setOpaque(true);
        jScrollPane1.setViewportView(tbFuncionarios);

        jpServico.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        ListarPreco.add(jpServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 180));

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPreco.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 10));

        jpBotoes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpBotoes1.setOpaque(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/adicionar 24x24.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jpBotoes1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 40));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/editar 24x24.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jpBotoes1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 40));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lixera 24x24.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jpBotoes1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        ListarPreco.add(jpBotoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 390, 60));

        lbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPesquisar.setText("Pesquisar");
        ListarPreco.add(lbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        btListarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-multidão-24.png"))); // NOI18N
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });
        ListarPreco.add(btListarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 40));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Plano" }));
        ListarPreco.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 40));

        jtpTelas.addTab("Lista de Consultas", ListarPreco);

        getContentPane().add(jtpTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 390, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/TelaServicos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    private void habilitarBotoes() {
        if(tipoSelecionado == null){
            limparCampos();
            btAtualizar.setVisible(false);
            btConfirmar.setVisible(true);
            jpID.setVisible(false);
        }else{
            limparCampos();
            jtpTelas.setSelectedIndex(0);
            btAtualizar.setVisible(true);
            btConfirmar.setVisible(false);
            jpID.setVisible(false);
        }
    }
    
    
    private void setCor(){
        Color defaultLabelColor = UIManager.getColor("Label.foreground");
        
        lbNome.setForeground(defaultLabelColor);
        lbPreco.setForeground(defaultLabelColor);
        lbPesquisar.setForeground(defaultLabelColor);
        jpPlano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "É plano de saúde?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        
    }
    
    
    private boolean validarBusca(){
        String msgErro = "";
        setCor();
               
        if(txtPesquisar.getText().isEmpty()){
            lbPesquisar.setForeground(Color.red);
            msgErro += "Nome invalido\n";
        }      
        
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos e tente novamente", JOptionPane.ERROR_MESSAGE);
            return false; 
        }  
    }
    
    
    private boolean validarCampos(){
         String msgErro = "";
        setCor();
        
        if(txtNome.getText().isEmpty()){
            lbNome.setForeground(Color.red);
            msgErro += "Nome invalido\n";
        }
        
        if(txtPreco.getText().isEmpty()){
            lbPreco.setForeground(Color.red);
            msgErro += "Preco invalido\n";
        }
        
        if((btSim.isSelected() || btNao.isSelected()) == false){
            msgErro += "Selecione um sexo\n";
            jpPlano.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.RED), // Define a cor da borda como vermelho
            "É plano de saúde?",
            TitledBorder.CENTER,
            TitledBorder.DEFAULT_POSITION,
            new Font("Segoe UI", Font.BOLD, 18)
            ));
        }
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos e tente novamente", JOptionPane.ERROR_MESSAGE);
            return false; 
        }  
    }
 
    
    private void limparCampos(){
        setCor();
        txtIdServico.setText("");
        txtNome.setText("");
        grpSimNao.clearSelection();
    }

    
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
               
        if(validarCampos()){
            String nome = txtNome.getText();
            Double preco = Double.valueOf(txtPreco.getText());
            boolean selecionado = false;
            if(btSim.isSelected()){
                selecionado = true;
            }
            try {
                if(tipoSelecionado == null){
                    gerIG.getGerDominio().inserirTipo(nome, preco, selecionado);
                    JOptionPane.showMessageDialog(this, "Tipo de consulta inserido com sucesso.", "Inserir Tipo de consulta", JOptionPane.INFORMATION_MESSAGE  );
                }else{
                    gerIG.getGerDominio().alterarTipo(tipoSelecionado, nome, preco, selecionado);
                    JOptionPane.showMessageDialog(this, "Tipo de consulta alterado com sucesso.", "Alterar Tipo de consulta", JOptionPane.INFORMATION_MESSAGE  );
                    tipoSelecionado = null;
                    habilitarBotoes();
                }
            } catch (HeadlessException e) {
               JOptionPane.showMessageDialog(this, e, "ERRO Tipo de Consulta", JOptionPane.ERROR_MESSAGE  );
            }
            habilitarBotoes();
            formComponentShown(null);
            limparCampos();
            jtpTelas.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limparCampos();
        jtpTelas.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int opcao = tbFuncionarios.getSelectedRow();
        if(opcao >= 0){  
            tipoSelecionado = (TipoConsulta) tbFuncionarios.getValueAt(opcao, 1);
            habilitarBotoes();
            txtIdServico.setText(String.valueOf(tipoSelecionado.getIdTipoConsulta()));
            txtNome.setText(tipoSelecionado.getDescricao()); 
            txtPreco.setText(String.valueOf(tipoSelecionado.getValor()));
            if(tipoSelecionado.getIsPlano()){
                btSim.setSelected(true);
            }else{
                btNao.setSelected(true);
            }
            
            jtpTelas.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = tbFuncionarios.getSelectedRow();
        if ( linha >= 0 ) {
            try {
                TipoConsulta fun = (TipoConsulta) tbFuncionarios.getValueAt(linha, 1);
                if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse Tipo de consulta?", "Tipo de consulta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
                    gerIG.getGerDominio().excluir(fun);
                    ( (DefaultTableModel) tbFuncionarios.getModel() ).removeRow(linha);
                    JOptionPane.showMessageDialog(this, "Tipo de consulta " + fun.getDescricao()+ " excluído com sucesso.", "PESQUISAR Tipo de consulta", JOptionPane.INFORMATION_MESSAGE  );
                }
                
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Tipo de consulta", JOptionPane.ERROR_MESSAGE  );
            }             
        }        
        else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha.", "Pesquisar Tipo de consulta", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tipoSelecionado = null;
        habilitarBotoes();
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    
    private void btLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLupaActionPerformed

        if(validarBusca()){
            try {
                List<TipoConsulta> lista = gerIG.getGerDominio().pesquisarTipoConsulta(txtPesquisar.getText(), comboTipo.getSelectedIndex() );

                // APAGA as linhas da tabela
                ( (DefaultTableModel) tbFuncionarios.getModel() ).setNumRows(0);

                for (TipoConsulta cli : lista ) {
                    // ADICIONAR LINHA NA TABELA        
                    ( (DefaultTableModel) tbFuncionarios.getModel() ).addRow( cli.toArray() );                
                }

            
            } catch (HibernateException  ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Tipo Consulta", JOptionPane.ERROR_MESSAGE  );
            } 
        }
        limparCampos();
    }//GEN-LAST:event_btLupaActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        limparCampos();
        formComponentShown(null);
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void btNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoActionPerformed
        txtPreco.setEnabled(true);
    }//GEN-LAST:event_btNaoActionPerformed

    private void btSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimActionPerformed
        txtPreco.setEnabled(false);
        txtPreco.setText("0.00");
    }//GEN-LAST:event_btSimActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            btLimparActionPerformed(null);
            gerIG.carregarTabela(tbFuncionarios, TipoConsulta.class);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar Lista de tipos de consultas disponíveis " + ex.getMessage() );
        }
    }//GEN-LAST:event_formComponentShown

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroServico;
    private javax.swing.JPanel ListarPreco;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btLupa;
    private javax.swing.JRadioButton btNao;
    private javax.swing.JButton btNovo;
    private javax.swing.JRadioButton btSim;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup grpSimNao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBotoes1;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpInfoDados;
    private javax.swing.JPanel jpNome;
    private javax.swing.JPanel jpPlano;
    private javax.swing.JPanel jpPreco;
    private javax.swing.JPanel jpServico;
    private javax.swing.JTabbedPane jtpTelas;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JFormattedTextField txtIdServico;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
