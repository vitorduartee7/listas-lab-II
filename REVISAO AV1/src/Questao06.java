import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Joao", "82988008822", "joao@gmail.com"));
        contatos.add(new Contato("Maria", "82988008833", "maria@gmail.com"));

        System.out.print("Nome Buscado: ");
        String nomeBuscado = sc.next();

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("Email: " + contato.getEmail());
                break;
            }
        }

        sc.close();
    }
}

class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}

