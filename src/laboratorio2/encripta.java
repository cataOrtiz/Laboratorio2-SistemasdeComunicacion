/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;
import java.io.*;
import java.lang.*;
/**
 *
 * @author catalina
 */
public class encripta {
    

    // 1 despues permutar
    
    
    // 2  sustituir
    
    //3 la idea es codificar
        
    public String invierte(String mensaje){
        
        /* opcion mas corta solo que no reconoce reverse()*/
       // String cadena = "abcdfghijklmnopqrst";
       // String alrrevez = cadena.split("").reverse().join("");

       String mensaje_invertido = "";
       for (int x = mensaje.length()-1 ; x >= 0; x--)
            mensaje_invertido = mensaje_invertido + mensaje.charAt(x);
       //System.out.println(mensaje_invertido);
    return mensaje_invertido;
    }
    
    public String sustituye(String mensaje_invertido){
        //
        int m = 0;
        for(int i=0;i<mensaje_invertido.length();i++){
            System.out.println(mensaje_invertido.charAt(i));
            

            char op = mensaje_invertido.charAt(i);
            System.out.print("El resultado es : ");
            switch ( op ) {
                case 'a':
                    
                break;
                case 'e':
                    System.out.println("es e" );
                break;
                case 'i':
                    System.out.println("es i" );
                break;
                case 'o':
                    System.out.println( "es o");
                break;
                case 'u':
                    System.out.println( "es u");
                break;
                default:
                    System.out.println("es otra no hago nada" );
                break;
            }
        }
        return "";
    }
}


