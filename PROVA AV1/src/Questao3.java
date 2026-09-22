import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Produto1", 100));
        produtos.add(new Produto("Produto2", 200));
        produtos.add(new Produto("Produto3", 300));

        int tentativas = 0;

        while (tentativas < 4) {
            System.out.print("Digite um produto: ");
            String nome = sc.nextLine();

            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(produto.getNome() + " - " + produto.getPreco());
                } else {
                    System.out.println("Produto nao encontrado!");
                    tentativas++;
                }
                break;
            }

        }

        sc.close();
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
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
