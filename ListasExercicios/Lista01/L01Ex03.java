package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex03 {

    public static void main(String[] args) {
        int numero, quadrado;

        Scanner in = new Scanner(System.in);

        numero = in.nextInt();

        quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + quadrado);

    }

}
