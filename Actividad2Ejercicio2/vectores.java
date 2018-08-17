import java.io.*;
import java.util.Scanner;

public class vectores
{
    public void main () throws IOException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros tendra la primer lista");
        System.out.println("");
        int L1 = teclado.nextInt();
        int a[] = new int [L1];
        System.out.println("Ingrese los numeros de la primera lista");
        for (int i=0; i<L1 ; i++){
            a[i] = teclado.nextInt();
        }
        System.out.println("");
        
        System.out.println("Cuantos numeros tendra la segunda lista");
        System.out.println("");
        int L2 = teclado.nextInt();
        int b[] = new int [L2];
        System.out.println("Ingrese los numeros de la segunda lista");
        for (int i=0; i<L2 ; i++){
            b[i] = teclado.nextInt();
        }
        System.out.println("");
        
        //int f[] = new int [L1];        
        for (int i=0; i<L1 ; i++){
            for (int j=0; j<L2; j++){
                if (a[i] == b[j]){
                    a[i] = a[L1 - 1];
                    L1--;
                    b[j] = b[L2 - 1];
                    L2--;
                }
                
            }
        }
        
        
        int L3 = L1 + L2;        
        int c[] =new int [L3];
        for (int i=0 ; i<L1; i++){
            c[i] = a[i];
        }
        for (int i=L1, j=0; i<L3; i++, j++){
            c[i] = b[j];
        }
        
        for (int i=0; i<L3 ; i++){
            for (int j=i+1; j<L3; j++){
                if (c[i] == c[j]){
                    c[i] = c[L3 - 1];
                    L3--;
                }
            }
        }
                            
        
        for(int i=0 ; i<L3; i++){
            System.out.print(c[i] + " ");
        }
        
        System.out.println();
    }
        
}
    
    

