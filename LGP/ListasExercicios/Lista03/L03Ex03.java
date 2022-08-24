package ListasExercicios.Lista03;

import java.util.Scanner;

public class L03Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valorA,valorB,valorC, maiorValor1, maiorValor2;

        System.out.println("Digite 3 valores:");

        valorA = in.nextInt();
        valorB = in.nextInt();
        valorC = in.nextInt();

        if(valorA>valorB){
            maiorValor1 = valorA;
        }else{
            maiorValor1 = valorB;
        }

        if(maiorValor1 < valorC){
            maiorValor2 = valorC;
        }else{
            
        }

    
    }
}
