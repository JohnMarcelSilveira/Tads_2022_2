/*Faça um programa que recebe dois vetores de tamanho que o usuário
escolha. Execute a soma destes, elemento a elemento e coloque em um outro vetor. */

import java.util.Scanner;

public class ex02 {

    public static Scanner in = new Scanner(System.in);

    static int[] PreencheVetor(int tamanho, int identificacaoDoVetor) {
        int[] vetorPreenchido = new int[tamanho];
        // Scanner in = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor da " + (i + 1) + "ª posição do vetor " + identificacaoDoVetor);
            vetorPreenchido[i] = in.nextInt();
        }

        return vetorPreenchido;
    }

    static void MostraVetor(int[] vec) {
        System.out.print("O vetor é ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int vetor1[], vetor2[], vetorSoma[], tamanho;
        // Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores");
        tamanho = in.nextInt();

        vetor1 = new int[tamanho];
        vetor2 = new int[tamanho];
        vetorSoma = new int[tamanho];

        vetor1 = PreencheVetor(tamanho, 1);
        vetor2 = PreencheVetor(tamanho, 2);

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        MostraVetor(vetorSoma);

    }
}