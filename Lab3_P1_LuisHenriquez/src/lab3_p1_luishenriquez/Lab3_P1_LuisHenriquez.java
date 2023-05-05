
package lab3_p1_luishenriquez;

import java.util.Scanner;

public class Lab3_P1_LuisHenriquez {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
       int Menu = 1; 
           
        while (Menu == 1) {
            
          System.out.println("1.Serie Euclidiana ");
          
          System.out.println("2.Pokebola ");
          
          System.out.println("3.¡OK Boomer! ");
          
          System.out.println("4.Salir");
          
          System.out.println("Ingrese una opcion");
          
          int OPC = leer.nextInt();
            
        switch (OPC) { 
            
            
            case 1:
                System.out.println("Ingrese los puntos ");
                int n = leer.nextInt();
                
                int dos = 2;
                int p = 0;
                double total = 0; 
                
                
                if (n > 0) {
                    
                    while (p<=n) {//While
                        
                        for ( p = 1; p <= n; p++){//FOR 1
                            
                            System.out.println("Ingrese un valor para x ");
                            int x = leer.nextInt();
                            System.out.println("Ingrese un valor para y ");
                            int y = leer.nextInt();
                            
                            int resta = x - y;
                            
                            double multi = Math.pow(resta, dos);
                          
                            total = total + multi;
                            
                        }// FIN DEL FOR 1
                            
                    }//FIN DEL While PARA X y Y
                    
                    double totalF = 0; 
                    
                    totalF = Math.sqrt(total); 
                    
                    System.out.println("La distancia euclidiana es:"+ totalF);
                }//Validacion de cero
                else {
                    System.out.println("El numero tiene que ser mayor que cero");
                }
                
                    
            break;
            
            case 2:
                System.out.println("Ingrese el tamano para la pokebola");
                int num = leer.nextInt();
                         
                           for (int x = 1; x <= num / 2 - 1; x++){//1 for
                               for (int a = 1; a <= num * 2 - 1; a++) {//2 for
                                   System.out.print("*");
                               }//fin 2 for
                               System.out.println(" ");
                           }//fin 1 For
                           
                                    for (int x = 1; x <=1; x++){//3
                                        for (int a = 1; a <= num/3+2; a++){//for 4
                                            System.out.print("*");
                                        }//for 4
                                            for (int a = 1; a <= num / 2 + 2; a++){//5
                                                System.out.print("#");

                                            }//for 5
                                                    for (int a = 1; a <= num / 3 + 2; a++){//6
                                                         System.out.print("*");

                                                    }//for 6
                                      System.out.println(" ");
                                    }//for 3
                                    
                                     for (int x = 1; x <=1; x++){//7
                                        for (int a = 1; a <= 1; a++){//for 8
                                            System.out.print("*");
                                        }//for 8
                                            for (int a = 1; a <= num / 2; a++){//9
                                                System.out.print("#");
                                            }//for 9
                                                    for (int a = 1; a <= num / 2 + 2; a++){//10
                                                         System.out.print(" ");
                                                    }//for 10
                                                         for (int a = 1; a <= num / 2; a++){//11
                                                         System.out.print("#");
                                                    }//for 11
                                                              for (int a = 1; a <= 1; a++){//12
                                                         System.out.print("*");
                                                    }//for 12
                                      System.out.println(" ");
                                    }//for 7
                                    
                                            for (int x = 1; x <=1; x++){//13
                                        for (int a = 1; a <= 1; a++){//for 14
                                            System.out.print("*");
                                        }//for 14
                                            for (int a = 1; a <= num / 2; a++){//15
                                                System.out.print(" ");
                                            }//for 15
                                                    for (int a = 1; a <= num / 2 + 2; a++){//16
                                                         System.out.print("#");
                                                    }//for 16
                                                         for (int a = 1; a <= num / 2; a++){//17
                                                         System.out.print(" ");
                                                    }//for 17
                                                              for (int a = 1; a <= 1; a++){//18
                                                         System.out.print("*");
                                                    }//for 18
                                      System.out.println(" ");
                                    }//for 13
                break;
            
                
                
            case 3:
                System.out.println("Ingrese su agno de nacimiento");
                int agno = leer.nextInt();
                
                if (agno>=1946 && agno<=1959){
                    
                    System.out.println("¡Felicidades usted es de la generación Baby Boomer Gen!");
                }
                else if (agno>=1960 && agno<=1974){
                   
                    System.out.println("¡Felicidades usted es de la generación X!");
                }
                 else if (agno>=1975 && agno<=1979){
                     
                     System.out.println("¡Felicidades usted es de la generación Xennials!");
                 }
                else if (agno>=1980 && agno<=1989){
                    
                    System.out.println("¡Felicidades usted es de la generación Millenials!");
                }
                else if (agno>=1990 && agno<=2012){
                    
                     System.out.println("¡Felicidades usted es de la generación Gen Z");
                }
                else if (agno>=2013 && agno<=2025){
                     System.out.println("¡Felicidades usted es de la generación Gen Alpha");
                }
                else {
                    System.out.println("Ingreso una fecha invalida :(");
                }
                    
                break;
                
            case 4:
                System.out.println("Quiere ingresar de vuelta al programa, ingrese 1");
                Menu = leer.nextInt();
                break;
            
            default:
                System.out.println("Opcion invalida");
                break;
                
        }//Fin del switch  
            
            
          
          
        }//Fin del while Menu
        
    }
    
}
