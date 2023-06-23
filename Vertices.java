/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author matia
 */
public class Vertices {
    String nombre;
    int numeroVertice;
         
    public Vertices(String nombre)
    {
        this.nombre = nombre;
        this.numeroVertice = -1;
    }
    
    public int numVert()
    {
        return numeroVertice;
    }
    
    public String nombreVertice(){
        return this.nombre;
    }
    
    public void asignVer(int n)
    {
        numeroVertice = n;
    }
    
    public boolean equals(Vertices n)
    {
      return nombre.equals(n.nombre);
    }
}
