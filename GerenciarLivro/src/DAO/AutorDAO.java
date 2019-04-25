/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class AutorDAO {
    
    Autor autor = new Autor();
    private Connection conexao;
    
    public AutorDAO() {
        //this.conexao = new Conexao().getConnection();

    }
    
    public void CadastrarAutor(Autor autor){
        
         String sql = "insert into autor(NomeAutor,Dt_Nasc) values (?,?)";
        
        try {
            PreparedStatement insere = this.conexao.prepareStatement(sql);
            insere.setString(1,null);
            insere.setString(2,null);
            insere.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:Impossivel Inserir informações do Autor no banco de dados!\n" + ex);
        }
        
    }
    public void DeletarAutor(Autor autor){
        
    }
    public void SelecionarAutor(Autor autor){
        
    }
    public void AlterarAutor(Autor autor, Autor newAutor){
        
    }
    
}
