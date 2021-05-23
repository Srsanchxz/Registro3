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
public class SecurityManagerTest extends SecurityManager {
     
    @Override
    public void checkPackageAccess(String pkg){
    
        throw new SecurityException();
        
    }
}
