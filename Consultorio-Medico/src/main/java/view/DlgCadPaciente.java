/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ControllerView;
import control.UtilCPF;
import control.UtilGeral;
import domain.Paciente;
import domain.Pessoa;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

/**
 *
 * @author joaop
 */
public class DlgCadPaciente extends javax.swing.JDialog {
    private ControllerView gerIG;
    private Paciente pacienteSelecionado;
    /**
     * Creates new form DlgCliente
     */
    public DlgCadPaciente(java.awt.Frame parent, boolean modal, ControllerView controller) {
        super(parent, modal);
        initComponents();
        gerIG = controller;
        pacienteSelecionado = null;
        habilitarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSexo = new javax.swing.ButtonGroup();
        jtpTelas = new javax.swing.JTabbedPane();
        CadastroPaciente = new javax.swing.JPanel();
        jpDados = new javax.swing.JPanel();
        jpInfoDados = new javax.swing.JPanel();
        jpID = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JFormattedTextField();
        jpNome = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jpEmail = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jpInfoContato = new javax.swing.JPanel();
        jpInfo3x3 = new javax.swing.JPanel();
        lbDataNascimento = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        jpTxt3x3 = new javax.swing.JPanel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jpSexo = new javax.swing.JPanel();
        chkMasculino = new javax.swing.JCheckBox();
        chkFemino = new javax.swing.JCheckBox();
        jpBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        ListarPaciente = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btLupa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jpBotoes1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btListarTodos = new javax.swing.JButton();
        cmbOpcao = new javax.swing.JComboBox<>();
        lbPesquisar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar / Listar pacientes");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(612, 509));
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpTelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jpDados.setPreferredSize(new java.awt.Dimension(570, 130));
        jpDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpDados.setOpaque(false);

        jpID.setLayout(new java.awt.GridLayout(1, 2, -120, 15));
        jpID.setVisible(false);

        lbID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbID.setText("ID");
        jpID.add(lbID);

        txtIdPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIdPaciente.setEnabled(false);
        jpID.add(txtIdPaciente);

        jpNome.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbNome.setText("Nome");
        jpNome.add(lbNome);
        jpNome.add(txtNome);

        jpEmail.setLayout(new java.awt.GridLayout(1, 2, -120, 15));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbEmail.setText("E-mail");
        jpEmail.add(lbEmail);
        jpEmail.add(txtEmail);

        javax.swing.GroupLayout jpInfoDadosLayout = new javax.swing.GroupLayout(jpInfoDados);
        jpInfoDados.setLayout(jpInfoDadosLayout);
        jpInfoDadosLayout.setHorizontalGroup(
            jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jpID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInfoDadosLayout.setVerticalGroup(
            jpInfoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpDados.add(jpInfoDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 160));
        jpDados.setOpaque(false);

        jpInfoContato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInfo3x3.setLayout(new java.awt.GridLayout(3, 1, 0, 8));

        lbDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbDataNascimento.setText("Data de Nascimento");
        jpInfo3x3.add(lbDataNascimento);

        lbCPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCPF.setText("CPF");
        jpInfo3x3.add(lbCPF);

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTelefone.setText("Tel. Celular");
        jpInfo3x3.add(lbTelefone);

        jpInfoContato.add(jpInfo3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 140));

        jpTxt3x3.setLayout(new java.awt.GridLayout(3, 1, 0, 20));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpTxt3x3.add(txtDataNascimento);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpTxt3x3.add(txtCPF);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpTxt3x3.add(txtTelefone);

        jpInfoContato.add(jpTxt3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 130));

        jpDados.add(jpInfoContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 320, 150));

        jpSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpSexo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grpSexo.add(chkMasculino);
        chkMasculino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkMasculino.setText("Masculino");
        jpSexo.add(chkMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 90, 27));

        grpSexo.add(chkFemino);
        chkFemino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkFemino.setText("Feminino");
        jpSexo.add(chkFemino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, -1));

        jpDados.add(jpSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 560, 60));

        jpBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/confirmar 24x24.png"))); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jpBotoes.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/atualizar 24x24.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jpBotoes.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));
        btAtualizar.setVisible(false);

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-vassoura-24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jpBotoes.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 150, 40));

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout CadastroPacienteLayout = new javax.swing.GroupLayout(CadastroPaciente);
        CadastroPaciente.setLayout(CadastroPacienteLayout);
        CadastroPacienteLayout.setHorizontalGroup(
            CadastroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroPacienteLayout.createSequentialGroup()
                .addGroup(CadastroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(CadastroPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CadastroPacienteLayout.setVerticalGroup(
            CadastroPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtpTelas.addTab("Cadastrar Paciente", CadastroPaciente);

        ListarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ListarPaciente.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 300, 40));

        btLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lupa24-icon.png"))); // NOI18N
        btLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLupaActionPerformed(evt);
            }
        });
        ListarPaciente.add(btLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPaciente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 610, 10));

        jpTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Pacientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jpTabela.setLayout(new java.awt.BorderLayout());

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "E-MAIL", "DATA NASCIMENTO", "SEXO", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPacientes);

        jpTabela.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        ListarPaciente.add(jpTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 590, 200));

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListarPaciente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 610, 10));

        jpBotoes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/adicionar 24x24.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jpBotoes1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/editar 24x24.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jpBotoes1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 150, 40));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/lixera 24x24.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jpBotoes1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 150, 40));

        ListarPaciente.add(jpBotoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 610, 60));

        btListarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/icons/icons8-multidão-24.png"))); // NOI18N
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });
        ListarPaciente.add(btListarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 40));

        cmbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Data Nasc", "ID", "CPF" }));
        ListarPaciente.add(cmbOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 40));

        lbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPesquisar.setText("Pesquisar");
        ListarPaciente.add(lbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        jtpTelas.addTab("Listar Pacientes", ListarPaciente);

        getContentPane().add(jtpTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 610, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/TelaPaciente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    
    
    private void habilitarBotoes() {
        if(pacienteSelecionado == null){
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
        lbCPF.setForeground(defaultLabelColor);
        lbEmail.setForeground(defaultLabelColor);
        jpSexo.setForeground(defaultLabelColor);
        lbDataNascimento.setForeground(defaultLabelColor);
        lbTelefone.setForeground(defaultLabelColor);
        jpSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); 
        cmbOpcao.setForeground(defaultLabelColor);
    }
    
    private boolean validarBusca(){
        setCor();
        String msgErro = "";
        if(txtPesquisar.getText().isEmpty()){
            msgErro += "Insira um valor!\n";
        }
        
        if(cmbOpcao.getSelectedIndex() == 1 && !UtilGeral.verificarFormatoData(txtPesquisar.getText())){
            msgErro += "Data invalida!\n";
        }
        
        if(cmbOpcao.getSelectedIndex() == 2 && !UtilGeral.isInteger(txtPesquisar.getText())){
            msgErro += "ID invalido!\n";
        }
        
        if(cmbOpcao.getSelectedIndex() == 3 && !UtilCPF.validarCPF(txtPesquisar.getText())){
            msgErro += "CPF Invalido \n";
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
            msgErro += "Nome invalido\n";
            lbNome.setForeground(Color.red);
        }
        
        if(txtCPF.getText().isEmpty()){
            msgErro += "CPF invalido\n";
            lbCPF.setForeground(Color.red);
        }
        
        if(!gerIG.getGerDominio().validarEmail(txtEmail.getText(), Pessoa.class, pacienteSelecionado)){
            msgErro += "Email invalido ou já cadastrado\n";
            lbEmail.setForeground(Color.red);
        }
        
        if(!(chkMasculino.isSelected() || chkFemino.isSelected())){
            msgErro += "Selecione um sexo\n";
            jpSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        }
        
        if(!UtilGeral.verificarFormatoData(txtDataNascimento.getText())){
            msgErro += "Data de nascimento invalida\n";
            lbDataNascimento.setForeground(Color.red);
        }
        
        if(!UtilGeral.validarTelefone(txtTelefone.getText())){
            msgErro += "Telefone ou dd invalido\n";
            lbTelefone.setForeground(Color.red);
        }
        
        if(!gerIG.getGerDominio().validarCPF(txtCPF.getText(), Pessoa.class, pacienteSelecionado)){
            lbCPF.setForeground(Color.red);
            msgErro += "CPF Invalido ou já cadastrado\n";
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
        txtIdPaciente.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        grpSexo.clearSelection();
        txtDataNascimento.setText("");
        txtTelefone.setText("");
    }
    
  
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText(); 
        String telefone = txtTelefone.getText();
        String sexo = gerIG.checarNomeBotao(grpSexo);
        String data = txtDataNascimento.getText();
        if(validarCampos()){
            try {
                Date dt = UtilGeral.strToDate(data);
                if(pacienteSelecionado == null){
                    gerIG.getGerDominio().inserirPaciente(nome, cpf, email, dt, telefone, sexo);
                    JOptionPane.showMessageDialog(this, "Paciente inserido com sucesso.", "Inserir Paciente", JOptionPane.INFORMATION_MESSAGE  );
                }else{
                    gerIG.getGerDominio().alterarPaciente(pacienteSelecionado, nome, cpf, email, dt, telefone, sexo);
                    JOptionPane.showMessageDialog(this, "Paciente alterado com sucesso.", "alterado Paciente", JOptionPane.INFORMATION_MESSAGE  );
                    pacienteSelecionado = null;
                    habilitarBotoes();
                }
            } catch (HeadlessException | ParseException e) {
               JOptionPane.showMessageDialog(this, e, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            habilitarBotoes();
            formComponentShown(null);
            limparCampos();
        }
        
    }//GEN-LAST:event_btConfirmarActionPerformed
  
    
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limparCampos();
        jtpTelas.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int opcao = tbPacientes.getSelectedRow();
        if(opcao >= 0){ 
             pacienteSelecionado = (Paciente) tbPacientes.getValueAt(opcao, 1);          
            setCor();
            habilitarBotoes();
            txtIdPaciente.setText(String.valueOf(pacienteSelecionado.getIdPessoa()));
            txtNome.setText(pacienteSelecionado.getNomePessoa());
            txtCPF.setText(pacienteSelecionado.getCpf());
            txtEmail.setText(pacienteSelecionado.getEmail());
            
            if(pacienteSelecionado.getSexo().equals("Masculino")){
                chkMasculino.setSelected(true);
            }else{
                chkFemino.setSelected(true);
            }
            txtDataNascimento.setText(UtilGeral.formatarDataParaInterface(pacienteSelecionado.getDataNascimento().toString()));
            txtTelefone.setText(UtilGeral.removerCaracteresTelefone(pacienteSelecionado.getTelefone()));
            
            jtpTelas.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(this,"Selecione uma linha.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btEditarActionPerformed

    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = tbPacientes.getSelectedRow();
        if ( linha >= 0 ) {
            try {
                Paciente fun = (Paciente) tbPacientes.getValueAt(linha, 1);
                if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse Paciente?", "Título", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
                    gerIG.getGerDominio().excluir(fun);
                    ( (DefaultTableModel) tbPacientes.getModel() ).removeRow(linha);
                    JOptionPane.showMessageDialog(this, "Paciente " + fun.getNomePessoa()+ " excluído com sucesso.", "PESQUISAR Paciente", JOptionPane.INFORMATION_MESSAGE  );
                }
                
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Paciente", JOptionPane.ERROR_MESSAGE  );
            }             
        }        
        else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha.", "Pesquisar Paciente", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    
    
    private void btLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLupaActionPerformed
        if(validarBusca()){
            try {
                List<Paciente> lista = gerIG.getGerDominio().pesquisarPaciente(txtPesquisar.getText(), cmbOpcao.getSelectedIndex() );

                // APAGA as linhas da tabela
                ( (DefaultTableModel) tbPacientes.getModel() ).setNumRows(0);

                for (Paciente cli : lista ) {
                    // ADICIONAR LINHA NA TABELA        
                    ( (DefaultTableModel) tbPacientes.getModel() ).addRow( cli.toArray() );                
                }

            
            } catch (HibernateException | ParseException  ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Tipo Consulta", JOptionPane.ERROR_MESSAGE  );
            } 
        }
        limparCampos();
    }//GEN-LAST:event_btLupaActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        formComponentShown(null);
        limparCampos();
        //lista todos que estão no banco
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            btLimparActionPerformed(null);
            gerIG.carregarTabela(tbPacientes, Paciente.class);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar pacientes " + ex.getMessage() );
        }
    }//GEN-LAST:event_formComponentShown

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        pacienteSelecionado = null;
        habilitarBotoes();
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroPaciente;
    private javax.swing.JPanel ListarPaciente;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btLupa;
    private javax.swing.JButton btNovo;
    private javax.swing.JCheckBox chkFemino;
    private javax.swing.JCheckBox chkMasculino;
    private javax.swing.JComboBox<String> cmbOpcao;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBotoes1;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpEmail;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpInfo3x3;
    private javax.swing.JPanel jpInfoContato;
    private javax.swing.JPanel jpInfoDados;
    private javax.swing.JPanel jpNome;
    private javax.swing.JPanel jpSexo;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JPanel jpTxt3x3;
    private javax.swing.JTabbedPane jtpTelas;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtIdPaciente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
