package ListasExercicios.Lista02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class L02Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base,altura,area,perimetro;

        System.out.print("Digite a base:");
        base = in.nextInt();
        System.out.print("Digite a altura:");
        altura = in.nextInt();

        area = base*altura;
        perimetro = base*2 + altura *2;

        System.out.println("A area do retângulo é " + area + "\nE o perímetro é "+ perimetro);

    }
}
