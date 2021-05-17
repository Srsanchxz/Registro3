/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3.guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a, b;
        double result;
   try{
           
                System.out.println("Introduce un numero: ");
                a = entrada.nextDouble();
                   try{
                         
                    System.out.println("Introduce otro numero: ");
                    b = entrada.nextDouble();
                    
                    result = a/b; 
                    System.out.println("el resultado es:  " + result);
                      }catch(InputMismatchException e){
             
                    System.out.println("debe introducir un numero");
                }
            }catch (InputMismatchException e){
           entrada.nextLine();
  
                System.out.println("debe introducir un numero.");
            }catch (ArithmeticException e){
                    System.out.println("La division entre cero no existe.");
                     }finally{
                        System.out.println("ejecucion terminada.");
                        }
            
    }
    
}
