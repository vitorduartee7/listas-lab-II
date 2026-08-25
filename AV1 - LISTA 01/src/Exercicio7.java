import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivas = 0;

        System.out.print("Telefonou para a vítima? (S/N): ");
        if (sc.next().equalsIgnoreCase("S")) positivas++;

        System.out.print("Esteve no local do crime? (S/N): ");
        if (sc.next().equalsIgnoreCase("S")) positivas++;

        System.out.print("Mora perto da vítima? (S/N): ");
        if (sc.next().equalsIgnoreCase("S")) positivas++;

        System.out.print("Devia para a vítima? (S/N): ");
        if (sc.next().equalsIgnoreCase("S")) positivas++;

        System.out.print("Já trabalhou com a vítima? (S/N): ");
        if (sc.next().equalsIgnoreCase("S")) positivas++;

        if (positivas == 2) {
            System.out.println("Suspeita");
        } else if (positivas >= 3 && positivas <= 4) {
            System.out.println("Cúmplice");
        } else if (positivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}
