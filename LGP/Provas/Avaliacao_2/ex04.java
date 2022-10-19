
/*Faça um programa que leia um vetor de 15 posições e o compacte, ou
seja, elimine as posições com valor zero criando e mostrando o novo vetor do
tamanho certo */

import java.util.Scanner;

public class ex04 {

    public static Scanner in = new Scanner(System.in);

    static int[] PreencheVetor(int tamanho) {
        int[] vetorPreenchido = new int[tamanho];
        // Scanner in = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor da " + (i + 1) + "ª posição do vetor:");
            vetorPreenchido[i] = in.nextInt();
        }

        return vetorPreenchido;
    }

    static void MostraVetor(int[] vec) {
        System.out.print("O vetor compactado é ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);

        int[] vetorOriginal, vetorCompacto;
        int tamanho = 15;

        vetorOriginal = new int[15];

        vetorOriginal = PreencheVetor(15);

        for (int i = 0; i < 15; i++) {
            if (vetorOriginal[i] == 0)
                tamanho--;
        }

        vetorCompacto = new int[tamanho];

        int j = 0;
        for (int i = 0; i < 15; i++) {
            if (vetorOriginal[i] != 0) {
                vetorCompacto[j] = vetorOriginal[i];
                j++;
            }
        }

        MostraVetor(vetorCompacto);

    }
}