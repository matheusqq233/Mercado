/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FuncionarioVO;
import modelo.ProdutoVO;
import servicos.FuncionarioServicos;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

public class GUIManuFuncionario extends javax.swing.JInternalFrame {


    public GUIManuFuncionario() {
        initComponents();
        preencherTabela();
    }
    
    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Data Nasc.", "CPF", "Cidade", "Estado", "Função", "Salário"}
    );
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFuncionario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisaFunc = new javax.swing.JTextField();
        jcbPesquisaFunc = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnPreencher = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfDtNasc = new javax.swing.JTextField();
        jtfCpf = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfSalario = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jrbGerente = new javax.swing.JRadioButton();
        jrbCaixa = new javax.swing.JRadioButton();
        jrbEmpacotador = new javax.swing.JRadioButton();
        jrbAcougueiro = new javax.swing.JRadioButton();
        jrbSeguranca = new javax.swing.JRadioButton();
        jrbRepositor = new javax.swing.JRadioButton();
        jrbEntregador = new javax.swing.JRadioButton();
        jrbPadeiro = new javax.swing.JRadioButton();
        jbtnConfirmarAlteracao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção Funcionário");

        jtFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nasc.", "CPF", "Cidade", "Estado", "Função", "Salário"
            }
        ));
        jScrollPane1.setViewportView(jtFuncionario);

        jLabel1.setText("Pesquisa: ");

        jtfPesquisaFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaFuncKeyReleased(evt);
            }
        });

        jcbPesquisaFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "CPF", "Data Nasc.", "Cidade", "Estado", "Função", "Salário" }));

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPesquisaFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbPesquisaFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbtnPreencher.setText("Preencher");
        jbtnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jbtnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarKeyPressed(evt);
            }
        });

        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código: ");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Data Nasc:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Cidade: ");

        jLabel7.setText("Salário: ");

        jtfCodigo.setEditable(false);

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

        jLabel8.setText("Função: ");

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

        jbtnConfirmarAlteracao.setText("Confirmar Alteração");
        jbtnConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jbtnConfirmarAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnConfirmarAlteracaoKeyPressed(evt);
            }
        });

        jLayeredPane2.setLayer(jbtnPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfDtNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbGerente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbEmpacotador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbAcougueiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbSeguranca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbRepositor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbEntregador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbPadeiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnPreencher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDeletar)
                        .addGap(186, 186, 186))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCodigo))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCidade))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCpf))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDtNasc))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbGerente)
                                            .addComponent(jrbCaixa))
                                        .addGap(2, 2, 2)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbAcougueiro)
                                            .addComponent(jrbEmpacotador))
                                        .addGap(0, 3, Short.MAX_VALUE))
                                    .addComponent(jtfSalario))))
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jrbRepositor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbPadeiro))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jrbSeguranca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbEntregador))))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jbtnConfirmarAlteracao)))
                        .addGap(236, 236, 236))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencher)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnConfirmarAlteracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jrbGerente)
                    .addComponent(jrbEmpacotador)
                    .addComponent(jrbSeguranca)
                    .addComponent(jrbEntregador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCaixa)
                    .addComponent(jrbAcougueiro)
                    .addComponent(jrbRepositor)
                    .addComponent(jrbPadeiro))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2)
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
    private void preencherTabela(){
        try{
            FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
            
            ArrayList<FuncionarioVO> func= new ArrayList<>();
            
            func = fs.buscarFuncionario();
            for( int i=0; i<func.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(func.get(i).getIdfuncionario()),
                    String.valueOf(func.get(i).getNomefunc()),
                    String.valueOf(func.get(i).getDatanasc()),
                    String.valueOf(func.get(i).getCpffunc()),
                    func.get(i).getCidade(),
                    func.get(i).getEstado(),
                    func.get(i).getFuncao(),
                    func.get(i).getSalario()
                });
            }//fecha o laço for

            //Adicionando o modelo de tabela com os dados na tabela produto
            jtFuncionario.setModel(dtm);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha o catch
    //fecha o método preencherTabela
    }
     
     
     private void limparTabela() {
        
        /*  Para limpar a tabela temos que setar o número de
            linhas para zero no default table model        
        */
        dtm.setNumRows(0);
    }//fecha o métod
     
     private void deletarFuncionario(){
        try{
            int linha = jtFuncionario.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha!");
            }else{
               int result = JOptionPane.showConfirmDialog(this, 
                        "Tem certeza que deseja deletar o cliente?" + JOptionPane.YES_NO_OPTION);
          
                if(result==JOptionPane.YES_OPTION){
                FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
                String codFuncionario = (String) jtFuncionario.getValueAt(linha, 0 );
                fs.deletarFuncionario(Integer.parseInt(codFuncionario));
                
                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this, 
                        "funcionário excluído com sucesso!");
                limparTabela();
                preencherTabela();
                
                }else if(result==JOptionPane.NO_OPTION){
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, 
                    "Erro ao deletar Funcionário! " + e.getMessage());
        }
        
      }
     
    
     private void filtrarFuncionario(){
        try{
            if(jtfPesquisaFunc.getText().isEmpty()){
                preencherTabela();
            }else{
                FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
                String pesquisa = (String) jcbPesquisaFunc.getSelectedItem();
                String query = null;
                if(pesquisa.equals("Código") ) {
                    query = "where idfuncionario = " + jtfPesquisaFunc.getText();
                }else if(!pesquisa.equals("Nome") ) if(pesquisa.equals("Data Nasc.") ) {
                    query = "where datanasc like '%" + jtfPesquisaFunc.getText() + "%' ";
                }else if(!pesquisa.equals("CPF") ){
                    if(!pesquisa.equals("Cidade") ) if(pesquisa.equals("Estado") ){
                        query = "where estado like '%" + jtfPesquisaFunc.getText() + "%' ";
                    if(pesquisa.equals("Função")){
                        query = "where funcao like '&" + jtfPesquisaFunc.getText() +"&' ";
                    }
                    }else if(pesquisa.equals("Salário") ){
                        query = "where salario like '%" + jtfPesquisaFunc.getText() + "%' ";
                    }else if(pesquisa.equals("Cidade")){
                        query = "where cidade like '%" + jtfPesquisaFunc.getText() + "%' ";
                    }
                }else {
                    query = "where cpffunc like '%" + jtfPesquisaFunc.getText() + "%' ";
                }else {
                    query = "where nomefunc like '%" + jtfPesquisaFunc.getText() + "%' ";
                }
                
                ArrayList<FuncionarioVO> func = new ArrayList();
                func = fs.filtrarFuncionario(query);
                
                for(int i=0; i < func.size(); i++ ){
                    dtm.addRow(new String[] {
                    String.valueOf(func.get(i).getIdfuncionario()),
                    String.valueOf(func.get(i).getNomefunc()),
                    String.valueOf(func.get(i).getDatanasc()),
                    String.valueOf(func.get(i).getCpffunc()),
                    func.get(i).getCidade(),
                    func.get(i).getEstado(),
                    func.get(i).getFuncao(),
                    String.valueOf(func.get(i).getSalario())
                });
                }
                jtFuncionario.setModel(dtm);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao filtrar funcionário! " + e.getMessage() );
        }      
    }
     
    
     private void alterarFuncionario(){
      try{  
        int linha = jtFuncionario.getSelectedRow();
        
        jbtnDeletar.setEnabled(false);
        
        if(linha != -1){
            jtfCodigo.setText ( (String) jtFuncionario.getValueAt(linha, 0) );
            jtfNome.setText ( (String) jtFuncionario.getValueAt(linha, 1) );
            jtfDtNasc.setText ( (String) jtFuncionario.getValueAt(linha, 2) );
            jtfCpf.setText((String) jtFuncionario.getValueAt(linha, 3) );
            jtfCidade.setText((String) jtFuncionario.getValueAt(linha, 4));
            jcbEstado.setSelectedItem((String) jtFuncionario.getValueAt(linha, 5));
            if(jrbGerente.isSelected()){
                jrbGerente.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }if(jrbCaixa.isSelected()){
                jrbCaixa.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbEmpacotador.isSelected()){
                jrbEmpacotador.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbAcougueiro.isSelected()){
                jrbAcougueiro.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbSeguranca.isSelected()){
                jrbSeguranca.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbRepositor.isSelected()){
                jrbRepositor.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbEntregador.isSelected()){
                jrbEntregador.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }else if(jrbPadeiro.isSelected()){
                jrbPadeiro.setToolTipText((String) jtFuncionario.getValueAt(linha, 6));
            }
            jtfSalario.setText((String) jtFuncionario.getValueAt(linha, 7));
           
           
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Você não selecionou nenhuma linha!");            
        }
      }catch(Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao selecionar uma linha! " + e.getMessage());
        } 
        
    } 
      
      private void confirmarAlteracao(){
        try{
            FuncionarioVO  fVO = new FuncionarioVO();
            if( jtfNome.getText().isEmpty() || jtfDtNasc.getText().isEmpty()|| jtfCpf.getText().isEmpty() || jtfCidade.getText().isEmpty() || jcbEstado.getToolTipText().isEmpty() || jrbGerente.getToolTipText().isEmpty()||jrbCaixa.getToolTipText().isEmpty()||jrbEmpacotador.getToolTipText().isEmpty()||jrbAcougueiro.getToolTipText().isEmpty()
                    || jrbSeguranca.getToolTipText().isEmpty()||jrbRepositor.getToolTipText().isEmpty()||jrbPadeiro.getToolTipText().isEmpty()||jrbEntregador.getToolTipText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro! Pro favor insira as informações corretamente!", 
                        "Erro!" , 
                        JOptionPane.ERROR_MESSAGE);
            }else{
                fVO.setIdfuncionario(Integer.parseInt(jtfCodigo.getText()));
                fVO.setNomefunc(jtfNome.getText());
                fVO.setDatanasc(jtfDtNasc.getText());
                fVO.setCpffunc(jtfCpf.getText());
                fVO.setCidade(jtfCidade.getText());
                fVO.setEstado((String) jcbEstado.getSelectedItem());
                
                 if(jrbGerente.isSelected()){
                        fVO.setFuncao(jrbGerente.getToolTipText());
                         }if(jrbCaixa.isSelected()){
                        fVO.setFuncao(jrbCaixa.getToolTipText());
                         }else if(jrbAcougueiro.isSelected()){
                          fVO.setFuncao(jrbAcougueiro.getToolTipText());
                         }else if(jrbEmpacotador.isSelected()){
                          fVO.setFuncao(jrbEmpacotador.getToolTipText());
                        }else if(jrbSeguranca.isSelected()){
                          fVO.setFuncao(jrbSeguranca.getToolTipText());
                        }else if(jrbRepositor.isSelected()){
                          fVO.setFuncao(jrbRepositor.getToolTipText());
                        }else if(jrbPadeiro.isSelected()){
                          fVO.setFuncao(jrbPadeiro.getToolTipText());
                        }else if(jrbEntregador.isSelected()){
                          fVO.setFuncao(jrbEntregador.getToolTipText());
                        }
                 fVO.setSalario(jtfSalario.getText());




                
                
                
                FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
                fs.alterarFuncionario(fVO);
                
                JOptionPane.showMessageDialog(this, "Funcionario alterado com sucesso!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro! " + e.getMessage());
        }
        
        jbtnDeletar.setEnabled(true);
        limparTabela();
        preencherTabela();
    }
      
      
     private void limparAlteracao(){
        jtfCodigo.setText(null);
        jtfNome.setText(null);
        jtfDtNasc.setText(null);
        jtfCpf.setText(null);
        jtfCidade.setText(null);
        jtfSalario.setText(null);
      
    }
      
    private void jtfPesquisaFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaFuncKeyReleased
        limparTabela();
        filtrarFuncionario();
    }//GEN-LAST:event_jtfPesquisaFuncKeyReleased

    private void jbtnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherActionPerformed
        // TODO add your handling code here:
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbtnPreencherActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        // TODO add your handling code here:
        alterarFuncionario();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarFuncionario();
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        // TODO add your handling code here:
        deletarFuncionario();
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
        limparAlteracao();
    }//GEN-LAST:event_jbtnConfirmarAlteracaoActionPerformed

    private void jbtnConfirmarAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            confirmarAlteracao();
        }
    }//GEN-LAST:event_jbtnConfirmarAlteracaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnConfirmarAlteracao;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnPreencher;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbPesquisaFunc;
    private javax.swing.JRadioButton jrbAcougueiro;
    private javax.swing.JRadioButton jrbCaixa;
    private javax.swing.JRadioButton jrbEmpacotador;
    private javax.swing.JRadioButton jrbEntregador;
    private javax.swing.JRadioButton jrbGerente;
    private javax.swing.JRadioButton jrbPadeiro;
    private javax.swing.JRadioButton jrbRepositor;
    private javax.swing.JRadioButton jrbSeguranca;
    private javax.swing.JTable jtFuncionario;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfDtNasc;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisaFunc;
    private javax.swing.JTextField jtfSalario;
    // End of variables declaration//GEN-END:variables
}
