package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex01L08 {
    public static void main(String[] args) {
        int lista[], tamanho;
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        tamanho = in.nextInt();

        lista = new int[tamanho];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            lista[i] = in.nextInt();
        }

        for (int i = lista.length-1; i >= 0; i--) {
            System.out.print(lista[i] + " ");
        }
    }
}
