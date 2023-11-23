package pkg651partidosdefutbol;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private static final String nombreArchivo = "partidos.txt";

    public static void main(String[] args) {

        ArrayList<partidosfutbol> partidos = new ArrayList<partidosfutbol>();

        File archivo = new File(nombreArchivo);
        Scanner s = null;

        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split("::");

                // Mapea con Array con objetos de la clase de partidos de futbol
                partidosfutbol partido = new partidosfutbol();
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Impresión de objetos antes de procesar
        System.out.println("Impresión de objetos antes de procesar");
        Iterator<partidosfutbol> itpartidos = partidos.iterator();
        while (itpartidos.hasNext()) {
            partidosfutbol partido = itpartidos.next();
            System.out.println(partido.getEquipoLocal() + " " + partido.getEquipoVisitante() + " " + partido.getGolesLocal() + " " + partido.getGolesVisitante());
        }
        System.out.println("");

        // Examinar partidos empatados
        itpartidos = partidos.iterator();
        while (itpartidos.hasNext()) {
            partidosfutbol partido = itpartidos.next();
            if (partido.getGolesLocal() == partido.getGolesVisitante()) {
                itpartidos.remove();
            }
        }

        System.out.println("Impresión de objetos después de procesar");
        itpartidos = partidos.iterator();
        while (itpartidos.hasNext()) {
            partidosfutbol partido = itpartidos.next();
            System.out.println(partido.getEquipoLocal() + " " + partido.getEquipoVisitante() + " " + partido.getGolesLocal() + " " + partido.getGolesVisitante());
        }
    }
}
