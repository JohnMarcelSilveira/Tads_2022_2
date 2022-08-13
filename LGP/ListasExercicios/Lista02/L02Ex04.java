package ListasExercicios.Lista02;

import java.util.Scanner;

public class L02Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;

        System.out.print("Digite um valor:");
        a = in.nextInt();
        System.out.print("Digite outro valor:");
        b = in.nextInt();

        if(a>b) System.out.println(a+" é maior");
        else System.out.println(b+" é maior ");

    }
}
