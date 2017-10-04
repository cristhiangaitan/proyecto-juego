
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

   
    public static void main(String[] args) {
        int a;
        int b;
        int n;
        int arm;
        int v;
        char [][] mapa;
        
        //longitud del mapa
        Scanner lector= new Scanner (System.in);
        System.out.println("Hola señor usuario");
        System.out.println("Porfavor digite el tamaño de la longitud A");
        a= lector.nextInt();
        System.out.println("Porfavor digite el tamaño de la longitud B");
        b= lector.nextInt();
        mapa= new char [a][b];
        
        //numero de jugadores
        System.out.println("Porfavor digite la cantidad de jugadores");
        n=lector.nextInt();
        if (n<10){
            System.out.println("Cantidad de jugadores permitida");
        }
        else {
            System.out.println("Cantidad de jugadores excedida");
        }
        //cantidad de armas
       System.out.println("Cantidad de jugadores permitida"); 
       arm=lector.nextInt();
       
       //cantidad de curas
       System.out.println("Inserte el numero de vidas");
       v=lector.nextInt();
       
       //mapa
       for (int i=0;i<a;i++)
           for (int j=0;j<b;j++)
              if (i==0||j==0||i==b-1||j==a-1)
              
       mapa [i][j]= 'X';
       
              else{
                  mapa [i][j]=' ';
              }
       for (int i=0;i<a;i++){
           
           for (int j=0;j<b;j++){
             System.out.print(mapa[i][j]);
             System.out.println("");
           }
           
       }
    }
    
}
