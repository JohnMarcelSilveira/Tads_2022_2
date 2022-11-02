package ListasExercicios.Lista09;

import java.util.Scanner;

public class Ex02L09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o tamanho?");
        int tamanho = in.nextInt();

        int matriz[][] = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho * tamanho; i++) {
            int posicao = (i / tamanho) + (i % tamanho);
            if (posicao % 2 == 0) {
                matriz[i / tamanho][i % tamanho] = 0;
            } else {
                matriz[i / tamanho][i % tamanho] = 1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
