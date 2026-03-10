public class Recursividad {
    public static String invertirCadena(String texto) {
        // explicacion unicamente como comentario (solo se comentara explcacion logica)


		// implementación aquí 
        // primero con un sout y un imput le pedimos al usuario que nos de string
        // segundo pasamos ese string a un array    
        // luego con un for recorremos el array desde el final hasta el inicio y vamos concatenando los caracteres en una nueva variable
        // finalmente retornamos la variable con la cadena invertida
        
        return "";
	}

    public static void main(String[] args) {
        String original = "Recursividad";
        String invertida = invertirCadena(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}



// Parcial Momento l
// Manejo de archivos y recursividad
// RECURSIVIDAD 
// Implementa una función recursiva en Java que reciba una cadena de texto como parámetro y 
// retorne la misma cadena pero invertida. La función debe llamar a sí misma reduciendo la 
// cadena en cada llamada hasta llegar a una condición base.
// 1. El algoritmo debe tomar la cadena y, en cada llamada recursiva, tomar el primer carácter y 
// colocarlo al final, mientras que invierte el resto de la cadena. La condición base ocurre 
// cuando la cadena está vacía o tiene un solo carácter, en cuyo caso retorna la misma 
// cadena.
// Dada la función:
// public static String invertirCadena(String texto) { 
// // implementación aquí 
// } 
// Y la función de uso:
// public static void main(String[] args) { 
//  String original = "Recursividad"; 
//  String invertida = invertirCadena(original); 
//  System.out.println("Original: " + original); 
//  System.out.println("Invertida: " + invertida); 
// } 
// Input:
// Hola 
// recursividad 
// a 
// Output:
// aloH 
// dadivisrucer 
// a 