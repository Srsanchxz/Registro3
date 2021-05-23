/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3.Guia9;

/**
 *
 * @author Dani PC
 */
public class TestSecManagerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //estableciendo el archivo de politica como la politica de seguridad del sistema 
        System.setProperty("java.security.policy","file:/C:/DEMO/java.policy");
        
        // creando el security manaager 
        SecurityManagerTest sm = new SecurityManagerTest();
        
        //asignando secirity manager al sistema
        sm.checkPackageAccess("uees.registro3.Guia9");
        
        //imprimiendo mensaje para ver si pasa la validacion de permiso del paquete
        System.out.println("Acceso consedido.");
    
    }
    
}
