package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex07 {
    public static void main(String[] args) {
        float distancia,velocidadeMedia, hora, minutos;
        //float distancia,velocidadeMedia;

        Scanner in = new Scanner(System.in);

        System.out.print("Qual a distancia em KM?");
        distancia = in.nextFloat();
        System.out.print("Qual a velociade média em KM/h?");
        velocidadeMedia = in.nextFloat();

        hora = distancia/velocidadeMedia;
        minutos = distancia%velocidadeMedia;

        System.out.printf("Sua viagem vai levar aproximadamente %.0f horas e %.0f minutos", hora,minutos);

    }
}
