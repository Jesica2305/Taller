import java.util.Scanner;

public class Triangulos {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese la longitud del primer lado: ");
            double lado1 = input.nextDouble();

            System.out.println("Ingrese la longitud del segundo lado: ");
            double lado2 = input.nextDouble();

            System.out.println("Ingrese  la longitud del tercer lado: ");
            double lado3 = input.nextDouble();

            String resultado = tipoDeTriangulo(lado1,lado2,lado3);
            System.out.println(resultado);

            input.close();
        }

        public static String tipoDeTriangulo(double a, double b, double c) {
            if (a + b <= c || a + c <= b || b + c <= a) {
                return "Eso no es un triángulo válido.";
            } else if (a == b && b == c) {
                return "Es un triángulo equilátero.";
            } else if (a == b || a == c || b == c) {
                return "Es un triángulo isósceles.";
            } else {
                return "Es un triángulo escaleno.";
            }
        }
}
