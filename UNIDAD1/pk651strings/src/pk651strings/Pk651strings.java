/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk651strings;

/**
 *
 * @author 52563
 */
public class Pk651strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadenaDeTexto ="Universidad politecnica del valle de mexico";
    System.out.println("Cadena Original:" + cadenaDeTexto);
    System.out.println("La longitud de la cadena es" + cadenaDeTexto.length());
    System.out.println("La primera letra de la cadena" + cadenaDeTexto.charAt(0));
    
    int ultimaLetra = (cadenaDeTexto.length()) -1;
    
    
    System.out.println("La ultima letra de la cadena es: " +cadenaDeTexto.charAt(ultimaLetra));
    System.out.println("valor de la subcadena:" + cadenaDeTexto.substring(1,3));
    
    String cadena1 = "hola";
    String cadena2 = "HOLA2";
    

    
    String mayusculasC1 = cadena1.toUpperCase();
    String mayusculasC2 = cadena2.toUpperCase();
    
    Double numeroEntero;
    
    
        System.out.println("La cadena 1 es igual a la cadena2: "+ mayusculasC1.equals(mayusculasC2));
    }
    
}
