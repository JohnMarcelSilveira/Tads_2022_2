package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex05 {

    public static void main(String[] args) {
        float temperaturaC, temperaturaF;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit:");
        temperaturaF = in.nextFloat();
        System.out.println("");
        temperaturaC = (temperaturaF - 32) * 5 / 9;

        System.out.printf("A temperatura em Celsius é: %.1f", temperaturaC);

    }

}
