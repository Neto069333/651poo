
package temaarrays;
import java.util.ArrayList;

public class ArrayListSeriesTV {

    
    public static void main(String[] args) {
     ArrayList<String> listaSeries = new ArrayList<>();
     listaSeries.add("Breaking Bad");
     listaSeries.add("The walking dead");
     listaSeries.add("The mentalist");
     
     System.out.println(listaSeries);
     
   
   
    listaSeries.remove("the walking dead");
    System.out.println(listaSeries);
    
    boolean contaithewalkingdead = listaSeries.contains("the walking dead");
     System.out.println("la lista contiene a the walking dead?:"+ contaithewalkingdead);
     
     int tamaño = listaSeries.size();
     System.out.println("El tamaño de ArrayList es:" + tamaño);
     
     
     //Declarar diversos tipos de ArrayList
     ArrayList<Integer> listaInterger = new ArrayList <>();
     ArrayList<Double> listaDouble = new ArrayList<>();
     ArrayList<Boolean> listaBooleanos = new ArrayList<>();
     
     
    }
    
    
}
