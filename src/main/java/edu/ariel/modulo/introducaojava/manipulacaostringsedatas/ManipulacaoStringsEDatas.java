package edu.ariel.modulo.introducaojava.manipulacaostringsedatas;

import  java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStringsEDatas {
    public static void main(String[] args) {
        // manipulação de Strings
        String meuNome = "Ariel";
        System.out.println(meuNome.toUpperCase());
        System.out.println(meuNome.toLowerCase());
        System.out.println(meuNome.length());

        String outroNome = "ariel";
        // LEVA em consideração letras maiúsculas e minúsculas
        System.out.println(meuNome.equals(outroNome));

        // NÃO LEVA em consideração letras maiúsculas e minúsculas
        System.out.println(meuNome.equalsIgnoreCase(outroNome));

        // Olá, {nome}. Hoje é {dia-da-semana}, {SAUDAÇÃO}.
        String nome = "Ariel";
        LocalDate hoje = LocalDate.now();
        Locale brasil = Locale.of("pt", "BR");

        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s%n", nome, diaSemana,saudacao.toUpperCase());
    }
}
