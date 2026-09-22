package com.vtduarte.av2exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um numero: ");
            int numero1 = Integer.parseInt(sc.nextLine());
            System.out.print("Digite outro numero: ");
            int numero2 = Integer.parseInt(sc.nextLine());

            if (numero2 == 0) {
                throw new ArithmeticException();
            }

            double resultado = (double) numero1 / numero2;

            System.out.println("Resultado da divisao: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida! Digite apenas numeros");
        } catch (ArithmeticException e) {
            System.out.println("Nao e possivel dividir por zero!");
        }

        sc.close();
    }
}
