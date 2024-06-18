package edu.ariel.modulo.introducaojava.lacosnumericos;

public class LacosNumericos {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }

        // variando de 2 em 2
        for (int k = 1; k <= 50; k+=2){
            System.out.println(k);
        }
    }
}
