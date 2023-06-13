package DAO;

public class DAOFactory {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static ProdutoDAO getProdutoDAO(){
        return produtoDAO;
    }
 
    private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO(); 
    
     public static FuncionarioDAO getFuncionarioDAO(){
        return funcionarioDAO;
     }
    
}
