import java.util.Scanner;

public class MasaCorporal {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su estatura en metros: ");
            double medida = scanner.nextDouble();
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            double imc = peso / (medida* medida);



            String condicion = "";

            if (edad < 45) {
                if (imc < 22.0) {
                    condicion = "bajo riesgo";
                } else if (imc >= 22.0 && imc <= 24.9) {
                    condicion = "riesgo moderado";
                } else {
                    condicion = "alto riesgo";
                }
            } else {
                if (imc < 22.0) {
                    condicion = "riesgo moderado";
                } else if (imc >= 22.0 && imc <= 24.9) {
                    condicion = "alto riesgo";
                } else {
                    condicion = "muy alto riesgo";
                }
            }
            System.out.printf("Su índice de masa corporal (IMC) es: %.2f%n", imc);
            System.out.println("Su condición de riesgo es: " + condicion);


        }

}
