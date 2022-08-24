package ListasExercicios.Lista03;

import java.util.Scanner;

public class L03Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valorA,valorB,valorC;

        System.out.println("Digite os valores dos lados:");

        valorA = in.nextInt();
        valorB = in.nextInt();
        valorC = in.nextInt();

        if(valorA < valorB+valorC &&  valorB < valorA+valorC && valorC < valorB+valorA){
            System.out.println("É um triangulo");
        }else{
            System.out.println("Não é um trinagulo");
        }
    
    }
}
