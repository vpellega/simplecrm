/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import classes.ConexaoPostgresql;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

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
public class MovimentacaoChamadoAndamento extends javax.swing.JInternalFrame {
    
    private ConexaoPostgresql Conexao;

    /** Creates new form MovimentacaoChamadoAndamento */
    public MovimentacaoChamadoAndamento() {
        initComponents();
        Limpar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdcData = new com.toedter.calendar.JDateChooser();
        jtfTituloAndamento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jlbData = new javax.swing.JLabel();
        jlbTituloAndamento = new javax.swing.JLabel();
        jlbDescricaoAndamento = new javax.swing.JLabel();
        jbtSalvar = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jtfNumeroChamado = new javax.swing.JFormattedTextField();
        jlbChamado = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Andamento do Chamado");

        jdcData.setEnabled(false);

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jlbData.setText("Data");

        jlbTituloAndamento.setText("Título do Andamento");

        jlbDescricaoAndamento.setText("Descrição do Andamento");

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salvar.png"))); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Novo.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jtfNumeroChamado.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtfNumeroChamado.setEnabled(false);

        jlbChamado.setText("Chamado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbDescricaoAndamento)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfNumeroChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbChamado))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbData))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbTituloAndamento)
                                .addComponent(jtfTituloAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbData)
                    .addComponent(jlbTituloAndamento)
                    .addComponent(jlbChamado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfTituloAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfNumeroChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbDescricaoAndamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jdcData, jtfNumeroChamado, jtfTituloAndamento});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

//        if (jtfCodigo.getText().equals("")){
//            Fun = new Funcoes();
//            jtfCodigo.setText(Fun.Proximo("codigo", "t_pessoa", ""));
//        }
//
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
//        Conexao.setSQL("select * from t_pessoa where codigo = " + jtfCodigo.getText() + " and exclusao = 0");
//        ResultSet RS = Conexao.Consultar();

        String myDate = null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        myDate = sdf.format(jdcData.getDate());

        try {

                String SQL;

                SQL = "insert into t_chamado_item (codigo_chamado, data, titulo, andamento, exclusao) values (";
                SQL = SQL + jtfNumeroChamado.getText() + ", '" + myDate + "', '" + jtfTituloAndamento.getText() + "', '" + jtaDescricao.getText() + "', ";
                SQL = SQL + "0)";

                Conexao.setSQL(SQL);
                Conexao.Executar();

        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

        Limpar();

        jtfTituloAndamento.requestFocus();
        
        this.dispose();

    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        jtfTituloAndamento.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void Limpar(){
        
        jdcData.setDate(new java.util.Date());
        jtfTituloAndamento.setText("");
        jtaDescricao.setText("");
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoChamadoAndamento().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    public void NumeroChamado(String Chamado){
        
        jtfNumeroChamado.setText(Chamado);        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel jlbChamado;
    private javax.swing.JLabel jlbData;
    private javax.swing.JLabel jlbDescricaoAndamento;
    private javax.swing.JLabel jlbTituloAndamento;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JFormattedTextField jtfNumeroChamado;
    private javax.swing.JFormattedTextField jtfTituloAndamento;
    // End of variables declaration//GEN-END:variables

}
