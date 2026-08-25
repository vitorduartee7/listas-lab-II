package Exercicios_Desafios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja? ");
        int numLimite = sc.nextInt();

        int soma = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= numLimite; i++) {
            int num;

            do {
                System.out.print("Digite o " + i + "º numero (de 0 a 1000): ");
                num = sc.nextInt();

                if (num < 0 || num > 1000) {
                    System.out.println("Numero invalido!");
                }
            } while (num < 0 || num > 1000);

            if (i == 1) {
                maior = num;
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            soma += num;
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
