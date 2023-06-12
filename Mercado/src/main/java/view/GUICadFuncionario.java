/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import modelo.FuncionarioVO;
import servicos.FuncionarioServicos;
import javax.swing.JOptionPane;

public class GUICadFuncionario extends javax.swing.JInternalFrame {

    public GUICadFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfDtNasc = new javax.swing.JTextField();
        jtfCpf = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfSalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jrbGerente = new javax.swing.JRadioButton();
        jrbCaixa = new javax.swing.JRadioButton();
        jrbEmpacotador = new javax.swing.JRadioButton();
        jrbAcougueiro = new javax.swing.JRadioButton();
        jrbSeguranca = new javax.swing.JRadioButton();
        jrbRepositor = new javax.swing.JRadioButton();
        jrbEntregador = new javax.swing.JRadioButton();
        jrbPadeiro = new javax.swing.JRadioButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Funcionário");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Data Nasc.:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Salario: ");

        jLabel6.setText("Função: ");

        jLabel7.setText("Estado: ");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        jcbEstado.setToolTipText("AC"
            + "AL"
            + "AP"
            + "AM"
            + "BA"
            + "CE"
            + "ES"
            + "GO"
            + "MA"
            + "MT"
            + "MS"
            + "MG"
            + "PA"
            + "PB"
            + "PR"
            + "PE"
            + "PI"
            + "RJ"
            + "RN"
            + "RS"
            + "RO"
            + "RR"
            + "SC"
            + "SP"
            + "SE"
            + "TO"
            + "DF");

        jrbGerente.setText("Gerente");
        jrbGerente.setToolTipText("Gerente");

        jrbCaixa.setText("Caixa");
        jrbCaixa.setToolTipText("Caixa");

        jrbEmpacotador.setText("Empacotador");
        jrbEmpacotador.setToolTipText("Empacotador");

        jrbAcougueiro.setText("Açougueiro");
        jrbAcougueiro.setToolTipText("Açougueiro");

        jrbSeguranca.setText("Segurança");
        jrbSeguranca.setToolTipText("Segurança");

        jrbRepositor.setText("Repositor");
        jrbRepositor.setToolTipText("Repositor");

        jrbEntregador.setText("Entregador");
        jrbEntregador.setToolTipText("Entregador");

        jrbPadeiro.setText("Padeiro");
        jrbPadeiro.setToolTipText("Padeiro");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfDtNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbGerente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbEmpacotador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbAcougueiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbSeguranca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbRepositor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbEntregador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbPadeiro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDtNasc))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCpf))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSalario)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jrbCaixa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbAcougueiro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbRepositor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbPadeiro))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jrbGerente)
                                        .addGap(2, 2, 2)
                                        .addComponent(jrbEmpacotador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbSeguranca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbEntregador)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbGerente)
                        .addComponent(jrbEmpacotador)
                        .addComponent(jrbSeguranca)
                        .addComponent(jrbEntregador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCaixa)
                    .addComponent(jrbAcougueiro)
                    .addComponent(jrbRepositor)
                    .addComponent(jrbPadeiro))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbtnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jbtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCadastrar)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnSair))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(){
     try{
         FuncionarioVO fVO = new FuncionarioVO();
         ArrayList estado = new ArrayList();
             
             
    
            fVO.setNomefunc(jtfNome.getText());   
            fVO.setDatanasc(jtfDtNasc.getText());
            fVO.setCpffunc(jtfCpf.getText());  
            fVO.setCidade(jtfCidade.getText());
            fVO.setSalario(jtfSalario.getText());
            if(jrbGerente.isSelected()){
                fVO.setFuncao(jrbGerente.getToolTipText());
            }else if(jrbCaixa.isSelected()){
                fVO.setFuncao(jrbCaixa.getToolTipText());
            }else if(jrbEmpacotador.isSelected()){
                fVO.setFuncao(jrbEmpacotador.getToolTipText());
            }else if(jrbSeguranca.isSelected()){
                fVO.setFuncao(jrbSeguranca.getToolTipText());
            }else if(jrbPadeiro.isSelected()){
                fVO.setFuncao(jrbPadeiro.getToolTipText());
            }else if(jrbAcougueiro.isSelected()){
                fVO.setFuncao(jrbAcougueiro.getToolTipText());
            }else if(jrbEntregador.isSelected()){
                fVO.setFuncao(jrbEntregador.getToolTipText());
            }else{
                fVO.setFuncao(jrbRepositor.getToolTipText());
            }

             fVO.setEstado((String) jcbEstado.getSelectedItem());

           
        
       
        
        
         
          
            FuncionarioServicos fa = servicos.ServicosFactory.getFuncionarioServicos();
            
            
            fa.cadastrarFuncionario(fVO);
            
            
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Funcionario cadastrado com sucesso");
            
            
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        
     
        
    }
    
     private void cancelar(){
        jtfNome.setText("");
        jtfDtNasc.setText("");
        jtfCpf.setText("");
        jtfCidade.setText("");
        jtfSalario.setText("");
        jrbGerente.setSelected(false);
        jrbCaixa.setSelected(false);
        jrbEmpacotador.setSelected(false);
        jrbAcougueiro.setSelected(false);
        jrbSeguranca.setSelected(false);
        jrbRepositor.setSelected(false);
        jrbEntregador.setSelected(false);
        jrbPadeiro.setSelected(false);
      }
     
    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrar();
        cancelar();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jbtnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JRadioButton jrbAcougueiro;
    private javax.swing.JRadioButton jrbCaixa;
    private javax.swing.JRadioButton jrbEmpacotador;
    private javax.swing.JRadioButton jrbEntregador;
    private javax.swing.JRadioButton jrbGerente;
    private javax.swing.JRadioButton jrbPadeiro;
    private javax.swing.JRadioButton jrbRepositor;
    private javax.swing.JRadioButton jrbSeguranca;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfDtNasc;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSalario;
    // End of variables declaration//GEN-END:variables
}
