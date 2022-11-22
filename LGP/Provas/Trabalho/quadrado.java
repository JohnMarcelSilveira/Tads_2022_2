import java.util.Scanner;

public class quadrado {

    static int numero;

    public static void main(String[] args) {
        int matriz[][] = new int[8][8];
        Scanner in = new Scanner(System.in);

        numero = 3;
        int teste = 1;

        resetaPosicaoQuadrado(matriz, 0);
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
                        // mat[i][j] = 0;
                        mat[i][j] = 0;
                        mat[i][j + 1] = 0;
                        mat[i + 1][j] = 0;
                        mat[i + 1][j + 1] = 0;
                        System.out.println("ta aqui");
                        resetaPosicaoQuadrado(mat, i + 1);
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
        for (int i = mat.length - 1; i > 0; i--) {
            for (int j = mat[i].length - 1; j > 0; j--) {
                if (mat[i][j] > 0 && continua) {
                    mat[i][j - 2] = numero;
                    mat[i - 1][j - 2] = numero;
                    mat[i][j] = 0;
                    mat[i - 1][j] = 0;
                    continua = false;
                }
            }
        }
    }

    private static void movimentaQuadradoBaixo(int[][] mat) {
        boolean continua = true;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][1] > 0 && continua && i < mat.length - 2) {
                mat[i][0] = 0;
                mat[i][1] = 0;
                mat[i + 2][0] = numero;
                mat[i + 2][1] = numero;
                continua = false;
            }
        }
    }

    private static void movimentaQuadradoCima(int[][] mat) {
        boolean continua = true;
        for (int i = mat.length - 1; i > 0; i--) {
            if (mat[i][1] > 0 && continua && i > 1) {
                // System.out.println("Passou aqui.");
                mat[i][0] = 0;
                mat[i][1] = 0;
                mat[i - 1][0] = numero;
                mat[i - 1][1] = numero;
                mat[i - 2][0] = numero;
                mat[i - 2][1] = numero;
                continua = false;
            }
        }
    }

    private static void resetaPosicaoQuadrado(int[][] mat, int linhaAtual) {

        for (int i = 0; i < 2; i++) {
            mat[linhaAtual][i] = numero;
            mat[linhaAtual + 1][i] = numero;
        }
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
        int linhaColuna[] = new int[2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0) {
                    linhaColuna[0] = i;
                    linhaColuna[1] = j;
                }
            }
        }
        return linhaColuna;
    }

}
