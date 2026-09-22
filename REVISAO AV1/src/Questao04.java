import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("1 - Converter de Celsius para Fahrenheit");
            System.out.println("2 - Converter de Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o temperatura em Celsius: ");
                    float celsius = sc.nextFloat();
                    System.out.printf("Fahrenheit: %.2f", (celsius * 9 / 5) + 32);
                    break;
                case 2:
                    System.out.print("Digite o temperatura em Fahrenheit: ");
                    float fahrenheit = sc.nextFloat();
                    System.out.printf("Celsius: %.2f", (fahrenheit - 32) * 5/9);
                    break;
            }
        } while (option != 3);

        sc.close();
    }
}
