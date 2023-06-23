
package com.mycompany.main;
import java.util.Stack;

public class GrafoMatriz {
    int numVerts;
    static int maxVerts = 20;
    Vertices [] verts;
    int [][] matAd;
    
    public GrafoMatriz(int mx)
    {
        matAd = new int [mx][mx];
        verts = new Vertices[mx]; 
        int j, i;
        for(i=0;i<mx;i++)
        {
            for(j=0;j<mx;j++)
            {
                matAd[i][j]=0;
            }
        }
        numVerts = 0;
    }
    
    public void nuevoVertice(String nom)
    {
        boolean esta = numVertice(nom) >= 0;  //Comprueba que el vertice no se encuentre en el grafo
        
        if(!esta)
        {
            Vertices v = new Vertices(nom);
            v.asignVer(numVerts);
            verts[numVerts++] = v;
        }
    }
    
    public int numVertice(String vs)
    {
        Vertices v = new Vertices(vs);
        boolean esta = false;
        int i=0;
        
        for (; (i < numVerts) && !esta;) {
           esta = verts[i].equals(v);
            if (!esta) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
        
    }
    
    public void nuevoArco(String a, String b)
    {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if(va>=0 && vb>=0)
        {
            matAd[va][vb] = 1;
        }
        else
        {
            System.out.println("Vertice no existe...");
        }
    }
    
    public boolean adyacente(String a, String b)
    {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        
        if(va>=0 && vb>=0)
        {
            return matAd[va][vb]==1;
        }
        return false;
    }
    
    public void imprimeMatriz(int mx)
    {
        int i,j;
        for(i=0;i<mx;i++)
        {
            for(j=0;j<mx;j++)
            {
                System.out.print(" " + matAd[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void profundidad(int mx, Vertices vi) {
    Stack<Vertices> pila = new Stack<>();
    Vertices[] visitado = new Vertices[mx];
    for (int i = 0; i < mx; i++) {
        visitado[i] = null;
    }
    int k = 0;
    boolean visit = false;

    System.out.println(vi.nombreVertice());
    int inicio = vi.numVert();

    for (int i = inicio; i < mx; i++) {
        for (int j = 0; j < mx; j++) {
            if (matAd[i][j] == 1) {
                visit = false;
                for (int l = 0; l < mx; l++) {
                    if (visitado[l] != null && visitado[l] == verts[j]) {
                        visit = true;
                        break;
                    }
                }
                if (!visit) {
                    pila.push(verts[j]);
                    visitado[k] = verts[j];
                    k++;
                }
            }
        }
        if (!pila.empty()) {
            Vertices vertice = pila.pop();
            i = vertice.numVert();
            System.out.println(vertice.nombreVertice());
        }
    }
}

    
}
