/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Editora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SOSTECH
 */
public class EditoraDAO {
    
    Editora editora = new Editora();
    private Connection conexao;
    
    public void CadastrarEditora(Editora editora){
        
        String sql = "insert into editora(NomeEditora,Telefone,Endereco,Email) values (?,?,?,?)";
        
        try {
            PreparedStatement insere = this.conexao.prepareStatement(sql);
            insere.setString(1,null);
            insere.setString(2,null);
            insere.setString(3,null);
            insere.setString(4,null);
            insere.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:Impossivel Inserir informações da Editora no banco de dados!\n" + ex);
        }
        
    }
    public void DeletarEditora(Editora editora){
        
    }
    public void SelecionarEditora(Editora editora){
        
    }
    public void AlterarEditora(Editora editora, Editora newEditora){
        
    }
    
}
