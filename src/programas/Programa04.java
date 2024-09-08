
package programas;

import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        //declar variable
        int numero;
        String estacion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-12]:");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Número fuera de rango";
                break;
        }
        //salida de datos
         System.out.println("El mes del año:"+estacion);
    }
}