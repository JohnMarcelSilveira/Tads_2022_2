/*Escreva um programa que leia um número inteiro positivo n e
em seguida imprima n linhas do chamado Triângulo de Pascal. Obs: será necessário
criar vetores dinamicamente
*/

import java.util.Scanner;

public class ex05 {

    public static Scanner in = new Scanner(System.in);

    static void MostraVetor(int[] vec, int interacao) {
        // System.out.print("O vetor é ");
        for (int i = 0; i < interacao; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        int vetor[], contador;

        System.out.println("Digite um número inteiro positivo:");
        int tamanho = in.nextInt();

        vetor = new int[tamanho];

        contador = 1;
        // soma = 0;

        while (contador <= tamanho) {
            int[] temporario = new int[contador];
            for (int i = 0; i < contador; i++) {
                temporario[i] = vetor[i];
            }
            for (int i = 0; i < contador; i++) {
                if (i == 0 || i == (contador - 1)) {
                    vetor[i] = 1;
                } else {
                    vetor[i] = temporario[i] + temporario[i - 1];
                }
            }
            MostraVetor(vetor, contador);
            contador++;
        }

    }
}