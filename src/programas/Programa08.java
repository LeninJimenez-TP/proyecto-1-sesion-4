package programas;

import java.util.Scanner;
public class Programa08 {
       public static void main(String[] args) {
        //declarar variables
        int numero;
        String PeriodoAnual;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero entero (1,2,3,4,6,12):");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:
                PeriodoAnual = "Mensual";
                break;
            case 2:
                PeriodoAnual = "Bimestral";
                break;
            case 3:
                PeriodoAnual = "Trimestral";
                break;
            case 4:
                PeriodoAnual = "Cuatrimestral";
                break;
            case 6:
                PeriodoAnual = "Semestral";
                break;
            case 12:
                PeriodoAnual = "Anual";
                break;
            default:
                PeriodoAnual = "Periodo no definido. Por favor, ingrese un número válido.";
                break;
        }
        //salida de datos
         System.out.println("El numero es :"+PeriodoAnual);
    }
}