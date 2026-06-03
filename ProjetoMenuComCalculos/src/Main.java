import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("""
                               ----------Menu---------
                               1. Calcular área do Quadrado
                               2. Calcuar área do Circulo
                               3. Sair
                               Escolha uma Opção:
                               """);
            escolha = opcao.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = opcao.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = opcao.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa Finalizado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}