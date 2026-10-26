
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        int contador = 1;
        int suma = 0;

        System.out.print("Ingrese N: ");
        n = teclado.nextInt();

        while (n <= 0) {
            System.out.print("Ingrese un entero positivo: ");
            n = teclado.nextInt();
        }

        while (contador <= n) {
            suma = suma + contador;
            contador++;
        }

        System.out.println("Resultado: " + suma);

        teclado.close();
    }
}
