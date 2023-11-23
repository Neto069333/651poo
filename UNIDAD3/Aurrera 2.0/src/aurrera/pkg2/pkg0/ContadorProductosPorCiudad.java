
package aurrera.pkg2.pkg0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContadorProductosPorCiudad {

    public static void main(String[] args) {
        // Crear un mapa para almacenar la cantidad de productos por ciudad
        Map<String, Map<String, Integer>> productoPorCiudad = new HashMap<>();

        // Leer el archivo de texto
        try (BufferedReader br = new BufferedReader(new FileReader("ArchivoBaseCompraProductos.txt"))) {
            String linea;
            // Leer cada línea del archivo
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en campos
                String[] campos = linea.split(" ");
                if (campos.length >= 5) {
                    String ciudad = campos[3];
                    String producto = campos[5];
                    // Verificar si la ciudad ya está en el mapa
                    if (!productoPorCiudad.containsKey(ciudad)) {
                        productoPorCiudad.put(ciudad, new HashMap<>());
                    }
                    Map<String, Integer> productosEnCiudad = productoPorCiudad.get(ciudad);
                    // Incrementar la cuenta del producto en la ciudad
                    productosEnCiudad.put(producto, productosEnCiudad.getOrDefault(producto, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los resultados
        for (Map.Entry<String, Map<String, Integer>> entry : productoPorCiudad.entrySet()) {
            String ciudad = entry.getKey();
            Map<String, Integer> productosEnCiudad = entry.getValue();
            System.out.println("Ciudad: " + ciudad);
            for (Map.Entry<String, Integer> productoEntry : productosEnCiudad.entrySet()) {
                String producto = productoEntry.getKey();
                int cantidad = productoEntry.getValue();
                System.out.println("Producto: " + producto + ", Cantidad: " + cantidad);
            }
            System.out.println();
        }
    }
}
