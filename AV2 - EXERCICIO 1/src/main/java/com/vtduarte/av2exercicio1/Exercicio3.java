package com.vtduarte.av2exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite as horas trabalhadas: ");
            int horasTrabalhadas = Integer.parseInt(sc.nextLine());

            System.out.println(verificarHorasTrabalhadas(horasTrabalhadas));
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida! Digite apenas numeros");
        }

        sc.close();
    }

    public static String verificarHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 40) {
            return "Carga completa";
        } else {
            return "Carga incompleta";
        }
    }
}
