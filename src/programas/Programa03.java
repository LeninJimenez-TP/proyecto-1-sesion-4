
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //declarar variables
        int n;
        String mesaño;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-12]:");
        n=lectura.nextInt();
        //proceso de datos
        mesaño="";
        switch (n){
            case 1:
                mesaño="Enero";
                break;
            case 2:
                mesaño="febrero";
                break;
            case 3:
                mesaño="Marzo";
                break;
            case 4:
                mesaño="Abril";
                break;
            case 5:
                mesaño="Mayo";
                break;
            case 6:
                mesaño="Junio";
                break;
            case 7:
                mesaño="Julio";
                break;
             case 8:
                mesaño="Agosto";
                break;
             case 9:
                mesaño="Septiembre";
                break;
            case 10:
                mesaño="Octubre";
                break;
            case 11:
                mesaño="Noviembre";
                break;
            case 12:
                mesaño="Diciembre";
                break;
        }
        //salida de datos
        System.out.println("El mes del año:"+mesaño);    
    }
}