package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int centimetro;
        float metro;
        System.out.print("Digite um valor em centímetro:");
        centimetro = in.nextInt();

        metro = (float) centimetro /100f;

        System.out.printf("%dcm equivale à %.2fm\n", centimetro,metro);
    }
}
