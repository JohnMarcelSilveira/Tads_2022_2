

/*
    Linhas Especiais - Faça um programa que leia uma Matriz 5x5 e, após a leitura (em
    um laço separado), calcule e mostre a diferença entre a linha com a maior soma e a
    linha com a menor soma.
 */

import java.util.Scanner;

public class ex01 {

    private static void mostrarMatriz(int matTemp[][]){
        for(int i = 0; i < matTemp.length; i++){
            for(int j = 0; j < matTemp[i].length; j++){
                System.out.print(matTemp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][], maiorSomaLinha, menorSomaLinha, somaLinha;

        mat = new int[5][5];
        maiorSomaLinha = 0;
        menorSomaLinha = 0;
        somaLinha = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Digite o valor:");
                mat[i][j] = in.nextInt();                
            }
        }

        mostrarMatriz(mat);

        for(int i = 0; i < mat.length; i++){
            somaLinha = 0;
            for(int j = 0; j < mat[i].length; j++){
                somaLinha = somaLinha + mat[i][j];
                if(j == mat.length-1){
                    maiorSomaLinha = maiorSomaLinha>somaLinha ? maiorSomaLinha : somaLinha; 
                    if(i == 0)
                    menorSomaLinha = somaLinha;
                    if(menorSomaLinha>somaLinha && somaLinha > 0 )
                        menorSomaLinha = somaLinha;                    
                }
            }
        }

        System.out.println(maiorSomaLinha);
        System.out.println(menorSomaLinha);

    }
}