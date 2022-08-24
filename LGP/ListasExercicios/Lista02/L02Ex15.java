import java.util.Scanner;

public class L02Ex15 {
    public static void main(String[] args) {
        int horaInicio, horaFim, minutoInicio, minutofim, tempoDeJogoHora,tempoDeJogoMinuto;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a hora de inicio:");
        horaInicio = in.nextInt();
        System.out.print("Digite o minuto de inicio:");
        minutoInicio = in.nextInt();
        System.out.print("Digite a hora de fim:");
        horaFim = in.nextInt();
        System.out.print("Digite o minuto de fim:");
        minutofim = in.nextInt();
        

        if (horaFim < horaInicio){
            tempoDeJogoHora = (24 - horaInicio) + horaFim;            
        }
        else {
            tempoDeJogoHora = horaFim - horaInicio;
        }
        tempoDeJogoMinuto = minutofim-minutoInicio;

        if(minutoInicio>minutofim){
            tempoDeJogoMinuto = (60 - minutoInicio) + minutofim;
            tempoDeJogoHora --;
        }else{
            tempoDeJogoMinuto = minutofim - minutoInicio;
        }

        System.out.println("O jogo durou " + tempoDeJogoHora + " hora(s) e " + tempoDeJogoMinuto + " segundos");

    }
}
