import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number = numero.nextInt();

        if (number < 0) {
            System.out.println("Número negativo.");
        } else if (number > 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Valor não suportado!");
        }
    }
}