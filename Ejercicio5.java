
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 1;
        long factorial = 1;

        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();

        while (numero < 0 || numero > 20) {
            System.out.print("Ingrese un número entre 0 y 20: ");
            numero = teclado.nextInt();
        }

        while (contador <= numero) {
            factorial = factorial * contador;
            contador++;
        }

        System.out.println("Factorial = " + factorial);

        teclado.close();
    }
}
