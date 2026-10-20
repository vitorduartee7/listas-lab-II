package com.vtduarte;

public class Validacoes {

    static void validarSenha(String senha) {
        if (senha.length() <= 3) {
            System.out.println("Senha deve ter no minimo 3 caracteres");
        } else if (senha.length() > 100) {
            System.out.println("Por favor digite uma senha menor que 100");
        } else System.out.println("Senha valida!");
    }
}
