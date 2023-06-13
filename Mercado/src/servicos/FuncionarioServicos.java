/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;


import DAO.DAOFactory;
import DAO.FuncionarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FuncionarioVO;


public class FuncionarioServicos {
    
       public void cadastrarFuncionario(FuncionarioVO fVO) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.cadastrarFuncionario(fVO);        
    }
    
        public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        
        return fDAO.buscarFuncionario();
    }//fecha o método buscarProduto
        
        public void deletarFuncionario(int idfuncionario) throws SQLException{
        FuncionarioDAO  fDAO= DAOFactory.getFuncionarioDAO();
        fDAO.deletarFuncionario(idfuncionario);
    }//fecha o método deletarProduto
        
        public ArrayList<FuncionarioVO> filtrarFuncionario(String query) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.filtrarFuncionario(query);
    }//fecha o método
        
        public void alterarFuncionario(FuncionarioVO fVO) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.alterarFuncionario(fVO);
    }//fecha o método alterarProduto
}
