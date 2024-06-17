package edu.ariel.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        String name = "Ariel";
        System.out.println("Olá, " + name + "!");

        int a = 3;
        int b = 2;
        int soma = a + b;
        int sobtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + sobtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
    }
}