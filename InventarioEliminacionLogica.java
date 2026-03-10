import java.io.*;
import java.util.Scanner;

public class InventarioEliminacionLogica {
    // Método para mostrar contenido de un archivo
    public static void mostrarArchivo(String nombreArchivo) {
        System.out.println("Contenido del archivo: " + nombreArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        System.out.println("-------------------------");
    }

    // Métodos a implementar
    // 1. Marcar un registro como eliminado agregando '#' al inicio si coincide con el producto indicado
    public static void marcarEliminado(String nombreArchivo, String productoEliminar) {
   
        // Completar implementación
        // primero leemos el archivo línea por línea
        // segundo verificamos si la línea contiene el producto a eliminar
        // luego si encontramos el producto, agregamos un '#' al inicio de la línea para marcarlo como eliminado
        // .. finalmente escribimos el contenido actualizado de nuevo en el archivo, sobrescribiendo el original
        // finalmente tenemos el archivo con el producto marcado como eliminado
        // ARCHIVOS 
// Se tiene un archivo de texto llamado inventario.txt que contiene los productos disponibles 
// en la tienda con el siguiente formato (producto, cantidad, precio):
// Camiseta,50,15000 
// Pantalón,30,25000 
// Zapatos,20,40000 
// Gorra,15,10000 
        // 1. Permitir al usuario ingresar el nombre de un producto para eliminarlo lógicamente.
        
    }

    // 2. Crear un nuevo archivo sin los registros marcados como eliminados
    public static void crearArchivoSinEliminados(String archivoOriginal, String archivoNuevo) {
        // Completar implementación
        
        // explicacion unicamente como comentario (solo se comentara explcacion logica)
        // entonces  leemos el archivo original y verificamos que registros no estan marcados como eliminados
        // luego escribimos esos registros en el nuevo archivo
        // entonces tenemos un nuevo archivo sin los productos eliminados

        // finalmente tenemos un nuevo archivo sin los productos eliminados

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String archivo = "inventario.txt";

        mostrarArchivo(archivo);

        System.out.print("Ingrese el nombre del producto para eliminar lógicamente: ");
        String productoEliminar = sc.nextLine();

        marcarEliminado(archivo, productoEliminar);
        mostrarArchivo(archivo);

        String archivoActualizado = "inventario_actualizado.txt";
        crearArchivoSinEliminados(archivo, archivoActualizado);
        mostrarArchivo(archivoActualizado);

        sc.close();
    }
}





// 2. Marcar el registro como eliminado agregando un prefijo, por ejemplo, # al inicio de la línea:
// # Pantalón,30,25000
// 3. Crear un nuevo archivo inventario_actualizado.txt que incluya todos los productos 
// excepto los eliminados.
// 4. Mostrar en consola el contenido del archivo original antes y después de la eliminación, y 
// luego el archivo actualizado.
// Ejemplo:
// 1. Se tiene el archivo:
// Camiseta,50,15000 
// Pantalón,30,25000 
// Zapatos,20,40000 
// Gorra,15,10000 
// 2. Usuario elimina “Pantalón"
// 3. Se visualiza el archivo con marcado de eliminación:
// Camiseta,50,15000 
// #Pantalón,30,25000 
// Zapatos,20,40000 
// Gorra,15,10000 
// 3. Archivo actualizado sin eliminados:
// Camiseta,50,15000 
// Zapatos,20,40000 
// Gorra,15,10000 
