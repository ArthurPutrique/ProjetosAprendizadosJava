import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);

        System.out.println("Informe o 1º Número inteiro: ");
        int numero1Convertido = numero1.nextInt();
        System.out.println("Informe o 2º Número inteiro: ");
        int numero2Convertido = numero2.nextInt();

        /* Comparação Desnecessaria
        if (numero1Convertido == numero2Convertido) {
            System.out.println("Os dois valores inteiros são Iguais.");
        } else {
            System.out.println("Os dois valores inteiros são Diferentes.");
        }  */

       // Valores maior, menor ou Igual
        if (numero1Convertido > numero2Convertido) {
            System.out.println(numero1Convertido + " É maior que " + numero2Convertido);
        } else if (numero2Convertido > numero1Convertido) {
            System.out.println(numero2Convertido + " É maior que " + numero1Convertido);
        } else {
            System.out.println("Os valores são Iguais.");
        }
    }
}