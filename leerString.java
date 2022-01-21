import java.util.Scanner; //Se importa la librer�a Scanner

class lecturaString {
   public static Scanner leer = new Scanner(System.in);     //Se crea una variable de tipo Scanner
   public static void main(String[] args){
      String palabra = leerString("Palabra: ");             //Se asigna a una variable un valor llamando a una funci�n
      System.out.println("Nombre: "+ palabra);              //El programa imprime el valor de la variable
   }
   
   public static String leerString(String texto){           //Funci�n para leer variables del tipo string
      System.out.print(texto);                              //Imprime un texto por pantalla
      return leer.nextLine();                               //Devuelve la l�nea escrita
   }
}