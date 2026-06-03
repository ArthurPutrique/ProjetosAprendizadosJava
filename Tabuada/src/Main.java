import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int numero;
        numero = scanner.nextInt();

        System.out.println("A Tabuada de " + numero + ": ");
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}