import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que turno voce estuda? ('M - Matutino' ; 'V - Vespertino' ; 'N - Noturno'): ");
        char turno = sc.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M' -> System.out.println("Bom Dia!");
            case 'V' -> System.out.println("Boa Tarde!");
            case 'N' -> System.out.println("Boa Noite!");
            default -> System.out.println("Valor Inválido!");
        }

        sc.close();
    }
}
