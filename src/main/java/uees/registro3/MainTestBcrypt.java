/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MainTestBcrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           String nombre;
           String apellidos; 
           Float edad;
           String departamento; 
           String email; 
           String id_usuario; 
           String password;
           
           // se crea objeto para leer desde el teclado
           Scanner teclado = new Scanner (System.in);
           
           // se pide por consola los valores y se asignan a cada variable 
           
          System.out.println("Ingresa el nombre del usuario :");
          nombre = teclado.nextLine();
          System.out.println("Ingresa el apellido del usuario :");
          apellidos = teclado.nextLine();
          System.out.println("Ingresa la edad :");
          edad = Float.parseFloat(teclado.nextLine());
          System.out.println("Ingresa el departamento :");
          departamento = teclado.nextLine();
          System.out.println("Ingresa el email :");
          email = teclado.nextLine();
          System.out.println("Ingresa el id :");
           id_usuario = teclado.nextLine();
           System.out.println("Ingresa el password :");
           password = teclado.nextLine();
           
           // declaracion de la variable que se utilizara para almacenar el password encriptado. 
           String pass_hash; 
           
           //llamada a metodo para encriptar con funcionalidad de Bcrypt - midrot - dependencia agregada.
           pass_hash = encriptar(password);
           
           //se crea objeto de tipo login y se llama a constructor para asignar los valores obtenidos del teclado y la variable
           // donde guardamos la contrasena encriptada.
           
           Login registro;
           registro = new Login(nombre, apellidos, edad, departamento, email, id_usuario, pass_hash);
           
           // se imprime por consola los datos obtenidos del teclado y se verifica si la cadena o password esta encriptada
           System.out.println("Los datos de registro son: ");
           System.out.println("nombre: " + registro.getNombre());
           System.out.println("apellidos: " + registro.getApellido());
           System.out.println("edad: " + registro.getEdad());
           System.out.println("departamento: " + registro.getDepartamento());
           System.out.println("Email: " + registro.getEmail());
           System.out.println("Id: " + registro.getId_usuario());
           System.out.println("password: " + registro.getPassword());
           
           //verificacion del password
           String password_check;
           System.out.println("Ingresa el password a verificar: ");
           password_check = teclado.nextLine();
           if (BCrypt.checkpw(password_check, registro.getPassword())){
               System.out.println("El password es correcto");
           }else{
               System.out.println("El password es incorrecto");
           }
 
           
           }
           
            //metodo de tipo static para encriptar, se hace llamado a metodo Bcrypt recibe dos parametros de password
           // y numero de saltos 
           public static String encriptar (String pass){
           
               return BCrypt.hashpw(pass, BCrypt.gensalt());
               
           }
           
    }



