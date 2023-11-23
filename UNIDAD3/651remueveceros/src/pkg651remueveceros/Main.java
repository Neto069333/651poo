package pkg651remueveceros;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    
    private static final String nombreArchivo = "numeros.txt"; //final por que es constante

    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> arrayListNumeros = new ArrayList<ArrayList<Integer>>();
       File archivo = new File (nombreArchivo);
       Scanner s = null;
       try {  //intenta hacer esto pero si hay un error
           s = new Scanner(archivo);
           while (s.hasNextLine()){
               String linea =s.nextLine();
               linea.split(" ");
               String [] cortarString = linea.split(" ");
               
               ArrayList<Integer> numeros = new ArrayList<Integer>(); 
               for(int i = 0; i < cortarString.length; i++){
               numeros.add(Integer.parseInt(cortarString[i]));
               }
               arrayListNumeros.add(numeros);
               //numeros.forEach(System.out::print);
           }
       }catch(Exception e){
           e.printStackTrace();// imprime que error es
       }
//       System.out.println("Imprimir con un Iterador un Array list");
//       Iterator<ArrayList<Integer>> itArrayList = arrayListNumeros.iterator();
//       while(itArrayList.hasNext()){
//           ArrayList<Integer> numeros = itArrayList.next();
//           Iterator<Integer> itNumeros = numeros.iterator();
//           while(itNumeros.hasNext()){
//               System.out.println(numeros + " ");
//           }
//       }
       Iterator<ArrayList<Integer>> itArrayList = arrayListNumeros.iterator();
       while(itArrayList.hasNext()){
           ArrayList<Integer> numeros = itArrayList.next();
           Iterator<Integer> itNumeros = numeros.iterator();
           while(itNumeros.hasNext()){
               int numero = itNumeros.next();
               if(numero == 0){
                   itNumeros.remove();
               }              
           }
           numeros.forEach(System.out::print);
         }
       int ConteoSietes = 0; 
try {
    s = new Scanner(archivo);
    while (s.hasNextLine()){
        String linea = s.nextLine();
        linea.split(" ");
        String[] cortarString = linea.split(" ");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < cortarString.length; i++){
            int numero = Integer.parseInt(cortarString[i]);
            numeros.add(numero);
            if (numero == 7) {
                ConteoSietes++;
            }
        }
        arrayListNumeros.add(numeros);
    }
} catch (Exception e){
    e.printStackTrace();
}
System.out.println("El numero total de 7 es: " + ConteoSietes);

int ConteoOchos = 0;

try {
    s = new Scanner(archivo);
    while (s.hasNextLine()){
        String linea = s.nextLine();
        linea.split(" ");
        String[] cortarString = linea.split(" ");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < cortarString.length; i++){
            int numero = Integer.parseInt(cortarString[i]);
            numeros.add(numero);
            if (numero == 8) {
                ConteoOchos++;
            }
        }
        arrayListNumeros.add(numeros);
    }
} catch (Exception e){
    e.printStackTrace();
}

System.out.println("El número total de 8 es: " + ConteoOchos);

int ConteoNueves = 0;

try {
    s = new Scanner(archivo);
    while (s.hasNextLine()){
        String linea = s.nextLine();
        linea.split(" ");
        String[] cortarString = linea.split(" ");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < cortarString.length; i++){
            int numero = Integer.parseInt(cortarString[i]);
            numeros.add(numero);
            if (numero == 9) {
                ConteoNueves++;
            }
        }
        arrayListNumeros.add(numeros);
    }
} catch (Exception e){
    e.printStackTrace();
}

System.out.println("El número total de 9 es: " + ConteoNueves);

      }  
   }