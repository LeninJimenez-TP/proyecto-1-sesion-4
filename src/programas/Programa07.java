package programas;

import java.util.Scanner;
public class Programa07 {
       public static void main(String[] args) {
        //declarar variables
        int numero;
        String Ingles;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-6]:");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:
                Ingles = "one";
                break;
            case 2:
                Ingles ="two";
                break;
            case 3:
                Ingles = "three";
                break;
            case 4:
                Ingles = "four";
                break;
            case 5:
                Ingles= "five";
                break;
            case 6:
                Ingles = "six";
                break;
            default:    
                Ingles = "Número fuera de rango";
                break;
                }
        //salida de datos
         System.out.println("El numero es :"+Ingles);
    }
}
