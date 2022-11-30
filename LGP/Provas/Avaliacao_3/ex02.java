

import java.util.Random;

/*
    Soma e Diferença - Dada uma matriz de tamanho NxN com N definido pelo usuário,
    calcular a soma da matriz com a sua transposta e a diferença entre a matriz e a sua
    transposta, salvando os resultados em novas matrizes e mostrando o resultado.
 */

import java.util.Scanner;

public class ex02 {

    private static void mostrarMatriz(int matTemp[][]){
        for(int i = 0; i < matTemp.length; i++){
            for(int j = 0; j < matTemp[i].length; j++){
                System.out.print(matTemp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int mat[][], tamanho, matTransposta[][],matSoma[][] ,matDiferenca[][];

        System.out.println("Digite o tamanho da matriz quadratica ex: se for uma matriz 4x4 digite apenas 4");
        tamanho = in.nextInt();

        mat = new int[tamanho][tamanho];
        matTransposta = new int[tamanho][tamanho];
        matSoma = new int[tamanho][tamanho]; 
        matDiferenca = new int[tamanho][tamanho];


        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = r.nextInt(1,9);
            }
        }

        System.out.println("Matriz original");
        mostrarMatriz(mat);

        //transpor matriz
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                matTransposta[i][j] = mat[j][i];
            }
        }

        System.out.println("Matriz transposta");
        mostrarMatriz(matTransposta);

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                matSoma[i][j] = mat[i][j] + matTransposta[i][j];
                matDiferenca[i][j] = mat[i][j] - matTransposta[i][j];
            }
        }

        System.out.println("Matriz soma");
        mostrarMatriz(matSoma);

        System.out.println("Matriz diferença");
        mostrarMatriz(matDiferenca);

    }
}
