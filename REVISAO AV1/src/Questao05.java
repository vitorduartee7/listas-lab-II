import java.util.ArrayList;
import java.util.List;

public class Questao05 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Produto 1", 50.00));
        produtos.add(new Produto("Produto 2", 60.00));
        produtos.add(new Produto("Produto 3", 70.00));

        for (Produto produto : produtos) {
            System.out.println("Produtor " + produto.getNome() +
                    " - " + produto.getPreco() + " R$");
        }
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