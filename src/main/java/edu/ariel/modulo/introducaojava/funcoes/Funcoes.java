package edu.ariel.modulo.introducaojava.funcoes;

public class Funcoes {
    public static void main(String[] args) {
        String nomeOriginal = "Ariel";
        saudacao(nomeOriginal);

        int resultado = soma(2, 3);
        System.out.println("O resultado da soma é: " + resultado);
    }
    public static void saudacao(String nomeParametro){
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}
