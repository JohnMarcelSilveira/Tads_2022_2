package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.print("Digite um valor inteiro: ");
        valor = in.nextInt();
        if(valor > 0) System.out.println("Positivo");
        else System.out.println("Negativo");
    }
}
