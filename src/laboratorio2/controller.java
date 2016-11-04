/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author catalina
 */
public class controller {
    encripta encript = new encripta();
    
    public String invertir(String mensaje){
        return encript.invierte(mensaje);

    }
    
    public String sustituir(String mensaje){
        return encript.sustituye(mensaje);
    }
}
