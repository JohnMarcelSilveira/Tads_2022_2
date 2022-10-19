
/* Dados dois vetores de tamanho N, faça um programa que diga quantos
valores são iguais nos dois vetores na mesma posição. */

import java.util.Scanner;

public class ex01 {

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

    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        int[] vetor1, vetor2;
        int valoresIguais = 0;

        System.out.println("Digite o tamanho dos vetores");
        int tamanho = in.nextInt();

        vetor1 = PreencheVetor(tamanho, 1);
        vetor2 = PreencheVetor(tamanho, 2);

        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] == vetor2[i])
                valoresIguais++;
        }
        if (valoresIguais > 1)
            System.out.println("Foram encontrados " + valoresIguais + " valores iguais");
        else if (valoresIguais == 1)
            System.out.println("Foi encontrado " + valoresIguais + " valor igual");
        else
            System.out.println("Não foi encontrado nenhum valor igual");

    }
}