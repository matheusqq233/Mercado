package view;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class MenuPrincipal extends javax.swing.JFrame implements InternalFrameListener{
    
    private boolean flagGuiCadProduto = false;
    private boolean flagGuiCadFuncionario = false;
    private boolean flagGuiManuProduto = false;
    private boolean flagGuiManuFuncionario = false;
    
    
    public MenuPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCadFuncionario = new javax.swing.JMenuItem();
        jmiCadProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiManuFuncionario = new javax.swing.JMenuItem();
        jmiManuProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/java.png"))); // NOI18N

        jdpAreaDeTrabalho.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jMenu1.setText("Cadastro");

        jmiCadFuncionario.setText("CadFuncionário");
        jmiCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadFuncionarioActionPerformed(evt);
            }
        });
        jmiCadFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiCadFuncionarioKeyPressed(evt);
            }
        });
        jMenu1.add(jmiCadFuncionario);

        jmiCadProduto.setText("CadProduto");
        jmiCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProdutoActionPerformed(evt);
            }
        });
        jmiCadProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiCadProdutoKeyPressed(evt);
            }
        });
        jMenu1.add(jmiCadProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manutenção");

        jmiManuFuncionario.setText("ManuFuncionário");
        jmiManuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuFuncionarioActionPerformed(evt);
            }
        });
        jmiManuFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuFuncionarioKeyPressed(evt);
            }
        });
        jMenu2.add(jmiManuFuncionario);

        jmiManuProduto.setText("ManuProduto");
        jmiManuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuProdutoActionPerformed(evt);
            }
        });
        jmiManuProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuProdutoKeyPressed(evt);
            }
        });
        jMenu2.add(jmiManuProduto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadProduto(){
        
        if(!flagGuiCadProduto){
            GUICadProduto gcp = new GUICadProduto();
            jdpAreaDeTrabalho.add(gcp);
            gcp.setVisible(true);
            
            flagGuiCadProduto = true;
            gcp.addInternalFrameListener(this);
        }
    } 
    
   private void abrirManuProduto(){
        if(!flagGuiManuProduto){
            GUIManuProduto gmp = new GUIManuProduto();
            jdpAreaDeTrabalho.add(gmp);
            gmp.setVisible(true);
            
            flagGuiManuProduto = true;
            gmp.addInternalFrameListener(this);
        }
    }
   
   
   private void abrirCadFuncionario(){
        
        if (!flagGuiCadFuncionario){
            GUICadFuncionario gcf = new GUICadFuncionario();
            jdpAreaDeTrabalho.add(gcf);
            gcf.setVisible(true);
            
            flagGuiCadFuncionario = true;
            gcf.addInternalFrameListener(this);
        }
    }
    
    private void abrirManuFuncionario(){
        if(!flagGuiManuFuncionario){
            GUIManuFuncionario gmf = new GUIManuFuncionario();
            jdpAreaDeTrabalho.add(gmf);
            gmf.setVisible(true);
            
            flagGuiManuFuncionario = true;
            gmf.addInternalFrameListener(this);
        }
    }
    
     
   
    private void jmiCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProdutoActionPerformed
        // TODO add your handling code here:
        abrirCadProduto();
    }//GEN-LAST:event_jmiCadProdutoActionPerformed

    private void jmiCadProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiCadProdutoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadProduto();
        }
    }//GEN-LAST:event_jmiCadProdutoKeyPressed

    private void jmiCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadFuncionarioActionPerformed
      
        abrirCadFuncionario();
    }//GEN-LAST:event_jmiCadFuncionarioActionPerformed

    private void jmiCadFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiCadFuncionarioKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadFuncionario();
       }
        
    }//GEN-LAST:event_jmiCadFuncionarioKeyPressed

    private void jmiManuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuFuncionarioActionPerformed
        // TODO add your handling code here:
          abrirManuFuncionario();
    }//GEN-LAST:event_jmiManuFuncionarioActionPerformed

    private void jmiManuFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuFuncionarioKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManuFuncionario();
        }
    }//GEN-LAST:event_jmiManuFuncionarioKeyPressed

    private void jmiManuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuProdutoActionPerformed
       abrirManuProduto();
    }//GEN-LAST:event_jmiManuProdutoActionPerformed

    private void jmiManuProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuProdutoKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManuProduto();
        }
    }//GEN-LAST:event_jmiManuProdutoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    private javax.swing.JMenuItem jmiCadFuncionario;
    private javax.swing.JMenuItem jmiCadProduto;
    private javax.swing.JMenuItem jmiManuFuncionario;
    private javax.swing.JMenuItem jmiManuProduto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent ife) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent ife) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent ife) {
         if(ife.getInternalFrame() instanceof GUICadProduto){
            flagGuiCadProduto = false;
         }else if (ife.getInternalFrame() instanceof GUIManuProduto){
            flagGuiManuProduto = false;
         }else if(ife.getInternalFrame() instanceof GUICadFuncionario){
            flagGuiCadFuncionario = false;
         }else if(ife.getInternalFrame() instanceof GUIManuFuncionario){
             flagGuiManuFuncionario = false;
         }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent ife) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent ife) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent ife) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent ife) {
        //To change body of generated methods, choose Tools | Templates.
    }
}
