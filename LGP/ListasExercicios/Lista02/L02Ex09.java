package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float raio, diametro, comprimento, area;
        final float PI = 3.141692f;

        System.out.print("Digite o raio:");
        raio = in.nextFloat();

        diametro = 2 * PI * raio;
        comprimento = PI * diametro;
        area = PI * (raio * raio);

        System.out.printf("O diâmentro é %.2f\n", diametro);
        System.out.printf("O comprimento é %.2f cm\n", comprimento);
        System.out.printf("A área é %.2f cm²", area);

    }
}
