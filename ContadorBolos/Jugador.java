import java.util.Scanner;

/**
 * 
 */
public class Jugador
{
    Scanner teclado = new Scanner(System.in);
        int Ron = 1;
        int t1 = 0;
        int t2 = 0;
        int Mo = 1;
        int Mmo = 1;
        int tot = 0;    
    
    public void jugador(){
        int Ron = 1;
        int t1 = 0;
        int t2 = 0;
        int Mo = 1;
        int Mmo = 1;
        int tot = 0;
        
        System.out.println(".::BUENA SUERTE::.");
        System.out.println("");
        System.out.println("EMPECEMOS");
        System.out.println("");
        
        ronda();
    }
    
    public void ronda(){
        if (Ron == 10){
            rondafinal();
        }
        tiro1();
        if (t1 < 10){
            tiro2();
        }
                       
    }
    
    public void rondafinal(){
        System.out.println("");
        System.out.println(".:Ronda Final:.");
        
        tirof();
        tirof2();
        if (t1 == 10 || (t1 + t2) == 10){
            System.out.println("Cuantos pinos tumbo en el lanzamiento 3:");
            t1 = teclado.nextInt();
            tot = tot + t1;
        }
        
                
        finalJuego();
        nuevoJuego();
    }
    
    public void finalJuego(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(".::: FIN DE JUEGO:::.");
        System.out.println("Tu puntaje final es: " + tot);
                
    }
    
    public void tiro1(){
        System.out.println(".::RONDA "+Ron+"::.");
        System.out.println("");
        System.out.println("Cuantos pinos tumbo en el lanzamiento 1:");
        t1 = teclado.nextInt();
        
        if (t1 > 10){
            System.out.println(".::ERROR::. Tiro debe ser menor que 10");
            tiro1();
        }
        
        if (t1 == 10){
            if (Mo == 1 && Mmo == 2){
                tot = (t1 * Mmo) + tot;
                Mmo = Mmo - 1;
                Mo = Mo + 1;
                System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
                    System.out.println(" ¡¡¡Esta cobrando!!!");
                }
            }
            else
                if (Mo == 1){
                    tot = (t1*Mo) + tot;
                    Mo = Mo  + 1;
                    
                    if (Mo > 1 || Mmo > 1){
                          System.out.println(" ¡¡¡Esta cobrando!!!");
                    }
                }
                else
                    if (Mo == 2){
                        tot = (t1*Mo) + tot;
                        Mo = Mo  + 1;
                        System.out.println("Total acumulado es: "+ tot);
                        if (Mo > 1 || Mmo > 1){
                            System.out.println(" ¡¡¡Esta cobrando!!!");
                        }
                    }
                    else
                        if (Mo == 3){
                            tot = (t1*Mo) + tot;
                            System.out.println("Total acumulado es: "+ tot);
                            if (Mo > 1 || Mmo > 1){
                                System.out.println(" ¡¡¡Esta cobrando!!!");
                            }
                        }
            Ron = Ron + 1;
            ronda();
        }
        else
            if (Mo == 3){
                tot = tot + (t1*Mo);
                Mo = Mo - 1;
            }
            else
                if (Mo == 2){
                    tot = tot + (t1*Mo);
                }
                else
                    if (Mo == 1){
                        if (Mmo == 2){
                            tot = tot + (t1*Mmo);
                            Mmo = Mmo - 1;
                        }
                        else
                            tot = tot + t1;
                    }
        
        System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
            System.out.println(" ¡¡¡Esta cobrando!!!");
        }
        //System.out.println("Mo " + Mo);
        //System.out.println("Mmo" + Mmo);
    }
               
    public void tiro2(){
       System.out.println("Cuantos pinos tumbo en el lanzamiento 2:");
       t2 = teclado.nextInt();
       
       if ((t2+t1) > 10){
            System.out.println(".::ERROR::. La suma de los tiros no puede ser mayor que 10");
            tiro2();
        }
        
       
       if ((t1 + t2) == 10){
           Mmo = Mmo + 1;
        }
               
       if (Mo == 2){
            tot = (t2*Mo) + tot;
            Mo = Mo  - 1;
       }
       else
            tot = tot + t2;   
        
       System.out.println("Total acumulado es: "+ tot);
       if (Mo > 1 || Mmo > 1){
            System.out.println(" ¡¡¡Esta cobrando!!!");
       }
        
       Ron = Ron + 1;
       ronda();
    }
    
    public void tirof(){
        System.out.println(".::RONDA "+Ron+"::.");
        System.out.println("");
        System.out.println("Cuantos pinos tumbo en el lanzamiento 1:");
        t1 = teclado.nextInt();
        
        if (t1 > 10){
            System.out.println(".::ERROR::. Tiro debe ser menor que 10");
            tiro1();
        }
        
        if (t1 == 10){
            if (Mo == 1 && Mmo == 2){
                tot = (t1 * Mmo) + tot;
                Mmo = Mmo - 1;
                Mo = Mo + 1;
                System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
                    System.out.println(" ¡¡¡Esta cobrando!!!");
                }
            }
            else
                if (Mo == 1){
                    tot = (t1*Mo) + tot;
                    Mo = Mo  + 1;
                    System.out.println("Total acumulado es: "+ tot);
                    if (Mo > 1 || Mmo > 1){
                          System.out.println(" ¡¡¡Esta cobrando!!!");
                    }
                }
                else
                    if (Mo == 2){
                        tot = (t1*Mo) + tot;
                        Mo = Mo  + 1;
                        System.out.println("Total acumulado es: "+ tot);
                        if (Mo > 1 || Mmo > 1){
                            System.out.println(" ¡¡¡Esta cobrando!!!");
                        }
                    }
                    else
                        if (Mo == 3){
                            tot = (t1 * 2) + tot;
                            System.out.println("Total acumulado es: "+ tot);
                            if (Mo > 1 || Mmo > 1){
                                System.out.println(" ¡¡¡Esta cobrando!!!");
                            }
            }
                       
        }
        else
            if (Mo == 3){
                tot = tot + (t1*Mo);
                Mo = Mo - 1;
            }
            else
                if (Mo == 2){
                    tot = tot + (t1*Mo);
                    Mo = Mo - 1;
                }
                else
                    if (Mo == 1){
                        if (Mmo == 2){
                            tot = tot + (t1*Mmo);
                            Mmo = Mmo - 1;
                        }
                        else
                            tot = tot + t1;
                    }
        
        System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
            System.out.println(" ¡¡¡Esta cobrando!!!");
        }
        
    }
    
    public void tirof2(){
        System.out.println("Cuantos pinos tumbo en el lanzamiento 2:");
        t2 = teclado.nextInt();
        
        if (t2 > 10){
            System.out.println(".::ERROR::. Tiro debe ser menor que 10");
            tiro1();
        }
                        
        if (t2 == 10){
            if (Mo == 1){
                tot = (t2 * Mo) + tot;              
                System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
                    System.out.println(" ¡¡¡Esta cobrando!!!");
                }
            }
            else
                if (Mo == 2){
                        tot = (t2*Mo) + tot;
                        Mo = Mo  - 1;
                        if (Mo > 1 || Mmo > 1){
                            System.out.println(" ¡¡¡Esta cobrando!!!");
                        }
                    }  
                    else
                    if (Mo == 3){
                            tot = (t1*Mo) + tot;
                            System.out.println("Total acumulado es: "+ tot);
                            if (Mo > 1 || Mmo > 1){
                                System.out.println(" ¡¡¡Esta cobrando!!!");
                            }
        }
        else
            if (Mo == 2){
                    tot = tot + (t2 * Mo);
                    Mo = Mo - 1;
                }
                else
                    if (Mo == 1){
                        if (Mmo == 2){
                            tot = tot + (t2);
                            Mmo = Mmo - 1;
                        }
                        else
                            tot = tot + t2;
                    }
        
        
        System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
            System.out.println(" ¡¡¡Esta cobrando!!!");
        }
    }
    else
        tot = tot + t2;
    System.out.println("Total acumulado es: "+ tot);
                if (Mo > 1 || Mmo > 1){
            System.out.println(" ¡¡¡Esta cobrando!!!");
        }    
    
   }
    
    
     public void nuevoJuego(){
        int dato;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("DESEA JUGAR NUEVAMENTE");
        System.out.println("Marque 1 para nueva partida.");
        System.out.println("Marque 0 para salir.");
        dato = teclado.nextInt();
        Ron = 1;
        tot = 0;
        Mo = 1;
        Mmo = 1;
        if (dato == 1){
            jugador();
        }
        if (dato != 1){
            System.exit(0);
        }
    }
    
   } 


      
    

