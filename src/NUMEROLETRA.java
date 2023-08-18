import java.util.Scanner;

public class NUMEROLETRA {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un carácter: ");
            char letraNumero = scanner.next().charAt(0);

            if (Character.isLetter(letraNumero)) {
                if (Character.isUpperCase(letraNumero)) {
                    System.out.println("El carácter es una letra mayúscula.");
                } else {
                    System.out.println("El carácter es una letra minúscula.");
                }
            } else if (Character.isDigit(letraNumero)) {
                System.out.println("El carácter es un número.");
            } else {
                System.out.println("El carácter no es una letra ni un número.");
            }

        }
}

