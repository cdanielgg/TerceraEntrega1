package com.example.carlos.secondapp.pojos;

import com.example.carlos.secondapp.constantes.G;

public class Libro {
    private int ID;
   private String titulo;
   private String editorial;
   private String paginas;

    public Libro() {
        this.ID = G.SIN_VALOR_INT;
        this.titulo = G.SIN_VALOR_STRING;
        this.editorial= G.SIN_VALOR_STRING;
        this.setPaginas(G.SIN_VALOR_STRING);
    }

    public Libro (int ID, String titulo, String editorial, String paginas){

        this.ID = ID;
        this.titulo= titulo;
        this.editorial=editorial;
        this.setPaginas(paginas);
    }
    public  int getID(){return ID; }

    public void setID (int ID){this.ID = ID;}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {return editorial;}

    public void setEditorial(String editorial) {this.editorial = editorial;}

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
}
