package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex04L08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valores[] = new int[10];

        for(int i = 0;i<10;i++){
            System.out.println("Digite o " + (i+1)+"º valor:");
            valores[i] = in.nextInt();
        }
        
    }
}
