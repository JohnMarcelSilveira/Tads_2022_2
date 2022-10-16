package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex07L08 {

    static int totalDeVotosValidos, totalDeVotos;

    static void votoRegistrado() {
        System.out.println("Voto Registrado!");
    }

    static int[] inicializarUrna(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        totalDeVotosValidos = 0;
        totalDeVotos = 0;
        return v;
    }

    static int verificarVencendor(int v[]) {
        int maisVotado = -1;
        int quantidadeDeVotos = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > quantidadeDeVotos) {
                maisVotado = i;
                quantidadeDeVotos = v[i];
            }
        }
        return maisVotado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomes[] = { "Candidato 1", "Candidato 2", "Candidato 3", "Candidato 4", "Candidato 5" };
        int candidatos[], voto;
        candidatos = new int[5];

        inicializarUrna(candidatos);

        do {
            System.out.println("Urna aguardando voto \n Digite o número do seu candidato");
            voto = in.nextInt();
            switch (voto) {
                case 1:
                    candidatos[0]++;
                    votoRegistrado();
                    totalDeVotosValidos++;
                    break;
                case 2:
                    candidatos[1]++;
                    votoRegistrado();
                    totalDeVotosValidos++;
                    break;
                case 3:
                    candidatos[2]++;
                    votoRegistrado();
                    totalDeVotosValidos++;
                    break;
                case 4:
                    candidatos[3]++;
                    votoRegistrado();
                    totalDeVotosValidos++;
                    break;
                case 5:
                    candidatos[4] = candidatos[4]++;
                    votoRegistrado();
                    totalDeVotosValidos++;
                    break;
                default:
                    votoRegistrado();
            }
            totalDeVotos++;
        } while (voto != -1);

        System.out.println("Votação encerrada, computando votos");

        int maisVotado = verificarVencendor(candidatos);

        System.out.println("Foram registrados " + totalDeVotos + " votos e " + totalDeVotosValidos + " votos válidos");

        System.out.println(
                "O candidato " + nomes[maisVotado] + " foi o vencedor com " + candidatos[maisVotado] + " votos");

    }
}
