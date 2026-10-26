
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int numero;
        int mayor;
        int menor;

        System.out.println("Ingrese 10 números:");

        System.out.print("Número 1: ");
        numero = teclado.nextInt();

        mayor = numero;
        menor = numero;
        contador++;

        while (contador <= 10) {
            System.out.print("Número " + contador + ": ");
            numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        teclado.close();
    }
}
