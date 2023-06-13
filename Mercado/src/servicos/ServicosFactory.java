/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

public class ServicosFactory {
    private static ProdutoServicos produtoServicos = new ProdutoServicos();
    
    public static ProdutoServicos getProdutoServicos(){
        return produtoServicos;
    }
    
    private static FuncionarioServicos funcionarioServicos = new FuncionarioServicos();
    
     public static FuncionarioServicos getFuncionarioServicos(){
          return funcionarioServicos;
      }
}
