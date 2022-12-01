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


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class diagonais extends JPanel implements Runnable, ActionListener {

    int numero;
    int mat[][];
    Font minhaFonte = new Font("Consolas", Font.BOLD, 20);
    JButton botao4;
    JButton botao6;
    JButton botao8;

    public diagonais() {
        propriedadesBotao();
        numero = 8;
        mat = new int[numero][numero];
        mat = preencherMatriz(numero);
        Thread laco = new Thread(this);
        laco.start();
    }

    // #region parte logica

    @Override
    public void paintComponent(Graphics g) {
        // super.paintComponent(g); // limpar a tela;
        g.setColor(Color.WHITE);
        g.fillRect(0, 50, 600, 600);

        g.setColor(Color.BLACK);
        g.setFont(minhaFonte);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.drawString("" + mat[i][j], 50 + j * 20, 100 + i * 20);                
            }
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

    // #endregion

    // #region Funções de Thread

    // #region Run
    // essa função deve ser implementada para manipular a Thread
    public void run() {
        while (true) {
            update();
            repaint();
            dorme();
        }
    }
    // #endregion

    // #region Update
    // atualuza a matriz
    private void update() {
        manipulaMatriz(mat);
    }
    // #endregion

    // #region Dorme
    // essa função serve para dar um timer ao atualizar a tela e ficar mais suave as
    // trasições entre as matrizes
    private void dorme() {
        try {
            Thread.sleep(950);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // #endregion
    // #endregion

    // #region botão

    public void propriedadesBotao() {
        // monta o botão
        botao4 = new JButton("4");
        botao6 = new JButton("6");
        botao8 = new JButton("8");
        // dimensões
        botao4.setBounds(0, 0, 100, 20);
        botao6.setBounds(110, 0, 100, 20);
        botao8.setBounds(220, 0, 100, 20);
        // Adiciona o botao ao frame
        this.add(botao4);
        this.add(botao6);
        this.add(botao8);
        // Adiciona o evento ao botao
        botao4.addActionListener((ActionListener) this);
        botao6.addActionListener((ActionListener) this);
        botao8.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e) {
        if (botao4.getModel().isArmed())
            numero = 4;
        if (botao6.getModel().isArmed())
            numero = 6;
        if (botao8.getModel().isArmed())
            numero = 8;
        mat = new int[numero][numero];
        mat = preencherMatriz(numero);
    }
    // #endregion
}
