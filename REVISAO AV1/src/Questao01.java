import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        System.out.print("Digite um numero: ");
        Integer num = sc.nextInt();

        for (Integer i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                numerosPares.add(i);
            } else {
                numerosImpares.add(i);
            }
        }

        System.out.println("Numeros pares ate " + num + ": " + numerosPares);
        System.out.println("Numeros impares ate " + num + ": " + numerosImpares);

        sc.close();
    }
}
