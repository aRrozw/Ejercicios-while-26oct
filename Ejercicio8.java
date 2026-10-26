
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        int contador = 1;
        long primero = 0;
        long segundo = 1;
        long siguiente;

        System.out.print("Ingrese cantidad de términos: ");
        n = teclado.nextInt();

        while (n < 1 || n > 92) {
            System.out.print(
                "Ingrese una cantidad entre 1 y 92: "
            );
            n = teclado.nextInt();
        }

        while (contador <= n) {
            System.out.print(primero);

            if (contador < n) {
                System.out.print(" ");
            }

            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;

            contador++;
        }

        System.out.println();

        teclado.close();
    }
}
