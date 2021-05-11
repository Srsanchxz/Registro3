/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia7;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class pago_online {
        
    private String titular; 
    private String concepto; 
    private float numero_tarjeta;
    private String email; 
    private String codigo; 

    public pago_online  (String titular, String concepto, float numero_tarjeta, String email, String codigo){
            this.titular= titular; 
            this.concepto = concepto;
            this.numero_tarjeta= numero_tarjeta;
            this.email = email;
            this.codigo = codigo;
}
    
    public String getTitular() {
       return titular; 
    }
    
    public void setTitular (String titular){
      this.titular = titular;  
    }
    
public String getConcepto(){
    return concepto;
}

public void setConcepto(String concepto){
this.concepto = concepto;
}

public float getNumero_tarjeta(){
   return numero_tarjeta;
}

public void setNumero_tarjeta(float numero_tarjeta){
    this.numero_tarjeta = numero_tarjeta;
}

public String getEmail() {
return email;
}

public void setEmail(String email){
this.email = email;
}

public String getCodigol() {
return codigo;
}

public void setCodigo(String codigo){
this.codigo = codigo;
}



}
