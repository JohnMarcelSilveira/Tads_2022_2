package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b;

        System.out.print("Digite um valor:");
        a = in.nextFloat();
        System.out.print("Digite outro valor:");
        b = in.nextFloat();

        if(b>0) System.out.printf("Resultado = %.3f\n", a/b);
        else System.out.println("Erro de divisão por zero!");
        

    }
}
