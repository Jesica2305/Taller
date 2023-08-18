import java.util.Scanner;
import java.util.Arrays;
public class Ordenamiento {

public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[4];



            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese número: ");
                numeros[i] = scanner.nextInt();
            }



            Arrays.sort(numeros);  // Ordenar el arreglo de números de menor a mayor

            System.out.print("Números ordenados: ");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }

        }

}
