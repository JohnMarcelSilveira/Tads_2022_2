package ListasExercicios.Lista09;

import java.util.Random;
import java.util.Scanner;

public class Ex04L09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[10][10];

        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(10, 99);
            }
        }

        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                if (col < lin) {
                    System.out.print(" - ");
                } else {
                    System.out.print(matriz[lin][col] + " ");
                }
            }
            System.out.println();
        }

    }
}
