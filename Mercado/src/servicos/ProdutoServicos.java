/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import DAO.DAOFactory;
import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProdutoVO;

public class ProdutoServicos {
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);        
    }
    
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        
        return pDAO.buscarProduto();
    }//fecha o método buscarProduto
    
    public void deletarProduto(int idproduto) throws SQLException{
        ProdutoDAO  pDAO= DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(idproduto);
    }//fecha o método deletarProduto
    
    public ArrayList<ProdutoVO> filtrarProduto(String query) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrarProduto(query);
    }//fecha o método
    
    public void alterarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }//fecha o método alterarProduto
    
}
