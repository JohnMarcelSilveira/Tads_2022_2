import java.util.Scanner;

public class L02Ex15 {
    public static void main(String[] args) {
        int horaInicio, horaFim, tempoDeJogo;

        tempoDeJogo = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a hora de inicio e a hora fim:");

        horaInicio = in.nextInt();
        horaFim = in.nextInt();

        if (horaFim < horaInicio)
            tempoDeJogo = 24 + (horaInicio - horaFim);
        else
            tempoDeJogo = horaFim - horaInicio;

        System.out.println("O jogo durou " + tempoDeJogo + "hora(s)");

    }
}
