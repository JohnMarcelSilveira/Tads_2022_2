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

public class ex03 extends JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercicio 3 Logica");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);        
       
        diagonais diagonal = new diagonais();
        diagonal.setBounds(0, 0, 600, 600);
        frame.add(diagonal);

    }
}
