package com.example.myapplist;

public class Titular {


  private String nombre;
  private String telefono;
  private int imagen;



    public Titular(String nombre, String telefono, int imagen) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public String getSubtitulo() {
        return telefono;
    }

    public void setSubtitulo(String subtitulo) {
        this.telefono = subtitulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
