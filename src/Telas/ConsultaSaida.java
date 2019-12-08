/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import classes.ConexaoPostgresql;
import classes.Funcoes;
import classes.TextDocument;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estoque
 */
public class ConsultaSaida extends javax.swing.JInternalFrame {
    
    private ConexaoPostgresql Conexao;
    private Funcoes Fun;    
    private TextDocument TD;
    
    String Codigo;

    /**
     * Creates new form ConsultaEntrada
     */
    public ConsultaSaida() {
        initComponents();
        Limpar();
        Opcao();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSaida().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlbDanfe = new javax.swing.JLabel();
        jtfDanfe = new javax.swing.JFormattedTextField();
        jdcDataDanfe = new com.toedter.calendar.JDateChooser();
        jlbDataDanfe = new javax.swing.JLabel();
        jlbFornecedor = new javax.swing.JLabel();
        jtfCodigoFornecedor = new javax.swing.JFormattedTextField();
        jtfNomeFornecedor = new javax.swing.JFormattedTextField();
        jtfNomeProduto = new javax.swing.JFormattedTextField();
        jtfCodigoProduto = new javax.swing.JFormattedTextField();
        jlbProduto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrbDanfe = new javax.swing.JRadioButton();
        jrbDtDanfe = new javax.swing.JRadioButton();
        jrbFornecedor = new javax.swing.JRadioButton();
        jrbProduto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtfValorTotal = new javax.swing.JFormattedTextField();
        jlbValorTotal = new javax.swing.JLabel();
        jlbObs = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpObs = new javax.swing.JTextPane();
        jbtExecConsulta = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta Entrada");

        jlbDanfe.setText("DANFE");

        jtfDanfe.setEnabled(false);

        jdcDataDanfe.setEnabled(false);

        jlbDataDanfe.setText("Data da DANFE");

        jlbFornecedor.setText("Fornecedor (F12)");

        jtfCodigoFornecedor.setEnabled(false);
        jtfCodigoFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoFornecedorFocusLost(evt);
            }
        });
        jtfCodigoFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoFornecedorKeyPressed(evt);
            }
        });

        jtfNomeFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNomeFornecedor.setEnabled(false);

        jtfNomeProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNomeProduto.setEnabled(false);

        jtfCodigoProduto.setEnabled(false);
        jtfCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoProdutoFocusLost(evt);
            }
        });
        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyPressed(evt);
            }
        });

        jlbProduto.setText("Produto (F12)");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções de Consulta"));

        buttonGroup1.add(jrbDanfe);
        jrbDanfe.setText("DANFE");
        jrbDanfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbDanfeMouseClicked(evt);
            }
        });
        jrbDanfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDanfeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbDtDanfe);
        jrbDtDanfe.setText("Data da DANFE");
        jrbDtDanfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbDtDanfeMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFornecedor);
        jrbFornecedor.setSelected(true);
        jrbFornecedor.setText("Fornecedor");
        jrbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFornecedorMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbProduto);
        jrbProduto.setText("Produto");
        jrbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbDanfe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDtDanfe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbDanfe)
                    .addComponent(jrbDtDanfe)
                    .addComponent(jrbFornecedor)
                    .addComponent(jrbProduto))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Pedido", "DANFE", "Data DANFE", "Data Sistema", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(500);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código Produto", "Produto", "Qtde", "Valor", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(500);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jtfValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfValorTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfValorTotal.setEnabled(false);

        jlbValorTotal.setText("Valor Total:");

        jlbObs.setText("OBS");

        jtpObs.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtpObs.setEnabled(false);
        jScrollPane3.setViewportView(jtpObs);

        jbtExecConsulta.setText("Consultar");
        jbtExecConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExecConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDanfe)
                            .addComponent(jtfDanfe, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDataDanfe)
                            .addComponent(jdcDataDanfe, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCodigoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbProduto)
                            .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExecConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfCodigoFornecedor, jtfCodigoProduto});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbDanfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDanfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbDataDanfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataDanfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtExecConsulta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbValorTotal)
                    .addComponent(jlbObs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFornecedorFocusLost

        if (!(jtfCodigoFornecedor.getText().trim().equals(""))) {

            jtfNomeFornecedor.setText(NomeFornecedor(Integer.parseInt(jtfCodigoFornecedor.getText())));

            jtfCodigoProduto.requestFocus();

        }

    }//GEN-LAST:event_jtfCodigoFornecedorFocusLost

    private void jtfCodigoFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoFornecedorKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            jtfNomeFornecedor.setText(NomeFornecedor(Integer.parseInt(jtfCodigoFornecedor.getText())));

            jtfCodigoProduto.requestFocus();

        }

        if(evt.getKeyCode() == KeyEvent.VK_F12){

            SubPesquisaPessoa A = new SubPesquisaPessoa();
            A.setVisible(true);
            JDesktopPane JDP = this.getDesktopPane();
            JDP.add(A);
            A.centralizar(JDP);
            try{
                A.setSelected(true);
                A.SetSubConsultaSaida(this);
                A.Validador("ConsultaSaida");
            }catch (Exception E){
                JOptionPane.showMessageDialog(null, "Erro: " + E);
            }
            A.setVisible(true);

        }

    }//GEN-LAST:event_jtfCodigoFornecedorKeyPressed

    private void jtfCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoFocusLost

        if (!(jtfCodigoProduto.getText().trim().equals(""))) {

            jtfNomeProduto.setText(NomeProduto(Integer.parseInt(jtfCodigoProduto.getText())));

        }

    }//GEN-LAST:event_jtfCodigoProdutoFocusLost

    private void jtfCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            jtfNomeProduto.setText(NomeProduto(Integer.parseInt(jtfCodigoProduto.getText())));

        }

        if(evt.getKeyCode() == KeyEvent.VK_F12){

            SubPesquisaProduto A = new SubPesquisaProduto();
            A.setVisible(true);
            JDesktopPane JDP = this.getDesktopPane();
            JDP.add(A);
            A.centralizar(JDP);
            try{
                A.setSelected(true);
                A.SetSubConsultaSaida(this);
                A.Validador("ConsultaSaida");
            }catch (Exception E){
                JOptionPane.showMessageDialog(null, "Erro: " + E);
            }
            A.setVisible(true);

        }

    }//GEN-LAST:event_jtfCodigoProdutoKeyPressed

    private void jrbDanfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbDanfeMouseClicked
        Opcao();
    }//GEN-LAST:event_jrbDanfeMouseClicked

    private void jrbDtDanfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbDtDanfeMouseClicked
        Opcao();
    }//GEN-LAST:event_jrbDtDanfeMouseClicked

    private void jrbFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFornecedorMouseClicked
        Opcao();
    }//GEN-LAST:event_jrbFornecedorMouseClicked

    private void jrbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbProdutoMouseClicked
        Opcao();
    }//GEN-LAST:event_jrbProdutoMouseClicked

    private void jbtExecConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExecConsultaActionPerformed
        
        if (jrbDanfe.isSelected()){
            if(!(jtfDanfe.getText().equals(""))){
               CarregarDados(); 
            }
        }
        
        if (jrbDtDanfe.isSelected()){
            if(!(jdcDataDanfe.getDate().equals(""))){
               CarregarDados(); 
            }
        }
        
        if (jrbFornecedor.isSelected()){
            if(!(jtfCodigoFornecedor.getText().equals(""))){
               CarregarDados(); 
            }
        }
        
        if (jrbProduto.isSelected()){
            if(!(jtfCodigoFornecedor.getText().equals(""))){
               CarregarDados(); 
            }
        }
        
    }//GEN-LAST:event_jbtExecConsultaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel tableModel2 =(DefaultTableModel) jTable2.getModel();  
        tableModel2.setNumRows(0); 
        
        Codigo = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        
        CarregarDadosItem(String.valueOf(Codigo));
        CarregarDadosObs(String.valueOf(Codigo));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jrbDanfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDanfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDanfeActionPerformed

    public String NomeFornecedor (int CodigoFabricante){
    
        String Fabricante = null;
        
        Fun = new Funcoes();
        Fabricante = Fun.NomePessoa(CodigoFabricante);
        
        return Fabricante;        
    
    }
    
    public void NomeFornecedorViaF12 (int CodigoFabricante){
        
        jtfCodigoFornecedor.setText(String.valueOf(CodigoFabricante));
        jtfNomeFornecedor.setText(NomeFornecedor(CodigoFabricante));
        
    }
    
    public String NomeProduto (int CodigoProduto){
    
        String Produto = null;
        
        Fun = new Funcoes();
        Produto = Fun.NomeProduto(CodigoProduto);
        
        return Produto;        
    
    }
    
    public void NomeProdutoViaF12 (int CodigoProduto){
        
        jtfCodigoProduto.setText(String.valueOf(CodigoProduto));
        jtfNomeProduto.setText(NomeProduto(CodigoProduto));
        
    }  
    
    private void Opcao (){
        
        if (jrbDanfe.isSelected()){
            jtfDanfe.setEnabled(true);
            jdcDataDanfe.setEnabled(false);
            jtfCodigoFornecedor.setEnabled(false);
            jtfCodigoProduto.setEnabled(false);
        }
        
        if (jrbDtDanfe.isSelected()){
            jtfDanfe.setEnabled(false);
            jdcDataDanfe.setEnabled(true);
            jtfCodigoFornecedor.setEnabled(false);
            jtfCodigoProduto.setEnabled(false);
        }
        
        if (jrbFornecedor.isSelected()){
            jtfDanfe.setEnabled(false);
            jdcDataDanfe.setEnabled(false);            
            jtfCodigoFornecedor.setEnabled(true);
            jtfCodigoProduto.setEnabled(false);
        }
        
        if (jrbProduto.isSelected()){
            jtfDanfe.setEnabled(false);
            jdcDataDanfe.setEnabled(false);            
            jtfCodigoFornecedor.setEnabled(false);
            jtfCodigoProduto.setEnabled(true);
        }
        
    }

     public void CarregarDados(){
        
        LimparTabela();
        
        String SQL;
        String myDate = null;
        String Codigo, Pedido, Danfe, DataDanfe, DataSistema, CodFornecedor, NomeFornecedor, Obs;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        myDate = sdf.format(jdcDataDanfe.getDate());  
        
        SQL = "select ts.codigo, ts.pedido, ts.danfe, to_char(ts.data_danfe,'DD/MM/YYYY') as datadanfe, ";
        SQL = SQL + "to_char(ts.data_sistema,'DD/MM/YYYY') as datasistema, ";
        SQL = SQL + "ts.fornecedor_cod, (tp.nome) as fornecedor, ts.obs ";
        SQL = SQL + "from t_saida ts ";
        SQL = SQL + "inner join t_pessoa tp on tp.codigo = ts.fornecedor_cod ";

        if (jrbProduto.isSelected()){
            SQL = SQL + "inner join t_entrada_item tei on tei.entrada_cod = ts.codigo ";
            SQL = SQL + "inner join t_produto tpr on tpr.codigo = tei.produto_cod ";
        }
                
        SQL = SQL + "where ts.exclusao = 0 ";
        
        if (jrbDanfe.isSelected()){
            SQL = SQL + "and ts.danfe = '" + jtfDanfe.getText() + "' ";
        }
        
        if (jrbDtDanfe.isSelected()){
            SQL = SQL + "and ts.data_danfe = '" + myDate + "' ";
        }
        
        if (jrbFornecedor.isSelected()){
            SQL = SQL + "and ts.fornecedor_cod = " + jtfCodigoFornecedor.getText() + " ";
        }
        
        if (jrbProduto.isSelected()){
            SQL = SQL + "and tpr.codigo = " + jtfCodigoProduto.getText() + " ";
        }        
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();
        
        try{
            while (RS.next()){
                
                Codigo = RS.getString("codigo");
                Pedido = RS.getString("pedido");
                Danfe = RS.getString("danfe");
                DataDanfe = RS.getString("datadanfe");
                DataSistema = RS.getString("datasistema");
                //CodFornecedor = RS.getString("fornecedor_cod");
                NomeFornecedor = RS.getString("fornecedor");
                Obs = RS.getString("obs");
                
                DefaultTableModel Tabela = (DefaultTableModel) jTable1.getModel();
                Object[] CarLinha = {Codigo,Pedido,Danfe,DataDanfe,DataSistema,NomeFornecedor};
                Tabela.addRow(CarLinha);
                
                jtpObs.setText(Obs);
                
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
      
        Conexao.Desconectar();
        
    }
    
    private void CarregarDadosItem(String Codigo){
        
        String SQL;
        String CodigoItem = "", CodigoProduto = "", Produto = "", Qtde = "", SubTotal = "";
        Float vSubTotal = Float.parseFloat("0"), vTotal = Float.parseFloat("0");
        
        SQL = "select tsi.codigo, tsi.saida_cod, tsi.produto_cod, (tpr.nome) as produto, tsi.qtde, tsi.valor ";
        SQL = SQL + "from t_saida_item tsi ";
        SQL = SQL + "inner join t_produto tpr on tpr.codigo = tsi.produto_cod ";
        SQL = SQL + "where tsi.exclusao = 0 ";
        SQL = SQL + "and tsi.saida_cod = " + Codigo + " ";        
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();
        
        try{
            while (RS.next()){
                
                CodigoItem = RS.getString("codigo");
                CodigoProduto = RS.getString("produto_cod");
                Produto = RS.getString("produto");
                Qtde = RS.getString("qtde");
                SubTotal = RS.getString("valor");
                vSubTotal = Float.parseFloat(SubTotal) * Float.parseFloat(Qtde);
                
                DefaultTableModel Tabela = (DefaultTableModel) jTable2.getModel();
                Object[] CarLinha = {CodigoItem,CodigoProduto,Produto,Qtde,SubTotal,vSubTotal};
                Tabela.addRow(CarLinha);               
                
                vTotal = vTotal + vSubTotal;
            }
            
            jtfValorTotal.setText(String.valueOf(vTotal));
            
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
      
        Conexao.Desconectar();
        
    }
    
    private void CarregarDadosObs(String Codigo){
        
        String SQL = "select obs from t_saida where codigo = " + Codigo + " ";
     
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();
        
        try{
            if (RS.next()){
                jtpObs.setText(RS.getString("obs"));
            }            
        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
      
        Conexao.Desconectar();
        
    }
     
    private void Limpar(){
         
        jrbDanfe.setSelected(false);
        jrbDtDanfe.setSelected(false);
        jrbFornecedor.setSelected(true);
        jrbProduto.setSelected(false);

        Opcao();

        jtfDanfe.setText("");
        jdcDataDanfe.setDate(new java.util.Date());
        jtfCodigoFornecedor.setText("");
        jtfNomeFornecedor.setText("");
        jtfCodigoProduto.setText("");
        jtfNomeProduto.setText("");

        LimparTabela();
         
    }
     
     private void LimparTabela(){
         
        DefaultTableModel tableModel =(DefaultTableModel) jTable1.getModel();  
        tableModel.setNumRows(0);
        
        DefaultTableModel tableModel2 =(DefaultTableModel) jTable2.getModel();  
        tableModel2.setNumRows(0); 
         
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtExecConsulta;
    private com.toedter.calendar.JDateChooser jdcDataDanfe;
    private javax.swing.JLabel jlbDanfe;
    private javax.swing.JLabel jlbDataDanfe;
    private javax.swing.JLabel jlbFornecedor;
    private javax.swing.JLabel jlbObs;
    private javax.swing.JLabel jlbProduto;
    private javax.swing.JLabel jlbValorTotal;
    private javax.swing.JRadioButton jrbDanfe;
    private javax.swing.JRadioButton jrbDtDanfe;
    private javax.swing.JRadioButton jrbFornecedor;
    private javax.swing.JRadioButton jrbProduto;
    private javax.swing.JFormattedTextField jtfCodigoFornecedor;
    private javax.swing.JFormattedTextField jtfCodigoProduto;
    private javax.swing.JFormattedTextField jtfDanfe;
    private javax.swing.JFormattedTextField jtfNomeFornecedor;
    private javax.swing.JFormattedTextField jtfNomeProduto;
    private javax.swing.JFormattedTextField jtfValorTotal;
    private javax.swing.JTextPane jtpObs;
    // End of variables declaration//GEN-END:variables
}