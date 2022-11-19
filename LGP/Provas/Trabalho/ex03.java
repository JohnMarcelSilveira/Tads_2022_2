/*
 * Faça um programa com uma matriz [8][8] que preencha cada uma das diagonais dela de forma
consecutiva e automatizada, utilizando um valor único para cada diagonal, e que faça com que após
o preenchimento, os valores sejam atualizados para o valor da próxima diagonal. Escolha e informe
ao usuário uma tecla que será utilizada para a finalização (enquanto o usuário não finalizar, continua
andando com as diagonais). Por exemplo, em uma matriz 4x4:
     1  2  3  4     2  3  4  1
     2  3  4  1  →  3  4  1  2
     3  4  1  2     4  1  2  3
     4  1  2  3     1  2  3  4

     https://www.youtube.com/watch?v=AL4nseu7sRE
 */

import javax.swing.JFrame;

import javax.swing.JTextArea;

public class ex03 extends JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercicio 3 Logica");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        jogoDaVelha velha = new jogoDaVelha();
        velha.setBounds(0, 0, 600, 600);
        frame.add(velha);

        // ex03 janela = new ex03();
        // janela.setBounds(0,0,600,600);
        // janela.add(paintComponent(getGraphics()));
        /// janela.setSize(640,480);
        // janela.setVisible(true);

        /*
         * int numero = 8;
         * int mat[][] = new int[numero][numero];
         * mat = preencherMatriz(8);
         * mostrarMatriz(mat);
         * 
         * while (true) {
         * System.out.println();
         * mostrarMatriz(manipulaMatriz(mat));
         * }
         */

    }

    // parte logica

    static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*
     * essa função é para fazer a matriz "andar" e fazer o movimento das diagonais e
     * para isso eu simplesmente peguei a primeira linha e joguei ela para a ultima
     * linha da matriz e as demais eu fui subindo uma a uma, a linha 1 foi para
     * linha zero e assim sucessivamente até chegar a ultima linha
     */
    static int[][] manipulaMatriz(int[][] matriz) {
        int matrizAuxiliar[][] = new int[matriz.length][matriz[0].length];
        matrizAuxiliar = copiarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0)
                    matriz[matriz.length - 1][j] = matrizAuxiliar[i][j];
                else
                    matriz[i - 1][j] = matrizAuxiliar[i][j];
            }
        }
        return matriz;
    }

    /*
     * essa função é necessária pois uma matriz não pode simplesmente ser copiada
     * com um sinal de igualdade pois esse ato significa copiar a referencia de uma
     * matriz
     * então para clonar a matriz eu peguei a matriz original e fui passando
     * elemento por elemento e preenchendo na matriz clone
     */
    static int[][] copiarMatriz(int[][] matrizOriginal) {
        int matrizClone[][] = new int[matrizOriginal.length][matrizOriginal[0].length];
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizClone[i][j] = matrizOriginal[i][j];
            }
        }
        return matrizClone;
    }

    /*
     * A lógica aqui é preencher a primeira linha com a sequencia do número 1 até o
     * numero recebido por parametro ex: parametro 4, sequencia 1,2,3 e 4
     * com a primeira linha preenchida então essa função segue a logica que o valor
     * da posição [1][0] é igual o valor da posição [0][0] + 1
     * ex:
     * posição [0][0] = 1 posição [0][1] = 2 posição [0][2] = 3 posição [0][3] = 4
     * posição [1][0] = 2 posição [1][1] = 3 posição [1][2] = 4 posição [1][3] = 1
     * posição [2][0] = 3 posição [2][1] = 4 posição [2][2] = 1 posição [2][3] = 2
     * posição [4][0] = 4 posição [3][1] = 1 posição [3][2] = 2 posição [3][3] = 3
     */
    static int[][] preencherMatriz(int numero) {
        int matriz[][] = new int[numero][numero];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0)
                    matriz[0][j] = j + 1;
                else if (matriz[i - 1][j] < numero)
                    matriz[i][j] = matriz[i - 1][j] + 1;
                else
                    matriz[i][j] = 1;

            }
        }

        return matriz;
    }

    // parte grafica

    private JTextArea texto = new JTextArea();

    public ex03() {
        // Define o título da janela
        super("Exercicio 3 Logica");
        this.montaJanela();
    }

    private void montaJanela() {
        this.getContentPane().add(texto);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        // this.getContentPane().add(texto);
    }

}
