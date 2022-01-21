import java.util.Scanner; //Se importa la librería Scanner

class lecturaInt {
   public static Scanner leer = new Scanner(System.in);     //Se crea una variable de tipo Scanner
   public static void main(String[] args){
      int numero = leerInt("Número: ");                     //Se asigna un valor a partir de una función a una variable
      System.out.println(numero);                           //El programa imprime el valor de la variable
   }
   
   public static int leerInt(String texto){                 //Función para leer variables de tipo int
      System.out.print(texto);                              //Imprime un texto por pantalla
      return leer.nextInt();                                //Devuelve la línea escrita como un número
   }
}
