
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long numero;
        long auxiliar;
        int digitos = 0;

        System.out.print("Ingrese un número: ");
        numero = teclado.nextLong();

        while (numero < 100) {
            System.out.print(
                "Ingrese un entero positivo de tres o más cifras: "
            );
            numero = teclado.nextLong();
        }

        auxiliar = numero;

        while (auxiliar > 0) {
            auxiliar = auxiliar / 10;
            digitos++;
        }

        System.out.println("Cantidad de dígitos: " + digitos);

        teclado.close();
    }
}
