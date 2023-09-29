
package pk651arrelgos;


public class Pk651arrelgos {

   
    public static void main(String[] args) {
        /// Problema : Escribir un programa para insertar el numero de episodios
        // de una serie "Dr .House" y que nos devuelva la duracion
        
        System.out.println("*************************************");
        System.out.println("*** Serie de Dr House ***********");
        System.out.println("*************************************");
        
        int[] epidsodiosSerie = new int[5];
        
         epidsodiosSerie [0] = 30;
         epidsodiosSerie [1] = 50;
         epidsodiosSerie [2] = 25;
         epidsodiosSerie [3] = 60;
         epidsodiosSerie [4] = 45;
         
         
         // numero de episodios
         int episodios = epidsodiosSerie.length;
         
         System.out.println("total de episodios  de la Serie Dr. House:" + episodios );
         
         int acomulador=0;
         for(int i = 0; i < epidsodiosSerie.length; i++) {
             acomulador = acomulador + epidsodiosSerie[i];
             
         }
                 
         
         System.out.println("Duracion total de la Serie Dr. House: " + acomulador);
         System.out.println("Capitulos con duracion de mas de 40 minutos son");
         
         for (int i = 0; i < epidsodiosSerie.length; i++){
             if (epidsodiosSerie[i]>40{
                    )
             System.out.println("Capitulo:" +epidsodiosSerie[i+1]);
             
         }
         
    }
    
}
