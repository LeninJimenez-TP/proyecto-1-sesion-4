
package programas;

import java.util.Scanner;
public class Programa06 {
       public static void main(String[] args) {
        //declarar variables
        int numero;
        String romanos;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-10]:");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:
                romanos = "I";
                break;
            case 2:
                romanos ="II";
                break;
            case 3:
                romanos = "III";
                break;
            case 4:
                romanos = "IV";
                break;
            case 5:
                romanos = "V";
                break;
            case 6:
                romanos = "VI";
                break;
            case 7:
                romanos = "VII";
                break;
            case 8:
                romanos = "VIII";
                break;
            case 9:
                romanos = "IX";
                break;
            case 10:
                romanos = "X";
                break;
            default:    
                romanos = "Número fuera de rango";
                break;
                }
        //salida de datos
         System.out.println("El numero es :"+romanos);
    }
}
