/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SOSTECH
 */
public class Livro {
    private Autor autor;
    private Editora editora;
    private String titulo;
    private int id;
    private String publicacao;
    private String genero;
    private String nomeoriginal;
    private int numeroexemplar;
    private String idioma;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeoriginal() {
        return nomeoriginal;
    }

    public void setNomeoriginal(String nomeoriginal) {
        this.nomeoriginal = nomeoriginal;
    }

    public int getNumeroexemplar() {
        return numeroexemplar;
    }

    public void setNumeroexemplar(int numeroexemplar) {
        this.numeroexemplar = numeroexemplar;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
