package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex04 {

    public static void main(String[] args) {
        float base, altura, area;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a base:");
        base = in.nextFloat();
        System.out.println("Informe a altura:");
        altura = in.nextFloat();
        area = (base *altura)/2;
        System.out.printf("A area do triangulo é: %.2f", area);

    }

}
