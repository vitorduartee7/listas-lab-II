import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Time> times = new ArrayList<>();

        times.add(new Time("PSG", 1930, 40, "Franca"));
        times.add(new Time("City", 1940, 30, "Inglaterra"));
        times.add(new Time("Barcelona", 1920, 70, "Espanha"));

        System.out.print("Digite seu time: ");
        String nomeTime = sc.next();

        for (Time time : times) {
            if (time.getNome().equalsIgnoreCase(nomeTime)) {
                System.out.printf("Meu time é, %s! Tem %d anos de criado e possui %d títulos. Time é da %s.",
                        time.getNome(),
                        (2026 - time.getAnoCriacao()),
                        time.getQuantidadeTitulos(),
                        time.getPais());
            }
        }

        sc.close();
    }
}

class Time {
    private String nome;
    private int anoCriacao;
    private int quantidadeTitulos;
    private String pais;

    public Time(String nome, int anoCriacao, int quantidadeTitulos, String pais) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.quantidadeTitulos = quantidadeTitulos;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public String getPais() {
        return pais;
    }
}
