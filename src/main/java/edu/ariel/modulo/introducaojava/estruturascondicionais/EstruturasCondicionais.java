package edu.ariel.modulo.introducaojava.estruturascondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // se nota maior ou igual a 70 = aprovado
        int notaAluno = 75;
        if (notaAluno >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // A-80 B-70 C-60 D-0
        int nota = 80;
        String graduacao;

        if (nota >= 80){
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno aprovado!");
                break;
            case "D":
                System.out.println("Aluno reprovado.");
                break;
            default:
                System.out.println("Graduação inválida.");

        }
    }
}
