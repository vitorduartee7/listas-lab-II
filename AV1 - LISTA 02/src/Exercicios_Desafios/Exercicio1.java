package Exercicios_Desafios;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        System.out.println("Série de Fibonacci até 500:");

        while (a < 500){
            System.out.println(a + "");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
