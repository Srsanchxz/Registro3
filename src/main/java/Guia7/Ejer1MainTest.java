/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         String titular;
           String concepto; 
           Float numero_tarjeta;
           String email; 
           String codigo; 
           
           // se crea objeto para leer desde el teclado
           Scanner teclado = new Scanner (System.in);
           
           // se pide por consola los valores y se asignan a cada variable 
           
          System.out.println("Titular de la tarjeta :");
          titular = teclado.nextLine();
          System.out.println("en concepto de: ");
          concepto = teclado.nextLine();
          System.out.println("Numero de tarjeta :");
          numero_tarjeta = Float.parseFloat(teclado.nextLine());
           System.out.println("Ingresa el email :");
          email = teclado.nextLine();
          System.out.println("CVV (codigo de seguridad) :");
          codigo = teclado.nextLine();
          
            // declaracion de la variable que se utilizara para almacenar el password encriptado. 
           String pass_hash; 
           
           //llamada a metodo para encriptar con funcionalidad de Bcrypt - midrot - dependencia agregada.
           pass_hash = encriptar(codigo);
           
           //se crea objeto de tipo login y se llama a constructor para asignar los valores obtenidos del teclado y la variable
           // donde guardamos la contrasena encriptada.
           
           pago_online compra;
           compra = new pago_online(titular, concepto, numero_tarjeta, email, pass_hash);
           
           // se imprime por consola los datos obtenidos del teclado y se verifica si la cadena o password esta encriptada
           System.out.println("Los datos para efectuar el pago son : ");
           System.out.println("tiutular: " +  compra.getTitular());
           System.out.println("concepto: " + compra.getConcepto());
           System.out.println("numero de tarjeta: " + compra.getNumero_tarjeta());
           System.out.println("email: " + compra.getEmail());
            System.out.println("codigo de seguridad: " + compra.getCodigol());
        
               //verificacion del password
           String CVV_check;
           System.out.println("Ingresa el CVV a verificar: ");
           CVV_check= teclado.nextLine();
           if (BCrypt.checkpw(CVV_check, compra.getCodigol())){
               System.out.println("Compra concevida");
           }else{
               System.out.println("ERROR, codigo de seguridad incorrecto.");
           }
        
        
    }
    
      //metodo de tipo static para encriptar, se hace llamado a metodo Bcrypt recibe dos parametros de password
           // y numero de saltos 
           public static String encriptar (String pass){
           
               return BCrypt.hashpw(pass, BCrypt.gensalt());
               
           }
    
}
