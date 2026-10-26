
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 1000;
        double retiro = -1;

        while (retiro != 0) {
            System.out.printf(
                "Saldo actual: S/ %.2f%n", saldo
            );
            System.out.print("Retiro (0 para salir): ");
            retiro = teclado.nextDouble();

            if (retiro == 0) {
                System.out.println("Gracias por usar el cajero.");
            } else if (retiro < 0) {
                System.out.println(
                    "Error: ingrese un monto positivo."
                );
            } else if (retiro > saldo) {
                System.out.println(
                    "Error: saldo insuficiente."
                );
            } else {
                saldo = saldo - retiro;
                System.out.printf(
                    "Saldo restante: S/ %.2f%n", saldo
                );
            }
        }

        teclado.close();
    }
}
