
package programas;

/**
 *
 * @author FALABELLA
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declatrar variables
        int opc;
        double n1,n2,r;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("ingresar numero 1.");
        n1=lectura.nextDouble();
        System.out.print("ingresar numero 2.");
        n2=lectura.nextDouble();
        System.out.print("ingresar la opcion(1=suma, 2=resta, 3=multiplicacion, 4=division):");
        opc=lectura.nextInt();
        //proceso de datos
        r=0.0;
        switch (opc){
             case 1:r=n1+n2;break;
             case 2:r=n1-n2;break;
             case 3:r=n1*n2;break;
             case 4:r=n1/n2;break;
    }
        //salida de datos
        System.out.println("El resultado es :"+r);
  
    }
    
}
