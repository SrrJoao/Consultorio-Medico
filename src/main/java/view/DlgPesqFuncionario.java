/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControllerView;
import domain.Funcionario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DlgPesqFuncionario extends javax.swing.JDialog {

    private ControllerView gerIG;
    private Funcionario funSelecionado;

    public DlgPesqFuncionario(java.awt.Frame parent, boolean modal, ControllerView gerIG) {
        super(parent, modal);
        initComponents();
        this.gerIG = gerIG;
        funSelecionado = null;
        
              
    }

    public Funcionario getFuncionario() {
        return funSelecionado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox();
        btnExcluir = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpTabelaFuncionarios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Funcionário");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 310, 40));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, 40));

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 150, 50));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 100, 50));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Bairro", "Mês", "CPF" }));
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 40));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 50));

        btnRelatorios.setText("Relatório");
        getContentPane().add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 110, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, -1, -1));

        jpTabelaFuncionarios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Funcionários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jpTabelaFuncionarios.setLayout(new java.awt.BorderLayout());

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "DATA ADMISSÃO", "E-MAIL", "SENHA", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbFuncionarios);

        jpTabelaFuncionarios.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpTabelaFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 580, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imgs/TelaPaciente.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         try {
            gerIG.carregarTabela(tbFuncionarios, Funcionario.class);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar funcionários " + ex.getMessage() );
        }
    }//GEN-LAST:event_formComponentShown

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        /*
        try {
            List<Paciente> lista = gerIG.getGerDominio().pesquisarCliente(txtPesq.getText(), cmbTipo.getSelectedIndex() );

            // APAGA as linhas da tabela
            ( (DefaultTableModel) tblClientes.getModel() ).setNumRows(0);

            for (Cliente cli : lista ) {
                // ADICIONAR LINHA NA TABELA
                ( (DefaultTableModel) tblClientes.getModel() ).addRow( cli.toArray() );
            }

        } catch (HibernateException | ParseException  ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Cliente", JOptionPane.ERROR_MESSAGE  );
        }

        */
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed

        int linha = tbFuncionarios.getSelectedRow();
        if ( linha >= 0 ) {
            funSelecionado = (Funcionario) tbFuncionarios.getValueAt(linha, 1);
        }
        else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE  );
        }

        this.setVisible(false);
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        funSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        /*
        int linha = tblClientes.getSelectedRow();
        if ( linha >= 0 ) {

            try {
                Cliente cli = (Cliente) tblClientes.getValueAt(linha, 0);
                if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse cliente?", "Título", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
                    gerIG.getGerDominio().excluir(cli);
                    ( (DefaultTableModel) tblClientes.getModel() ).removeRow(linha);
                    JOptionPane.showMessageDialog(this, "Cliente " + cli.getNome() + " excluído com sucesso.", "ERRO ao PESQUISAR Cliente", JOptionPane.ERROR_MESSAGE  );
                }

            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Cliente", JOptionPane.ERROR_MESSAGE  );
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE  );
        }
        */
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpTabelaFuncionarios;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}