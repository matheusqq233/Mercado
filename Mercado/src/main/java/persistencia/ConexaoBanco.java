/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
      private static String URL = "jdbc:mysql://localhost:3306/mercado";
    private static String USUARIO = "root";
    private static String SENHA = "";
    
    //Método que efetua a conexão com o MySQL
    public static Connection getConexao() throws SQLException{
        Connection c = null;
        try{
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(SQLException se){
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha o catch
        return c;
    }//fim do método
    
}