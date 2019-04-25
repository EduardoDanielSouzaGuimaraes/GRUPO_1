
import DAO.AutorDAO;
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
public class testeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        AutorDAO dao = new AutorDAO();
        Autor autor = new Autor();
        autor.setDatanasc("12/06/1999");
        autor.setNome("Marcos");
        dao.CadastrarAutor(autor);
    
    }
    
}
