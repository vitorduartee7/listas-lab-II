import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 4) {
            System.out.println("Reposicao");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
