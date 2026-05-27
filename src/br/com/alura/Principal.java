package br.com.alura;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    static void main(String[] args) {


        String texto = "Meu email é jacqueline@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);


        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
