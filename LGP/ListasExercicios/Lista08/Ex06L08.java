package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex06L08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = in.next();

        int tamanho = palavra.length();

        String letras[] = new String[tamanho];

        System.out.println("Agora digite letra por letra da mesma palavra.");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite uma letra");
            letras[i] = in.next();
        }

        System.out.println("E a palavra digitada ficou assim:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(letras[i]);
        }
    }
}
