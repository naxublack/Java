/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.ejercicio.pkg2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Tarea1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Crear parámetro n de cantidad de elementos en el array
    Scanner s = new Scanner(System.in); 
    int n;
        System.out.println("Cantidad de elementos del arreglo: ");
        n = s.nextInt();
    
    
    //Crear array A
    Scanner sc=new Scanner(System.in);
   int[] a=new int[n];
    int i=0;
   while (i<a.length){
       System.out.println("Índice "+i+": 0 ó 1? ");
       a[i]=sc.nextInt();
       i++;
   }
   //Crear array B
    Scanner kc=new Scanner(System.in);
   int[] b=new int[n];
    int j=0;
   while (j<b.length){
       System.out.println("Costo del índice "+j+" del arreglo B: ");
       b[j]=kc.nextInt();
       j++;
   } 
   
   //Imprimir Vectores
   System.out.println("Vector A: "+Arrays.toString(a));
   System.out.println("Vector B: "+Arrays.toString(b));
   
   int sum = 0;
     for (int k = 0; k < n; k++) 
     {
        sum += a[k] * b[k];    
     }
     //Imprimir costo
     System.out.println("Costo total de la Mochila: "+sum);

    
    
    
    
    }
}
