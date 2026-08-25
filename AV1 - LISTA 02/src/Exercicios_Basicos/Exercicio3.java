package Exercicios_Basicos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Operacao - Adicao! \n");

        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite um numero: ");
            int n1 = sc.nextInt();
            System.out.print("Digite outro numero: ");
            int n2 = sc.nextInt();

            System.out.printf("\n%d + %d = %d\n", n1, n2, n1+n2);

            System.out.println("\nDeseja realizar outra soma? (S/N)");
            resposta = sc.next();
        }

        sc.close();
    }
}
