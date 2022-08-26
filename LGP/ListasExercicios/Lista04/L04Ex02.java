package LGP.ListasExercicios.Lista04;

import java.util.Scanner;

public class L04Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,soma;
        soma = 0;

        System.out.println("um numero");
        numero = in.nextInt();

        for(int i = 0; i<=numero;i++){
            if(i%2==0){
            soma += i;
            }
        }

        System.out.println("A soma é: "+ soma);
    }
}
