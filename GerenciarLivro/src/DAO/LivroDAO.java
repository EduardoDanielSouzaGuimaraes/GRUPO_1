/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class LivroDAO {
    
    Livro livro = new Livro();
    private Connection conexao;
    
    public void CadastrarLivro(Livro livro){
        
    String sql = "insert into livro(titulo, dt_publicacao,genero,nomeOriginal,numeroExemplar,Idioma,autor_COD_autor,editora_COD_Editora) values (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement insere = this.conexao.prepareStatement(sql);
            insere.setString(1,null);
            insere.setString(2,null);
            insere.setString(3,null);
            insere.setString(4,null);
            insere.setInt(5,0);
            insere.setString(6,null);
            insere.setInt(7,0);
            insere.setInt(8,0);
            insere.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:Impossivel Inserir informações da Editora no banco de dados!\n" + ex);
        }    
        
    }
    public void DeletarLivro(Livro livro){
        
    }
    public void SelecionarLivro(Livro livro){
        
        String sql = "select * from livro where Cod_Livro = ?";

        try {
            PreparedStatement seleciona = this.conexao.prepareStatement(sql);
            seleciona.setInt(1, 0);
            ResultSet dados = seleciona.executeQuery();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Impossivel Selecionar.");
        }
        
    }
    public void AlterarLivro(Livro livro, Livro newLivro){
        
    }
}
