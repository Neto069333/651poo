/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpersonas;

import java.util.ArrayList;


/**
 *
 * @author 52563
 */
public class ArrayListpersonas {

  
    public static void main(String[] args) {
       ArrayList<persona> listapersona = new ArrayList<>();
       listapersona.add(new persona(1,"Benito", 15));
       listapersona.add(new persona(2,"hola", 17));
       listapersona.add(new persona(3,"gil", 19));
       listapersona.add(new persona(4,"Dieguito", 75));
        
        //System.out.println(listapersona);
        System.out.println("-------------------for--------------");
        for (int i = 0; i <listapersona.size(); i++){
         System.out.println("Contenido:" + listapersona.get(i).getNombre());
         
    }
    System.out.println ("--------------OyeGil esto por EACH----------");
    for (persona perso :listapersona){
        System.out.println("contenido:" + perso.getNombre());
    }
    
    }
    
    
}
