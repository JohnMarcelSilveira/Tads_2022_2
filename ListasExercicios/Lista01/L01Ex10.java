package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ingresso, rendaPagantes, rendaSocios, perca;
        int socios, pagantes, menoresIdade;

        System.out.print("Valor do ingresso: ");
        ingresso = in.nextFloat();
        System.out.print("Número de sócios que comparecem ao eventos: ");
        socios = in.nextInt();
        System.out.print("Número não pagantes (menores de 10 anos): ");
        menoresIdade = in.nextInt();
        System.out.print("Número de pagantes: ");
        pagantes = in.nextInt();

        rendaPagantes = pagantes * ingresso;
        rendaSocios = socios * (ingresso - ingresso * 0.30f);
        perca = menoresIdade * ingresso + (rendaSocios * ingresso - rendaSocios);

        System.out.printf("Público total do evento: %d \n", socios + menoresIdade + pagantes);
        System.out.printf("Renda total do evento: %.2f\n", rendaPagantes);
        System.out.printf("Renda deixa de arrecadar devido aos descontos e isenções: %.2f\n", perca);

    }
}
