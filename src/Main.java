import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el dividendo (número a dividir): ");
            int dividendo = sc.nextInt();

            System.out.print("Ingrese el divisor (número por el cual dividir): ");
            int divisor = sc.nextInt();
            if (divisor>0){
                
            int resultado=dividiendo/divisor;
            boolean divisionExacta = dividendo % divisor == 0;
            int residuo = dividendo % divisor;
            System.out.println("Resultado de la división: " + result);
            if (divisionExacta) {
                System.out.println("La división es exacta.");
            } else {
                System.out.println("La división no es exacta.");
            }

        } else{ 
                System.out.println("La operación es invalida");}
    }
