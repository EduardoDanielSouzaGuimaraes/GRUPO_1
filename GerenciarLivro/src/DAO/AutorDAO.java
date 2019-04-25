/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class AutorDAO {
    
    
    private Connection conexao;
    
    public AutorDAO() {
        //this.conexao = new Conexao().getConnection();

    }
    
    public void CadastrarAutor(Autor autor){
        
         String sql = "insert into autor(NomeAutor,Dt_Nasc) values (?,?)";
        
        try {
            PreparedStatement insere = this.conexao.prepareStatement(sql);
            insere.setString(1,autor.getNome());
            insere.setString(2,autor.getDatanasc());
            insere.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:Impossivel Inserir informações do Autor no banco de dados!\n" + ex);
        }
        
    }
    public void DeletarAutor(Autor autor){
        
    }
    public Autor SelecionarAutor(int idAutor){
        
        String sql = "select * from autor where Cod_Autor = ?";
        Autor autor = new Autor();
        try {
            PreparedStatement seleciona = this.conexao.prepareStatement(sql);
            seleciona.setInt(1, idAutor);
            ResultSet dados = seleciona.executeQuery();
            dados.next();
            autor.setNome(dados.getString("nomeAutor"));
            autor.setDatanasc(dados.getString("Dt_Nasc"));
            autor.setId(dados.getInt("Cod_Autor"));
            
            return autor;
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Impossivel Selecionar Autor.");
            return null;
        }
        
    }
    public void AlterarAutor(Autor autor, Autor newAutor){
        
    }
    
}
