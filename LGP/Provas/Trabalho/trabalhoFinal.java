

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trabalhoFinal extends JFrame implements ActionListener {

    private static JButton btnExercicio2;
    private static JButton btnExercicio3;

    public static void main(String[] args) {

        btnExercicio2 = new JButton("Exercicio 2");
        btnExercicio3 = new JButton("Exercicio 3");

        JFrame frame = new JFrame("Trabalho Final Logica");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        btnExercicio2.setBounds(20, 70, 100, 20);
        btnExercicio3.setBounds(20, 150, 100, 20);

        frame.add(btnExercicio2);
        frame.add(btnExercicio3);

        btnExercicio2.setVisible(true);
        btnExercicio3.setVisible(true);

        frame.setVisible(true);
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnExercicio3.getModel().isArmed()) {
                    diagonais diagonal = new diagonais();
                    diagonal.setBounds(0, 0, 600, 600);
                    frame.add(diagonal);
                }
                if (btnExercicio2.getModel().isArmed()) {
                    quadrado quadrado = new quadrado();
                    quadrado.setBounds(0, 0, 600, 600);
                    frame.add(quadrado);
                }
            }
        };

        btnExercicio2.addActionListener(al);
        btnExercicio3.addActionListener(al);

    }

    public void actionPerformed(ActionEvent e) {

        if (btnExercicio2.getModel().isArmed()) {
            System.out.println("entrei aqui botao exercicio 2.");
            quadrado quadrado = new quadrado();
            quadrado.setBounds(0, 0, 600, 600);
            this.add(quadrado);
        }

        if (btnExercicio3.getModel().isArmed()) {
            System.out.println("entrei aqui botao exercicio 3.");
            diagonais diagonal = new diagonais();
            diagonal.setBounds(0, 0, 600, 600);
            this.add(diagonal);
        }
    }
}
