package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
    static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("João");

        System.out.println(funcionarios);

        Set<String> produtos = new HashSet<>();
        produtos.add("Água");
        produtos.add("Coca-Cola");
        produtos.add("Água");

        System.out.println(produtos);

    }
}

