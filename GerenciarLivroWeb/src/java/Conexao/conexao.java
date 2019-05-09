/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class conexao {
    public Connection getConnection(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/desenvolagil","root","admin");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: Impossivel Conectar ao Banco de Dados ");
            System.out.println(ex);
            return null;
        }
    }  
    
    
}
