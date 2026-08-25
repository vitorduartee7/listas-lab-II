package Exercicios_Desafios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja? ");
        int numLimite = sc.nextInt();

        int soma = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= numLimite; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            int num = sc.nextInt();

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
