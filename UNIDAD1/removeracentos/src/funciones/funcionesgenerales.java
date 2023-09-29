
package funciones;


public class funcionesgenerales {
  public String removeracentos(String palabraorigen){
      String palabraretorno = palabraorigen.toLowerCase();
     String conacentos = "áéíóú";
     String sinacentos = "aeiou";
             
             
             
             int ejemplares = conacentos.length();
             
             for (int i = 0; i < ejemplares; i++) {
                 palabraretorno = palabraretorno.replace(conacentos.charAt(i), sinacentos.charAt(i));
             }
             
      return palabraretorno;
      
  }  
}
