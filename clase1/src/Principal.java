
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el primer numero");

        int primerNumero = teclado.nextInt();

        System.out.println("Escribe el segundo numero");

        int segundoNumero = teclado.nextInt();

        System.out.println("LA suma Es: " + (primerNumero+segundoNumero));


    }

}
