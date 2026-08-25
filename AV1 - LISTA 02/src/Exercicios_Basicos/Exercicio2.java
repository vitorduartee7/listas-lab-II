package Exercicios_Basicos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero limite: ");
        int limite = sc.nextInt();

        int contador = 0;

        while (contador <= limite){
            System.out.println(contador);
            contador++;
        }

        sc.close();
    }
}
