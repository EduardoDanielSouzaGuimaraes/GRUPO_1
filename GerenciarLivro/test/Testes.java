
import DAO.AutorDAO;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import Entidades.Autor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_01_PC_06
 */
public class Testes {
    
    public void cadastrarautor(){
        AutorDAO dao = new AutorDAO();
        Autor autor = new Autor();
        autor.setDatanasc("12/06/1999");
        autor.setNome("Marcos");
        dao.CadastrarAutor(autor);
    }
}

