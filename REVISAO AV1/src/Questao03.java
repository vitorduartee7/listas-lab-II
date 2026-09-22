import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        System.out.println("Dobro dos numeros de 1 ate " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + i*2);
        }

        sc.close();
    }
}
