import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Cripto> criptos = new ArrayList<>();

        System.out.print("Digite o nome da Cripto: ");
        String nome = sc.next();
        System.out.print("Digite o preco da Cripto: ");
        double preco = sc.nextDouble();

        criptos.add(new Cripto(nome, preco));

        System.out.print("Digite o nome da Cripto: ");
        String nome2 = sc.next();
        System.out.print("Digite o preco da Cripto: ");
        double preco2 = sc.nextDouble();

        criptos.add(new Cripto(nome2, preco2));

        System.out.println("\nCriptos:");
        for (Cripto cripto : criptos) {
            System.out.println(cripto.getNome() + " - " + cripto.getPreco());
        }

        sc.close();
    }
}

class Cripto {
    private String nome;
    private double preco;

    public Cripto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}