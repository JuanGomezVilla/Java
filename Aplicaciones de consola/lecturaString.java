import java.util.Scanner; //Se importa la librería Scanner

class lecturaString {
   public static Scanner leer = new Scanner(System.in);     //Se crea una variable de tipo Scanner
   public static void main(String[] args){
      String palabra = leerString("Palabra: ");             //Se asigna un valor a partir de una función a una variable
      System.out.println("Palabra: "+ palabra);             //El programa imprime el valor de la variable
   }
   
   public static String leerString(String texto){           //Función para leer variables de tipo string
      System.out.print(texto);                              //Imprime un texto por pantalla
      return leer.nextLine();                               //Devuelve la línea escrita
   }
}
