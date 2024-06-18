package edu.ariel.modulo.introducaoaojava.operadoresbooleanos;

public class OperadoresBooleanos {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        String mensagem1 = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        String mensagem2 = fazendoSol ? "está fazendo sol!" : "não está fazendo sol.";
        System.out.println(mensagem1 + " e " + mensagem2);

        String vamosAPraia = fimDeSemana && fazendoSol ? "Vamos à praia!" : "Não vamos à praia :(";
        System.out.println("Então: " + vamosAPraia);
    }
}