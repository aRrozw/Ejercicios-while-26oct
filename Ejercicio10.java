
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int secreto = 50;
        int numero;
        int intentos = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = teclado.nextInt();

            intentos++;

            if (numero < secreto) {
                System.out.println("El número es mayor");
            } else if (numero > secreto) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Correcto!");
                System.out.println(
                    "Intentos realizados: " + intentos
                );
                break;
            }
        }

        teclado.close();
    }
}
