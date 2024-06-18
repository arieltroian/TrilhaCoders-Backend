package edu.ariel.modulo.introducaojava.vetores;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // índices válidos: [0] [1] [2] [3] [4]
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        String[] letras = new String[6];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        letras[5] = "F";

        // para exibir o array
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for (int j = 0; j < letras.length; j++){
            System.out.println(letras[j]);
        }

        // outra forma de declaração
        String[] nomes = {"Carlos", "Joana", "Alice", "Miguel"};
        for (int k = 0; k < nomes.length; k++){
            System.out.println(nomes[k]);
        }

        // outra forma de exibir o array
        System.out.println(Arrays.toString(nomes));

        // maior, menor e média
        int[] numerosOutro = {10, 40, 22, 98, 2};
        int maior = numerosOutro[0];
        int menor = numerosOutro[0];
        int media = 0;

        for (int l = 0; l < numerosOutro.length; l++){
            if (numerosOutro[l] > maior){
                maior = numerosOutro[l];
            }
            if (numerosOutro[l] < menor){
                menor = numerosOutro[l];
            }
            media += numerosOutro[l];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numerosOutro.length);
    }
}
