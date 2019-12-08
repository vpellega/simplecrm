/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import classes.ConexaoPostgresql;
import classes.TextDocument;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estoque
 */
public class PesquisaViagemAbrir extends javax.swing.JInternalFrame {

    private ConexaoPostgresql Conexao;
    private MovimentacaoViagemAbrir MovViAb;
    private TextDocument TD;
    
    String Meleca;
    
    /**
     * Creates new form PesquisaViagemAbrir
     */
    public PesquisaViagemAbrir() {
        initComponents();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaViagemAbrir().setVisible(true);
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

        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPesquisa = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pesquisa Viagens Abertas");

        jtfPesquisa.setDocument(TD = new TextDocument(20));
        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });

        jtbPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jtbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Técnico", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPesquisa);
        if (jtbPesquisa.getColumnModel().getColumnCount() > 0) {
            jtbPesquisa.getColumnModel().getColumn(0).setResizable(false);
            jtbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtbPesquisa.getColumnModel().getColumn(1).setResizable(false);
            jtbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(300);
            jtbPesquisa.getColumnModel().getColumn(2).setResizable(false);
            jtbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addComponent(jtfPesquisa))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String SQL;
            
            SQL = "select tv.codigo, tp.nome, tv.destino from t_viagem tv ";
            SQL = SQL + "inner join t_pessoa tp on tp.codigo = tv.tecnico_cod ";
            SQL = SQL + "where UPPER(tp.nome) like '%" + jtfPesquisa.getText().toUpperCase() + "%' ";
            SQL = SQL + "and tv.exclusao = 0 ";
//            SQL = SQL + "and tv.data_finalizar is not null ";
            SQL = SQL + "order by tv.codigo ";
            
            Visualizar(SQL);
        }
        
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jtbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisaMouseClicked

        if (Meleca.equals("ViagemAbrir")){
            MovViAb.CarregarDados(jtbPesquisa.getValueAt(jtbPesquisa.getSelectedRow(), 0).toString());
        }

        this.dispose();
        
    }//GEN-LAST:event_jtbPesquisaMouseClicked

    private void Visualizar(String SQL){

      try{

        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
        Conexao.setSQL(SQL);

        DefaultTableModel modelo2;
        modelo2 = (DefaultTableModel)jtbPesquisa.getModel();
        modelo2.setRowCount(0);

        ResultSet RS = Conexao.Consultar();

        while(RS.next()){
            DefaultTableModel Tabela = (DefaultTableModel) jtbPesquisa.getModel();
            Object[] Linha = {RS.getString("codigo"), RS.getString("nome"),RS.getString("destino")};
            Tabela.addRow(Linha);
        }

      }

      catch(Exception e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
      }

      Conexao.Desconectar();

    }
    
    public void Validador(String Parametro){
        this.Meleca =  Parametro;        
    }

    public void SetViagem(MovimentacaoViagemAbrir MVA){
        this.MovViAb = MVA;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbPesquisa;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables
}
