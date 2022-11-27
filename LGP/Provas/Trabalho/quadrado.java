import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class quadrado extends JPanel implements Runnable, ActionListener {

    static int numero;
    Font minhaFonte = new Font("Consolas", Font.BOLD, 20);
    int mat[][];
    int direcao;
    JButton btnDireita;
    JButton btnEsquerda;
    JButton btnCima;
    JButton btnBaixo;

    public quadrado() {
        mat = new int[8][8];
        numero = 3;
        direcao = 9;
        propriedadesBotao();
        resetaPosicaoQuadradoPraBaixo(mat, 0);
        Thread laco = new Thread(this);
        laco.start();
    }

    // #region Parte Logica

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // limpar a tela;
        g.setColor(Color.WHITE);
        g.fillRect(0, 50, 600, 600);

        g.setColor(Color.BLACK);
        g.setFont(minhaFonte);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 != 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.drawString("" + mat[i][j], 50 + j * 20, 100 + i * 20);
            }
        }

    }

    private static void movimentaQuadradoDireita(int[][] mat) {
        boolean continua = true;
        boolean puleiAlinha = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0 && continua) {
                    if (j == mat[i].length - 2 && i < mat.length - 2) {
                        mat[i][j] = 0;
                        mat[i][j + 1] = 0;
                        mat[i + 1][j] = 0;
                        mat[i + 1][j + 1] = 0;
                        resetaPosicaoQuadradoPraBaixo(mat, i + 1);
                        continua = false;
                        puleiAlinha = true;
                        // esse else é para não dar estouro de campo na mat e poder atender um dos
                        // requisitos do exercicio que é continuar apesar dos limites
                    } else if (i < mat.length && !puleiAlinha && j < mat[i].length - 2) {
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

        int linCol[] = pegarLinhaeColuna(mat, false);
        int lin = linCol[0];
        int col = linCol[1];

        if (col >= 2) {
            mat[lin][col] = 0;
            mat[lin - 1][col] = 0;
            mat[lin][col - 2] = numero;
            mat[lin - 1][col - 2] = numero;
        } else {
            resetaPosicaoQuadradoPraCima(mat, lin); // esse else é para não dar estouro de campo na mat e poder atender
                                                    // um dos requisitos do exercicio que é continuar apesar dos limites
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

    }

    private static void resetaPosicaoQuadradoPraCima(int[][] mat, int linhaAtual) {
        int linCol[] = pegarLinhaeColuna(mat, false);
        int lin = linCol[0];
        int col = linCol[1];
        int tamanhoVertical = mat[0].length - 1;
        if (lin >= 2) {
            // zera posições
            mat[lin][col] = 0;
            mat[lin - 1][col] = 0;
            mat[lin - 1][col - 1] = 0;
            mat[lin][col - 1] = 0;

            // preenche as posições em cima

            mat[lin - 2][tamanhoVertical] = numero;
            mat[lin - 1][tamanhoVertical] = numero;
            mat[lin - 2][tamanhoVertical - 1] = numero;
            mat[lin - 1][tamanhoVertical - 1] = numero;
        }
    }

    private static void inicializarMatriz(int mat[][]) {
        for (int i = 0; i < 2; i++) {
            mat[0][i] = numero;
            mat[1][i] = numero;
        }
    }

    /* metodo para mostrar no terminal */
    private static void mostraMatriz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* nesse metodo eu pego a linha e coluna para saber em onde meu quadrado esta */
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

    // #endregion

    // #region Thread

    @Override
    public void run() {
        while (true) {

            update();
            repaint();
            dorme();
        }
    }

    private void dorme() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void update() {
        switch (direcao) {
            case 1:
                movimentaQuadradoDireita(mat);
                direcao = 0;
                break;
            case 2:
                movimentaQuadradoEsquerda(mat);
                direcao = 0;
                break;
            case 3:
                movimentaQuadradoBaixo(mat);
                direcao = 0;
                break;
            case 4:
                movimentaQuadradoCima(mat);
                direcao = 0;
                break;
            default:
                direcao = 0;
                break;
        }

    }

    public void propriedadesBotao() {
        // monta o botão
        btnDireita = new JButton("Direita");
        btnEsquerda = new JButton("Esquerda");
        btnCima = new JButton("Cima");
        btnBaixo = new JButton("Baixo");
        // dimensões
        btnDireita.setBounds(0, 0, 100, 20);
        btnEsquerda.setBounds(110, 0, 100, 20);
        btnCima.setBounds(220, 0, 100, 20);
        btnBaixo.setBounds(330, 0, 100, 20);
        // Adiciona o botao ao frame
        this.add(btnDireita);
        this.add(btnEsquerda);
        this.add(btnCima);
        this.add(btnBaixo);
        // Adiciona o evento ao botao
        btnDireita.addActionListener((ActionListener) this);
        btnEsquerda.addActionListener((ActionListener) this);
        btnCima.addActionListener((ActionListener) this);
        btnBaixo.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e) {
        if (btnEsquerda.getModel().isArmed())
            direcao = 1;
        if (btnDireita.getModel().isArmed())
            direcao = 2;
        if (btnBaixo.getModel().isArmed())
            direcao = 3;
        if (btnCima.getModel().isArmed())
            direcao = 4;
    }

}
