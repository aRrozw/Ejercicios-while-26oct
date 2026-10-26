
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        int contador = 1;
        int cantidad = 0;

        System.out.print("Ingrese N: ");
        n = teclado.nextInt();

        while (n <= 0) {
            System.out.print("Ingrese un entero positivo: ");
            n = teclado.nextInt();
        }

        while (contador <= n) {
            if (contador % 2 == 0) {
                cantidad++;
            }
            contador++;
        }

        System.out.println("Cantidad de pares: " + cantidad);

        teclado.close();
    }
}
