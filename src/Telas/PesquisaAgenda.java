/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PesquisaAgenda.java
 *
 * Created on 28/12/2009, 19:59:40
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
 * @author Jeff
 */
public class PesquisaAgenda extends javax.swing.JInternalFrame {

    private ConexaoPostgresql Conexao;
    private CadastroAgenda Agn;
    private TextDocument TD;
    
    String Meleca;

    /** Creates new form AgendaPesquisa */
    public PesquisaAgenda() { 
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPesquisa = new javax.swing.JTable();
        jtfPesquisa = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Agenda Pesquisa");

        jtbPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jtbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Apelido"
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
            jtbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(450);
            jtbPesquisa.getColumnModel().getColumn(2).setResizable(false);
            jtbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(225);
        }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPesquisa)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisaMouseClicked
        
        if (Meleca.equals("Agenda")){
            Agn.CarregarDados(jtbPesquisa.getValueAt(jtbPesquisa.getSelectedRow(), 0).toString());
        }

        this.dispose();

}//GEN-LAST:event_jtbPesquisaMouseClicked

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String SQL;
            SQL = "select codigo, nome, apelidofantasia from t_pessoa where UPPER(nome) like '%" + jtfPesquisa.getText().toUpperCase() + "%' and exclusao = 0 order by nome ";
            Visualizar(SQL);
        }
}//GEN-LAST:event_jtfPesquisaKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaAgenda().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

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
            Object[] Linha = {RS.getString("codigo"), RS.getString("nome"),RS.getString("apelidofantasia")};
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

    public void SetCidade(CadastroAgenda Agnd){
        this.Agn = Agnd;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbPesquisa;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables

}
