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
public class MovimentacaoChamadoAbertura extends javax.swing.JInternalFrame {

    private ConexaoPostgresql Conexao;
    private Funcoes Fun;    
    private TextDocument TD;
    
    /**
     * Creates new form MovimentacaoChamado
     */
    public MovimentacaoChamadoAbertura() {
        initComponents();
        Limpar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jlbFuncionario = new javax.swing.JLabel();
        jtfCodigoFuncionario = new javax.swing.JFormattedTextField();
        jtfNomeFuncionario = new javax.swing.JFormattedTextField();
        jtfDepartamento = new javax.swing.JFormattedTextField();
        jlbTituloProblema = new javax.swing.JLabel();
        jtfTituloProblema = new javax.swing.JFormattedTextField();
        jlbChaveProblema = new javax.swing.JLabel();
        jtfCodigoChave = new javax.swing.JFormattedTextField();
        jtfDescricaoChave = new javax.swing.JFormattedTextField();
        jlbDescricaoProblema = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricaoProblema = new javax.swing.JTextArea();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jlbDataChamado = new javax.swing.JLabel();
        jdcData = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Abertura de Chamado");
        setToolTipText("");

        jlbFuncionario.setText("Funcionário (F12)");

        jtfCodigoFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoFuncionarioFocusLost(evt);
            }
        });
        jtfCodigoFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoFuncionarioKeyPressed(evt);
            }
        });

        jtfNomeFuncionario.setEnabled(false);

        jtfDepartamento.setEnabled(false);

        jlbTituloProblema.setText("Tìtulo do Problema");

        jlbChaveProblema.setText("Palavra Chave do Problema (F12)");

        jtfCodigoChave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoChaveFocusLost(evt);
            }
        });
        jtfCodigoChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoChaveKeyPressed(evt);
            }
        });

        jtfDescricaoChave.setEnabled(false);

        jlbDescricaoProblema.setText("Descrição do Problema");

        jtaDescricaoProblema.setColumns(20);
        jtaDescricaoProblema.setRows(5);
        jScrollPane1.setViewportView(jtaDescricaoProblema);

        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Novo.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salvar.png"))); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jlbDataChamado.setText("Data");

        jdcData.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfTituloProblema)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfCodigoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbFuncionario)
                            .addComponent(jlbTituloProblema))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDepartamento)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbChaveProblema)
                                .addGap(0, 306, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCodigoChave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDescricaoChave))))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDescricaoProblema)
                            .addComponent(jlbDataChamado)
                            .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDataChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTituloProblema)
                    .addComponent(jlbChaveProblema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTituloProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigoChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricaoChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbDescricaoProblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jdcData, jtfCodigoChave, jtfCodigoFuncionario, jtfDepartamento, jtfDescricaoChave, jtfNomeFuncionario, jtfTituloProblema});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        jtfCodigoFuncionario.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
        Conexao.setSQL("select * from t_pessoa where codigo = " + jtfCodigoFuncionario.getText() + " and exclusao = 0");
        ResultSet RS = Conexao.Consultar();

        String myDate = null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        myDate = sdf.format(jdcData.getDate());

        try {
            if(RS.next()){

                String SQL;

                SQL = "insert into t_chamado (data, codigo_funcionario, status, titulo_problema, codigo_chave, descricao_problema, exclusao) ";
                SQL = SQL + "values ('" + myDate + "', " + jtfCodigoFuncionario.getText() + ", 1, '" + jtfTituloProblema.getText() + "', ";
                SQL = SQL + jtfCodigoChave.getText() + ", '" + jtaDescricaoProblema.getText() + "', 0)";

                Conexao.setSQL(SQL);
                Conexao.Executar();
            }

        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

        Limpar();

        jtfCodigoFuncionario.requestFocus();
        
        this.dispose();

    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtfCodigoChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoChaveKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            jtfDescricaoChave.setText(NomeChave(Integer.parseInt(jtfCodigoChave.getText())));

        }
        
        if(evt.getKeyCode() == KeyEvent.VK_F12){
        
            SubPesquisaPalavraChave A = new SubPesquisaPalavraChave();
            A.setVisible(true);
            JDesktopPane JDP = this.getDesktopPane();
            JDP.add(A);
            A.centralizar(JDP);
            try{
                A.setSelected(true);
                A.SetSubFuncionario(this);
                A.Validador("AberturaChamado");
            }catch (Exception E){
                JOptionPane.showMessageDialog(null, "Erro: " + E);
            }
            A.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jtfCodigoChaveKeyPressed

    private void jtfCodigoFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoFuncionarioKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            jtfNomeFuncionario.setText(NomeFuncionario(Integer.parseInt(jtfCodigoFuncionario.getText())));
            
            jtfTituloProblema.requestFocus();

        }
        
        if(evt.getKeyCode() == KeyEvent.VK_F12){
        
            SubPesquisaAberturaChamado A = new SubPesquisaAberturaChamado();
            A.setVisible(true);
            JDesktopPane JDP = this.getDesktopPane();
            JDP.add(A);
            A.centralizar(JDP);
            try{
                A.setSelected(true);
                A.SetSubFuncionario(this);
                A.Validador("Funcionario");
            }catch (Exception E){
                JOptionPane.showMessageDialog(null, "Erro: " + E);
            }
            A.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jtfCodigoFuncionarioKeyPressed

    private void jtfCodigoFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFuncionarioFocusLost
        
        if (!(jtfCodigoFuncionario.getText().trim().equals(""))) {
        
            jtfNomeFuncionario.setText(NomeFuncionario(Integer.parseInt(jtfCodigoFuncionario.getText())));
            
            jtfTituloProblema.requestFocus();
        
        }
        
    }//GEN-LAST:event_jtfCodigoFuncionarioFocusLost

    private void jtfCodigoChaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoChaveFocusLost
        
        if (!(jtfCodigoChave.getText().trim().equals(""))) {
        
            jtfDescricaoChave.setText(NomeChave(Integer.parseInt(jtfCodigoChave.getText())));
            
            jtaDescricaoProblema.requestFocus();
        
        }
        
    }//GEN-LAST:event_jtfCodigoChaveFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoChamadoAbertura().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    private void Limpar () {
        
        jdcData.setDate(new java.util.Date());
        jtfCodigoFuncionario.setText("");
        jtfNomeFuncionario.setText("");
        jtfDepartamento.setText("");
        jtfTituloProblema.setText("");
        jtfCodigoChave.setText("");
        jtfDescricaoChave.setText("");
        jtaDescricaoProblema.setText("");
        
    }
    
    public String NomeFuncionario (int CodigoFuncionario){
        
        String Funcionario = null;
        
        Fun = new Funcoes();
        Funcionario = Fun.NomePessoa(CodigoFuncionario);
        
        return Funcionario;
        
    }
    
    public void NomeFuncionarioViaF12 (int CodigoFuncionario){
        
        jtfCodigoFuncionario.setText(String.valueOf(CodigoFuncionario));
        jtfNomeFuncionario.setText(NomeFuncionario(CodigoFuncionario));
        
    }
    
    public String NomeChave (int CodigoChave){
        
        String Chave = null;
        
        Fun = new Funcoes();
        Chave = Fun.PalavreChave(CodigoChave);
        
        return Chave;
        
    }
    
    
    public void PalavraChaveViaF12 (int CodigoChave){
        
        jtfCodigoChave.setText(String.valueOf(CodigoChave));
        jtfDescricaoChave.setText(NomeChave(CodigoChave));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel jlbChaveProblema;
    private javax.swing.JLabel jlbDataChamado;
    private javax.swing.JLabel jlbDescricaoProblema;
    private javax.swing.JLabel jlbFuncionario;
    private javax.swing.JLabel jlbTituloProblema;
    private javax.swing.JTextArea jtaDescricaoProblema;
    private javax.swing.JFormattedTextField jtfCodigoChave;
    private javax.swing.JFormattedTextField jtfCodigoFuncionario;
    private javax.swing.JFormattedTextField jtfDepartamento;
    private javax.swing.JFormattedTextField jtfDescricaoChave;
    private javax.swing.JFormattedTextField jtfNomeFuncionario;
    private javax.swing.JFormattedTextField jtfTituloProblema;
    // End of variables declaration//GEN-END:variables
}
