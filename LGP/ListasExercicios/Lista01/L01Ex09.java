package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex09 {
    public static void main(String[] args) {
        int homens,mulheres,criancas;
        float carne;
        final int  CONSUMO_GR_HOMEM = 400;
        final int  CONSUMO_GR_MULHER = 320;
        final int  CONSUMO_GR_CRIANCA = 200;

        Scanner in = new Scanner(System.in);
        
        System.out.print("Quantos homens vamos convidar?");
        homens = in.nextInt();
        System.out.print("Quantas mulheres vamos convidar?");
        mulheres = in.nextInt();
        System.out.print("Quantas crianças vamos convidar?");
        criancas = in.nextInt();

        carne = (homens*CONSUMO_GR_HOMEM + mulheres*CONSUMO_GR_MULHER + criancas*CONSUMO_GR_CRIANCA);

        System.out.printf("Prepara o bolso pq precisamos comprar no minimo %1.0fKg de carne e pra nossa segurança abre mais essa mão de vaga e mete logo %.0fKg", carne, carne*1.2);

    }
}
