package br.com.alura;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");

        List<String> funcionariosLetraA = funcionarios.stream().filter(f -> f.startsWith("A")).collect(Collectors.toUnmodifiableList());


        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);
    }
}

