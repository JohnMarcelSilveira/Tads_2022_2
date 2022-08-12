package ListasExercicios.Lista01;

import java.io.IOException;
import java.util.Scanner;

public class L01Ex02 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        float numero;

        System.out.println("Informe um número:");

        numero = in.nextFloat();

        System.out.printf("20%% sobre %.2f é %.2f", numero, (numero * 1.20));

        in.close();

    }

}
