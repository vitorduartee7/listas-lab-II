import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n3 = sc.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("Maior: " + maior);

        sc.close();
    }
}
