/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;
import java.io.*;
/**
 *
 * @author catalina
 */
public class encripta {
    

    // 1 despues permutar
    
    
    // 2  sustituir
    
    //3 la idea es codificar
    
    String mensaje = "Maravilloso";
    public String invertir(String mensaje){
       String mensaje_invertido = null;
       for (int x = mensaje.length()-1 ; x >= 0; x--)
            mensaje_invertido = mensaje_invertido + mensaje.charAt(x);
       System.out.println(mensaje_invertido);
    return mensaje_invertido;
    }
        
}


