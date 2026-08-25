package Exercicios_Desafios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            if (nome.length() < 3) {
                System.out.println("Nome invalido!");
            }
        } while (nome.length() < 3);

        do {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade invalido!");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salario: ");
            salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("Salario invalido!");
            }
        } while (salario < 0);

        do {
            System.out.print("Digite seu sexo (M/F): ");
            sexo = sc.next().toUpperCase().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo invalido!");
            }
        } while (sexo != 'M' && sexo != 'F');

        do {
            System.out.print("Digite seu estado civil (S/C/V/D): ");
            estadoCivil = sc.next().toUpperCase().charAt(0);

            if (estadoCivil != 'S' &&
                    estadoCivil != 'C' &&
                    estadoCivil != 'V' &&
                    estadoCivil != 'F') {
                System.out.println("Estado civil invalido!");
            }
        } while (estadoCivil != 'S' &&
                estadoCivil != 'C' &&
                estadoCivil != 'V' &&
                estadoCivil != 'F');

        System.out.printf("\nNome: %s (Tamanho: " + nome.length() + ")" +
                "| Idade: %d " +
                "| Salario: %.2f" +
                "| Sexo: %c" +
                "| Estado Civil: %c\n"
                , nome, idade, salario, sexo, estadoCivil);

        sc.close();
    }
}
