
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 1;

        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();

        while (contador <= 12) {
            System.out.println(numero + " x " + contador
                    + " = " + (numero * contador));
            contador++;
        }

        teclado.close();
    }
}
