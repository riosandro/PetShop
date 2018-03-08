package com.riosgame.petshop;

/**
 * Created by Jose on 3/6/2018.
 */

public class Animales {

    private String nombre;
    private String cantidad;
    private int foto;

  //  public Animales(String nombre, String cantidad,int foto) {
   //     this.nombre = nombre;
   //     this.cantidad = cantidad;
   //     this.foto = foto;
   // }

    public Animales(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }




}
