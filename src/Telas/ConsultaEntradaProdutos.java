/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import classes.ConexaoPostgresql;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ConsultaEntradaProdutos extends javax.swing.JInternalFrame {
    
    private ConexaoPostgresql Conexao;

    /**
     * Creates new form ConsultaEntradaProdutos
     */
    public ConsultaEntradaProdutos() {
        initComponents();
        CarregaEntrada();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEntradaProdutos().setVisible(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtfValorTotal = new javax.swing.JFormattedTextField();
        jlbValorTotal = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta de Entrada de Produtos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Qtde", "Unidade", "Valor", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(450);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fornecedor", "Data de Entrada", "Conta", "Item da Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(225);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(225);
        }

        jtfValorTotal.setEditable(false);
        jtfValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jlbValorTotal.setText("Valor Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbValorTotal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        CarregaEntradaItem(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void CarregaEntrada(){

        String SQL;

        SQL = "select ten.codigo, ten.num_orcamento, ten.data, (tag.nome) as agenda, (ttc.nome) as tipoconta, (ttci.nome) as tipocontaitem, ";
        SQL = SQL + "ten.valor_total ";
        SQL = SQL + "from t_entrada ten ";
        SQL = SQL + "inner join t_agenda tag on tag.codigo = ten.agenda_cod ";
        SQL = SQL + "inner join t_tipoconta ttc on ttc.codigo = ten.tipo_conta ";
        SQL = SQL + "inner join t_tipocontaitem ttci on ttci.codigo = ten.tipo_conta_item_cod ";
        SQL = SQL + "where ten.exclusao = 0 ";
        SQL = SQL + "order by ten.codigo ";
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ((DefaultTableModel) jTable2.getModel()).setNumRows(0);
        jTable2.updateUI();

        ResultSet RS = Conexao.Consultar();

        try{

            while (RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable2.getModel();
                Object[] CarLinha = {RS.getString("codigo"),RS.getString("agenda"),RS.getString("data"),RS.getString("tipoconta"),RS.getString("tipocontaitem")};
                Tabela.addRow(CarLinha);
            }

        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

    }
    
    private void CarregaEntradaItem(String Entrada){

        String SQL;
        Double ValorTotal = 0.00;

        SQL = "select tei.codigo, (tpr.nome) as produto, tun.abreviacao, tei.qtde, tei.valor ";
        SQL = SQL + "from t_entrada_item tei ";
        SQL = SQL + "inner join t_produto tpr on tpr.codigo = tei.produto_cod ";
        SQL = SQL + "inner join t_unidade tun on tun.codigo = tpr.codigomedida ";
        SQL = SQL + "where tei.exclusao = 0 ";
        SQL = SQL + "and tei.entrada_cod = " + Entrada + " ";
        SQL = SQL + "order by tei.codigo ";
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jTable1.updateUI();

        ResultSet RS = Conexao.Consultar();
        
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(Locale.US);

        try{

            while (RS.next()){
                
                DefaultTableModel Tabela = (DefaultTableModel) jTable1.getModel();
                Object[] CarLinha = {RS.getString("codigo"),RS.getString("produto"), RS.getString("abreviacao"), RS.getString("qtde"),RS.getString("valor")};
                ValorTotal = ValorTotal + (Double.parseDouble(RS.getString("qtde")) * Double.parseDouble(RS.getString("valor")));
                Tabela.addRow(CarLinha);
            }
            
            jtfValorTotal.setText(numberFormatter.format(ValorTotal));

        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlbValorTotal;
    private javax.swing.JFormattedTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
