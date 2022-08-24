package ListasExercicios.Lista03;

import java.util.Scanner;

public class L03Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeA,timeB;
        int golsTimeA,golsTimeB;

        System.out.println("Qual o nome do 1º time?");
        timeA = in.next();
        System.out.println("Qual o nome do 2º time?");
        timeB = in.next();

        System.out.println("Qual o placar do jogo (" +timeA+ " x "+timeB +")");
        golsTimeA = in.nextInt();
        golsTimeB = in.nextInt();

        if(golsTimeA == golsTimeB){
            System.out.println("Empate!");
        }else if(golsTimeA>golsTimeB){
            System.out.println(timeA +" venceu!");
        }else{
            System.out.println(timeB +" venceu!");
        }

    }
    
}
