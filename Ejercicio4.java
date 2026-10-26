
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        double nota;
        double suma = 0;
        double promedio;

        while (contador <= 5) {
            System.out.print("Nota " + contador + ": ");
            nota = teclado.nextDouble();

            suma = suma + nota;
            contador++;
        }

        promedio = suma / 5;

        System.out.printf("Promedio: %.1f%n", promedio);

        teclado.close();
    }
}
