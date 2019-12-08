/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SubPesquisaCidade.java
 *
 * Created on Dec 14, 2009, 10:01:58 PM
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
 *    This file is part of Foobar.
 *
 *   Foobar is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Foobar is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Este arquivo é parte do programa Foobar
 *
 *   Foobar é um software livre; você pode redistribuí-lo e/ou 
 *   modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 *   publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 *   Licença, ou (na sua opinião) qualquer versão.
 *
 *   Este programa é distribuído na esperança de que possa ser  útil, 
 *   mas SEM NENHUMA GARANTIA; sem uma garantia implícita de ADEQUAÇÃO
 *   a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 *   Licença Pública Geral GNU para maiores detalhes.
 *
 *   Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 *   com este programa, Se não, veja <http://www.gnu.org/licenses/>.
 *
 * 
 * @author Jeferson Slywitch - jeferson.slywitch@gmail.com
 */
public class SubPesquisaCidade extends javax.swing.JInternalFrame {

    private ConexaoPostgresql Conexao;
    private CadastroAgenda Agn;
    private TextDocument TD;
    
    String Meleca;

    /** Creates new form SubPesquisaCidade */
    public SubPesquisaCidade() {
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

        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Procura Cidade");

        jtfPesquisa.setDocument(TD = new TextDocument(20));
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPesquisa)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        System.out.println(Meleca);

        if (Meleca.equals("Agenda")){
            Agn.NomeCidadeViaF12(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        }

        this.dispose();

    }//GEN-LAST:event_jTable1MouseClicked

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaCidade();
        }
    }//GEN-LAST:event_jtfPesquisaKeyPressed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubPesquisaCidade().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    public void Validador(String Parametro){
        this.Meleca =  Parametro;        
    }

    public void SetSubCidade(CadastroAgenda Agnd){
        this.Agn = Agnd;
    }

    private void CarregaCidade(){

        String SQL;

        SQL = "select tcd.codigo, tcd.nome, (tes.nome) as estado from t_cidade tcd ";
        SQL = SQL + "inner join t_estado tes on tes.codigo = tcd.estado_cod ";
        SQL = SQL + "where UPPER(tcd.nome) like '%" + jtfPesquisa.getText().toUpperCase() + "%' ";
        SQL = SQL + "and tcd.exclusao = 0 ";
        SQL = SQL + "order by tcd.codigo ";

        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jTable1.updateUI();

        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{

            while (RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable1.getModel();
                Object[] CarLinha = {RS.getString("codigo"),RS.getString("nome"),RS.getString("estado")};
                Tabela.addRow(CarLinha);
            }

        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables

}
