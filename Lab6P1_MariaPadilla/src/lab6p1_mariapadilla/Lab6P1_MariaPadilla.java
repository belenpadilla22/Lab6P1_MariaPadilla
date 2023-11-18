/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_mariapadilla;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author belen
 */
public class Lab6P1_MariaPadilla {
    static Scanner leer = new Scanner(System.in);
    static Random ran=new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" M E N U ");
        System.out.println(" 1. Conjuntos ");
        System.out.println(" 2. Cuantos primos tiene ");
        System.out.println(" 3. Salir ");
        System.out.println(" Ingrese una opcion: ");
        int opcion=leer.nextInt();
        int numeros;
        while(opcion>0 && opcion<3){
        switch (opcion){
            case 1: 
                
                System.out.println(" Ingrese un entero: ");
                int SET1=leer.nextInt();
                System.out.println(" Ingrese un entero: ");
                int SET2=leer.nextInt();
                char arregloSET1 []= new char[SET1];
                char arregloSET2 []= new char[SET2];
                arregloSET1=SET1(SET1);
                arregloSET2=SET2(SET2);
                System.out.println(" SET1 ");
                imprimirSET1 (arregloSET1);
                System.out.println();
                System.out.println(" SET2 ");
                imprimirSET2 (arregloSET2);
                System.out.println();
                System.out.println(" O P E R A C I O N E S ");
                System.out.println(" 1.Interseccion ");
                System.out.println(" 2.Diferencia ");
                System.out.println(" Ingrese una operacion : ");
                int opcion2=leer.nextInt();
                while (opcion2>0 && opcion2<2){
                switch (opcion2){
                    case 1: 
                        int menor;
                        if (arregloSET1.length>arregloSET2.length){
                            menor=arregloSET2.length;
                        } else 
                            if (arregloSET2.length>arregloSET1.length){
                                menor=arregloSET1.length;
                            } else {
                                menor=0;
                            }
                        char intercepcion[]=new char[menor];
                        
                        intercepcion=inter(arregloSET1, arregloSET2);
                        imprimirintercepcion(intercepcion );
                        
                        
                        break;
                
                }
                 System.out.println();
                 System.out.println(" Ingrese una operacion : ");
                 opcion2=leer.nextInt();
                }
                
                
              
                break;
            case 2:
                System.out.println();
                System.out.println(" Ingrese el tamaño: ");
                int tamaño=leer.nextInt();
                System.out.println(" Ingrese el limite superior : ");
                int limitesuperior=leer.nextInt();
                System.out.println(" Ingrese el limite inferior: ");
                int limiteinferior=leer.nextInt();
               
                if (tamaño>1 && limitesuperior >limiteinferior)  {      
                    int lista[]=new int[tamaño];
                    lista=genRandArray(lista,tamaño,limitesuperior,limiteinferior);
                    System.out.print(" Arrreglo generado: "); gen(lista);
                    System.out.println();
                    int arreglo[]=getTotalPrimeCount (lista);
                    System.out.print(" No. divisores primos: ");gen(arreglo); 
                }
                   
            break;
            
     
        }
        System.out.println();
        System.out.println(" Ingrese una opcion: ");
        opcion=leer.nextInt();
    }
    }
    public static char [] SET1 ( int SET1){
        char temporal []=new char[SET1];
          for ( int i=0;i<SET1;i++){
              int x=ran.nextInt((73-65)+1)+65;
              temporal[i]=(char)x;
            
            
        }
        return temporal;
   
    }
    public static void imprimirSET1 (char [] arreglo){
        for ( int i=0; i< arreglo.length;i++){
            System.out.print(" [ "+arreglo[i]+ " ] " );
        }
    
    }
     public static char [] SET2 ( int SET2){
        char temporal []=new char [SET2];
          for ( int i=0;i<SET2;i++){
            int y=ran.nextInt((73-65)+1)+65;
            temporal[i]=(char)y;
        }
        return temporal;
   
    }
     public static void imprimirSET2 (char [] arreglo){
        for ( int i=0; i< arreglo.length;i++){
            System.out.print(" [ "+arreglo[i]+ " ] "  );
        }
    
    }

     public static char []inter (char []arreglo1, char[]arreglo2){
       
          int menor;
          int menorarreglo=0;
                if (arreglo1.length>arreglo2.length){
                    menor=arreglo2.length;
                     menorarreglo=2;
                  } else 
                        if (arreglo2.length>arreglo1.length){
                            menor=arreglo1.length;
                            menorarreglo=1;
                          } else {
                             menor=0;
                            }

         char arreglo[]=new char [menor];
         if ( menorarreglo==2){
             
             for (int i = 0; i < arreglo2.length; i++) {
             
            char temporal=arreglo2[i];
             for (int j = 0; j < arreglo1.length; j++) {
                 char temporal2=arreglo1[j];
                 if (temporal==temporal2 ){ 
                     arreglo[i]=temporal;
                     break;
                     
                 }
             }
             
         }
        
         } else if (menorarreglo==1){
             for (int i = 0; i < arreglo1.length; i++) {
            char temporal=arreglo1[i];
             for (int j = 0; j < arreglo2.length; j++) {
                 char temporal2=arreglo2[j];
                 if (temporal==temporal2){
                     arreglo[i]=temporal;
                     break;
                     
                 }
             }
             
         }
         
         
        }
         
       
         return arreglo;
     }
     public static void imprimirintercepcion (char [] arreglo){
        for ( int i=0; i< arreglo.length;i++){
            
            System.out.print(" [ "+arreglo[i]+ " ] "  );
        }
    
    }
     public static void imprimirintercepcion2 (char [] arreglo){
        for ( int i=0; i< arreglo.length;i++){
            if (arreglo[i]=='*'){
            
        }else{
            System.out.print(" [ "+arreglo[i]+ " ] "  );
            }
        }
    
    }
     public static int[]genRandArray(int[] arreglo,int tamaño,int limisuperior,int limiteinferior){
         int lista[]=new int [tamaño];
         for (int i = 0; i < tamaño; i++) {
             int num=ran.nextInt((limisuperior-limiteinferior)+1)+limiteinferior;
             lista[i]=num;
             
         }
         return lista;
         
     
     }
     public static void gen (int [] arreglo){
        for ( int i=0; i< arreglo.length;i++){
            System.out.print(" [ "+arreglo[i]+ " ] "  );
        }
    
    }
     public static boolean isPrime (int numero){
         boolean primo=true;
         for(int i=2;i<numero;i++)   {
             if (numero%i==0){
                 primo=false;
             }
         }   
       return primo;  
     
     }
      public static int countPrimeFactors (int numero){
          int suma=0;
          for (int i=2;i<=numero;i++){
              if (numero%i==0){
                  if (isPrime(i)){
                     suma++;
                  
                  }
              }
          }
          return suma;
      }
      public static int[] getTotalPrimeCount (int[] numero){
        int arreglo[]=new int [numero.length];
          for (int i = 0; i < numero.length; i++) {
              arreglo[i]=countPrimeFactors(numero[i]);
          }
        return arreglo;
      }
     
}
 
    
     

     
     
     
     
    
    

