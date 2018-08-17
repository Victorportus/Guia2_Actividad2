import java.util.Scanner;

public class desviacionEstandar
{
    public void main()
    {
     Scanner teclado = new Scanner(System.in);
     int i;
     double devStand = 0;
     double prom = 0;     
     int cuantosN;    
     double sum = 0;
     double x = 0;
     System.out.println("Introduzca la cantidad de numeros que desea calcular");
     cuantosN = teclado.nextInt();
          
     double a[] = new double [cuantosN];
          
     for (i=0;i<cuantosN;i++){
         System.out.println("Igngrese los numeros");     
         a[i] = teclado.nextDouble();
        }
     
     System.out.println("Los numeros a calcular son:"); 
     for (i=0 ; i<cuantosN ; i++){
         System.out.print(a[i] + " ");           
        }
     
     System.out.println("");
     for (i=0 ; i<cuantosN ; i++){
         prom = prom + a[i];         
        }
     prom = prom / cuantosN;
     
     for (i=0 ; i<cuantosN ; i++){
         sum = sum + Math.pow((a[i]-prom),2);         
        }
     
     x =cuantosN - 1;
     x = 1/x;
     devStand = Math.sqrt((x)*sum);      
     System.out.println("La desviacion estandar es: " + devStand);
     System.out.println("");
     System.out.println("");
     System.out.println("");
     
     main();
     
    }
}
