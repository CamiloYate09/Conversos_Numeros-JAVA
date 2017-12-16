package conversos_numeros;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Conversos_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese Numero: ");

        String hexadecimal = "";
        String binario = "";
        String octal = "";

        int n = entrada.nextInt();
        //JOptionPane.showInputDialog( n = entrada.nextInt());
        //convertimos numero a ingresado a hexadecimal

        hexadecimal = Integer.toHexString(n);

        //convertimos numero a ingresado a octal
        octal = Integer.toOctalString(n);
        //convertimos numero a ingresado a binario

        binario = Integer.toBinaryString(n);

        //JOptionPane.showMessageDialog(null, "----------------");
        System.out.println("-------------------------------");

        System.out.println("Su Numero " + n + " En decimal: " + n);
        //JOptionPane.showMessageDialog(null, "Su Numero " + n + " En decimal: " + n);
        //JOptionPane.showMessageDialog(null, "Numero en" + n + " Hexadecimal " + hexadecimal);
        System.out.println("Numero en" + n + " Hexadecimal " + hexadecimal);
        System.out.println("Numero en " + n + " Octal " + octal);
        //JOptionPane.showMessageDialog(null, "Numero en " + n + " Octal " + octal);
        System.out.println("Numero en " + n + " Binario " + binario);
        //JOptionPane.showMessageDialog(null, "Numero en " + n + " Binario " + binario);
    }

}
