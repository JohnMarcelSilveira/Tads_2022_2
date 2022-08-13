package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.print("Qual a sua idade? ");
        idade = in.nextInt();

        if(idade >= 18) System.out.println("Você é adulto!");
        else if (idade >= 14) System.out.println("Você é juvenil!");
        else if (idade >= 9) System.out.println("Você é infantil!");
        else System.out.println("Você é mirim!");

    }
}
