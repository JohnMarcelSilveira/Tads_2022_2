import java.util.Scanner;

public class quadrado {

    static int numero;

    public static void main(String[] args) {
        int matriz[][] = new int[8][8];
        Scanner in = new Scanner(System.in);

        numero = 3;
        int teste = 1;

        resetaPosicaoQuadradoPraBaixo(matriz, 0);
        mostraMtariz(matriz);
        while (teste != 0) {
            System.out.println("digiete");
            teste = in.nextInt();
            movimentaQuadrado(matriz, teste);
            mostraMtariz(matriz);

        }

    }

    private static void movimentaQuadrado(int[][] mat, int direcao) {
        switch (direcao) {
            case 1:
                movimentaQuadradoDireita(mat);
                break;
            case 2:
                movimentaQuadradoEsquerda(mat);
                break;
            case 3:
                movimentaQuadradoBaixo(mat);
                break;
            case 4:
                movimentaQuadradoCima(mat);
                break;
        }

    }

    private static void movimentaQuadradoDireita(int[][] mat) {
        boolean continua = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0 && continua) {
                    if (j == mat[i].length - 2 && i < mat.length) {
                        mat[i][j] = 0;
                        mat[i][j + 1] = 0;
                        mat[i + 1][j] = 0;
                        mat[i + 1][j + 1] = 0;
                        System.out.println("ta aqui");
                        resetaPosicaoQuadradoPraBaixo(mat, i + 1);
                        continua = false;
                    } else if (i < mat.length) {
                        mat[i][j + 2] = numero;
                        mat[i][j] = 0;
                        continua = false;
                    } else {
                        break;
                    }
                }
            }
            continua = true;
        }
    }

    private static void movimentaQuadradoEsquerda(int[][] mat) {
        boolean continua = true;

        int linCol[] = pegarLinhaeColuna(mat, false);
        int lin = linCol[0];
        int col = linCol[1];

        if (col >= 2) {
            mat[lin][col] = 0;
            mat[lin - 1][col] = 0;
            mat[lin][col - 2] = numero;
            mat[lin - 1][col - 2] = numero;
        } else {
            resetaPosicaoQuadradoPraCima(mat, lin);
        }
    }

    private static void movimentaQuadradoBaixo(int[][] mat) {
        boolean continua = true;
        int linCol[] = pegarLinhaeColuna(mat, continua);
        int lin = linCol[0];
        int col = linCol[1];
        if (lin + 2 < mat.length) {
            mat[lin][col] = 0;
            mat[lin][col + 1] = 0;
            mat[lin + 2][col] = numero;
            mat[lin + 2][col + 1] = numero;
        }
    }

    private static void movimentaQuadradoCima(int[][] mat) {
        boolean continua = true;
        int linCol[] = pegarLinhaeColuna(mat, false);
        int lin = linCol[0];
        int col = linCol[1];
        if (lin >= 2) {
            mat[lin][col] = 0;
            mat[lin][col - 1] = 0;
            mat[lin - 2][col] = numero;
            mat[lin - 2][col - 1] = numero;
        } 
    }

    private static void resetaPosicaoQuadradoPraBaixo(int[][] mat, int linhaAtual) {

        for (int i = 0; i < 2; i++) {
            mat[linhaAtual][i] = numero;
            mat[linhaAtual + 1][i] = numero;
        }
        mostraMtariz(mat);
        System.out.println();
    }

    private static void resetaPosicaoQuadradoPraCima(int[][] mat, int linhaAtual) {
        int linCol[] = pegarLinhaeColuna(mat, false);
        int lin = linCol[0];
        int col = linCol[1];
        int tamanhoVertical = mat[0].length - 1;

        //zera posições
        mat[lin][col] = 0;
        mat[lin - 1][col] = 0;
        mat[lin - 1][col - 1] = 0;
        mat[lin][col - 1] = 0;

        //preenche as posições em cima 
        mat[lin - 2][tamanhoVertical] = numero;
        mat[lin - 1][tamanhoVertical] = numero;
        mat[lin - 2][tamanhoVertical - 1] = numero;
        mat[lin - 1][tamanhoVertical - 1] = numero;

        /*
         * for (int i = 0; i < 2; i++) {
         * mat[linhaAtual][i] = numero;
         * mat[linhaAtual + 1][i] = numero;
         * }
         */
        mostraMtariz(mat);
        System.out.println();
    }

    private static void mostraMtariz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] pegarLinhaeColuna(int mat[][], boolean primeira) {
        boolean achou = false;
        int linhaColuna[] = new int[2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0 && !achou) {
                    linhaColuna[0] = i;
                    linhaColuna[1] = j;
                    if (primeira)
                        achou = true;
                }
            }
        }
        return linhaColuna;
    }

}
