/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author matia
 */
public class Main {

    public static void main(String[] args) {
        GrafoMatriz grafo =  new GrafoMatriz(4);
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre del vertice a!");
        String a = scan.nextLine();
        System.out.println("Ingrese nombre del vertice b!");
        String b = scan.nextLine();
        grafo.nuevoVertice(a);
        grafo.nuevoVertice(b);
        grafo.nuevoVertice("C");
        grafo.nuevoVertice("D");
        grafo.nuevoArco(a, b);
        grafo.nuevoArco("C", "D");
        grafo.nuevoArco(a, "C");
        
        System.out.println("Matriz de Adyacencia b!");
        grafo.imprimeMatriz(4);
        grafo.profundidad(4,grafo.verts[0]);
        
    }
}
