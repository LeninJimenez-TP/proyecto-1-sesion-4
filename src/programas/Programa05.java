
package programas;

import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        //declarar variables
        int numero;
        String palabra;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-5]:");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                palabra = "Número fuera de rango";
                break;
                }
        //salida de datos
         System.out.println("El numero es :"+palabra);
    }
}
