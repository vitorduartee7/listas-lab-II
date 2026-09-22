package com.vtduarte.av2exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
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

            double media = calcularMedia(notas);

            System.out.println("Media do aluno: " + media);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida! Digite apenas numeros!");
        }

        sc.close();
    }

    public static double calcularMedia(List<Double> notas) {
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("A lista nao pode estar vazia"));
    }
}
