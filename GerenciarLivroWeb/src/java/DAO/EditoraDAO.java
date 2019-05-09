/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Editora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class EditoraDAO {
    
    
    private Connection conexao;
    
    public void CadastrarEditora(Editora editora){
        
        String sql = "insert into editora(NomeEditora,Telefone,Endereco,Email) values (?,?,?,?)";
        
        try {
            PreparedStatement insere = this.conexao.prepareStatement(sql);
            insere.setString(1,editora.getNome());
            insere.setString(2,editora.getTelefone());
            insere.setString(3,editora.getEndereco());
            insere.setString(4,editora.getEmail());
            insere.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:Impossivel Inserir informações da Editora no banco de dados!\n" + ex);
        }
        
    }
    public void DeletarEditora(Editora editora){
        
    }
    public Editora SelecionarEditora(int idEditora){
        String sql = "select * from editora where Cod_Editora = ?";
        Editora editora = new Editora();
        try {
            PreparedStatement seleciona = this.conexao.prepareStatement(sql);
            seleciona.setInt(1, idEditora);
            ResultSet dados = seleciona.executeQuery();
            dados.next();
            editora.setNome(dados.getString("NomeEditora"));
            editora.setEmail(dados.getString("Email"));
            editora.setId(dados.getInt("Cod_Editora"));
            editora.setTelefone(dados.getString("Telefone"));
            editora.setEndereco(dados.getString("Endereco"));
            
            return editora;
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Impossivel Selecionar Editora.");
            return null;
        }
    }
    public void AlterarEditora(Editora editora, Editora newEditora){
        
    }
    
}
