package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex08 {
    public static void main(String[] args) {

        float percVotosValidos, percVotosBrancos, percVotosNulos, eleitoresTotal, votosValidos, votosBrancos,
                votosNulos;

        Scanner in = new Scanner(System.in);

        System.out.print("Número total de eleitores:");
        eleitoresTotal = in.nextFloat();
        System.out.print("Número votos válidos:");
        votosValidos = in.nextFloat();
        System.out.print("Número votos em branco:");
        votosBrancos = in.nextFloat();
        System.out.print("Número votos nulos:");
        votosNulos = in.nextFloat();

        percVotosValidos = (votosValidos / eleitoresTotal) * 100;
        percVotosBrancos = (votosBrancos / eleitoresTotal) * 100;
        percVotosNulos = (votosNulos / eleitoresTotal) * 100;

        System.out.printf("Percentual de votos válidos %.2f%%\n", percVotosValidos);
        System.out.printf("Percentual de votos em branco %.2f%% \n", percVotosBrancos);
        System.out.printf("Percentual de votos nulos %.2f%% \n", percVotosNulos);

    }
}
