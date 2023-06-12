/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import javax.swing.JOptionPane;

public class GUICadProduto extends javax.swing.JInternalFrame {

    public GUICadProduto() {
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
        jtfNomePro = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jtfValorCusto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDataValidade = new javax.swing.JTextField();
        jcbAlimento = new javax.swing.JRadioButton();
        jcbLimpeza = new javax.swing.JRadioButton();
        jrbHigiene = new javax.swing.JRadioButton();
        jrbEletrodomestico = new javax.swing.JRadioButton();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jbtnCadastrar6 = new javax.swing.JButton();
        jbtnLimpar6 = new javax.swing.JButton();
        jbtnSair6 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro produtos");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Quantidade: ");

        jLabel3.setText("Valor Custo: ");

        jLabel4.setText("Tipo Produto:");

        jLabel5.setText("Data Validade: ");

        jcbAlimento.setSelected(true);
        jcbAlimento.setText("Alimento");
        jcbAlimento.setToolTipText("Alimento");

        jcbLimpeza.setText("Limpeza");
        jcbLimpeza.setToolTipText("Limpeza");

        jrbHigiene.setText("Higiene Pessoal");
        jrbHigiene.setToolTipText("Higiene");

        jrbEletrodomestico.setText("Eletrodoméstico");
        jrbEletrodomestico.setToolTipText("Eletrodoméstico");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNomePro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfValorCusto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfDataValidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbAlimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbLimpeza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbHigiene, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbEletrodomestico, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValorCusto))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfQuantidade))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jrbHigiene)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbEletrodomestico))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jcbAlimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbLimpeza)))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbAlimento)
                    .addComponent(jcbLimpeza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHigiene)
                    .addComponent(jrbEletrodomestico))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jbtnCadastrar6.setText("Cadastrar");
        jbtnCadastrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrar6ActionPerformed(evt);
            }
        });
        jbtnCadastrar6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnCadastrar6KeyPressed(evt);
            }
        });

        jbtnLimpar6.setText("Limpar");
        jbtnLimpar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpar6ActionPerformed(evt);
            }
        });

        jbtnSair6.setText("Sair");
        jbtnSair6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSair6ActionPerformed(evt);
            }
        });

        jLayeredPane8.setLayer(jbtnCadastrar6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jbtnLimpar6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(jbtnSair6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jbtnCadastrar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLimpar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSair6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCadastrar6)
                    .addComponent(jbtnLimpar6)
                    .addComponent(jbtnSair6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane8)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(){
         try{      
        ProdutoVO pVO = new ProdutoVO();
        ArrayList tipo = new ArrayList();
        
        
        pVO.setNomepro(jtfNomePro.getText());
        pVO.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
        pVO.setValorcusto(Double.parseDouble(jtfValorCusto.getText()));
        pVO.setDatavalidade(jtfDataValidade.getText());
        if(jcbAlimento.isSelected()){
            pVO.setTipoproduto(jcbAlimento.getToolTipText());
        }else if(jcbLimpeza.isSelected()){
              pVO.setTipoproduto(jcbLimpeza.getToolTipText());
        }else if(jrbHigiene.isSelected()){
            pVO.setTipoproduto(jrbHigiene.getToolTipText());
        }else{
            pVO.setTipoproduto(jrbEletrodomestico.getToolTipText());
        }
        
        ProdutoServicos ps = servicos.ServicosFactory.getProdutoServicos();
        
        ps.cadastrarProduto(pVO);
        
        JOptionPane.showMessageDialog(
        rootPane,
                "CADASTRO REALIZADO COM SUCESSO" 
                 );
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
       }
       
    }
    
    private void limpar(){
        jtfNomePro.setText(null);
        jtfQuantidade.setText(null);
        jtfValorCusto.setText(null);
        jtfDataValidade.setText(null);
        
        
    }
    
    private void jbtnCadastrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrar6ActionPerformed
        // TODO add your handling code here:
        cadastrar();
        limpar();

    }//GEN-LAST:event_jbtnCadastrar6ActionPerformed

    private void jbtnCadastrar6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrar6KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
        }
    }//GEN-LAST:event_jbtnCadastrar6KeyPressed

    private void jbtnLimpar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpar6ActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbtnLimpar6ActionPerformed

    private void jbtnSair6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSair6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnSair6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnCadastrar1;
    private javax.swing.JButton jbtnCadastrar2;
    private javax.swing.JButton jbtnCadastrar3;
    private javax.swing.JButton jbtnCadastrar4;
    private javax.swing.JButton jbtnCadastrar5;
    private javax.swing.JButton jbtnCadastrar6;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnLimpar1;
    private javax.swing.JButton jbtnLimpar2;
    private javax.swing.JButton jbtnLimpar3;
    private javax.swing.JButton jbtnLimpar4;
    private javax.swing.JButton jbtnLimpar5;
    private javax.swing.JButton jbtnLimpar6;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JButton jbtnSair1;
    private javax.swing.JButton jbtnSair2;
    private javax.swing.JButton jbtnSair3;
    private javax.swing.JButton jbtnSair4;
    private javax.swing.JButton jbtnSair5;
    private javax.swing.JButton jbtnSair6;
    private javax.swing.JRadioButton jcbAlimento;
    private javax.swing.JRadioButton jcbLimpeza;
    private javax.swing.JRadioButton jrbEletrodomestico;
    private javax.swing.JRadioButton jrbHigiene;
    private javax.swing.JTextField jtfDataValidade;
    private javax.swing.JTextField jtfNomePro;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorCusto;
    // End of variables declaration//GEN-END:variables
}
