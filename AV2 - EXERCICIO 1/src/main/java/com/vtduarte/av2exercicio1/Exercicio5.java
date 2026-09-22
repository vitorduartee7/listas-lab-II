package com.vtduarte.av2exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        try {
            System.out.print("Digite a quantidade de notas: ");
            int qntNotas = Integer.parseInt(sc.nextLine());

            int count = 0;
            while (count < qntNotas) {
                System.out.print("Digite a nota: ");
                double nota = Double.parseDouble(sc.nextLine());
                notas.add(nota);
                count++;
            }

            List<Double> notasAprovadas = identificarAprovacoes(notas);

            System.out.println("Notas aprovadas: " + notasAprovadas);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida! Digite apenas numeros!");
        }

        sc.close();
    }

    public static List<Double> identificarAprovacoes(List<Double> notas) {
        return notas.stream()
                .filter(nota -> nota >= 7)
                .toList();
    }
}
