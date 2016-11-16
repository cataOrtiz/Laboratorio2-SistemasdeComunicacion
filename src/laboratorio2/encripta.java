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
    
    public int[] sustituye(String mensaje_invertido){
        //
       int i, a_entero;  
       int tamanyo = mensaje_invertido.length();
       int A[]= new int[tamanyo];
       for(i = 0 ; i< tamanyo;i++){
            a_entero = Integer.valueOf(mensaje_invertido.charAt(i));
            //System.out.println(a_entero+"   letra: " +mensaje_invertido.charAt(i));
            A[i] = a_entero;
            //System.out.println(A[i]);
       }
           
           
    return A;
    }
    
    public String Encripta_clave (int A [], String key){
        int tamanyo = A.length;
        int tamanyo_clave = key.length();
        int clave_final [] = new int [tamanyo];
        int mensaje_encriptado [] = new int[tamanyo];
        int i;
        // obteniendo clave
        for(i = 0; i < tamanyo; i++){
               clave_final[i]= key.charAt(i%tamanyo_clave);
               //System.out.println(clave_final[i]);
        }
        
        // encriptando corrimiento de lo que indica la clave
        int j;
        char charac;
        String mensaje_final = "";
        for (j = 0; j < tamanyo; j++){
            mensaje_encriptado[j] = (A[j]+clave_final[j]);
            //System.out.println(mensaje_encriptado[j]);
            charac = (char) mensaje_encriptado[j];
            //System.out.println(charac);
            mensaje_final = mensaje_final + charac;
 
        }
        //System.out.println(mensaje_final);
   
        return mensaje_final;
    }
    
    public String desencripta(int [] mensaje_encrip, String key){
        int tamanyo = mensaje_encrip.length;
        int tamanyo_clave = key.length();
        int clave_final [] = new int [tamanyo];
        int mensaje_desencri [] = new int[tamanyo];
        mensaje_desencri[1] = 3; 
        int i;
        // obteniendo clave
        for(i = 0; i < tamanyo; i++){
               clave_final[i]= key.charAt(i%tamanyo_clave);
        }

        
    // desenriptando con la clave
        int j;  
        char charac;
        String mensaje_final = "";
        for (j = 0; j < tamanyo; j++){
            mensaje_desencri[j] = (mensaje_encrip[j]-clave_final[j]);
            //System.out.println(mensaje_encrip[j]+"____"+ clave_final[j]+"__"+ mensaje_desencri[j]);
            charac = (char) mensaje_desencri[j];
            //System.out.println(charac);
            mensaje_final = mensaje_final + charac;
        }
   
        return mensaje_final;
    }
  

}


