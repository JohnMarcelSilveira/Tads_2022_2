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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex03 extends JFrame implements ActionListener {

    private static JButton btnExercicio2;
    private static JButton btnExercicio3;

    public ex03() {

        btnExercicio2.setBounds(0, 0, 20, 20);
        btnExercicio3.setBounds(30, 30, 20, 20);

        this.add(btnExercicio2);
        this.add(btnExercicio3);

        btnExercicio2.setVisible(true);
        btnExercicio3.setVisible(true);
    }

    public static void main(String[] args) {

        btnExercicio2 = new JButton("Exercicio 2");
        btnExercicio3 = new JButton("Exercicio 3");

        JFrame frame = new JFrame("Exercicio 3 Logica");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnExercicio3.getModel().isArmed()) {
                    System.out.println("entrei aqui para iniciar o diagonal.");
                    diagonais diagonal = new diagonais();
                    diagonal.setBounds(0, 0, 600, 600);
                    frame.add(diagonal);
                }
            }
        };

        // btnExercicio3.addActionListener(al);
        // btnExercicio3.addActionListener(al);

        quadrado quadrado = new quadrado();
        quadrado.setBounds(0, 0, 600, 600);
        frame.add(quadrado);

        /*
         * diagonais diagonal = new diagonais();
         * diagonal.setBounds(0, 0, 600, 600);
         * frame.add(diagonal);
         */

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * if (btnExercicio3.getModel().isArmed()) {
         * System.out.println("entrei aqui.");
         * diagonais diagonal = new diagonais();
         * diagonal.setBounds(0, 0, 600, 600);
         * this.add(diagonal);
         * }
         */
    }

}
