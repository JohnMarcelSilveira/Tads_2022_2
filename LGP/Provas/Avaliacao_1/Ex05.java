package Provas.Avaliacao_1;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        
        int numero,resto,numerosReaisPositivos,divisor;

        numerosReaisPositivos = 0;

        System.out.print("Digite o número a ser decomposto:");
        numero = in.nextInt();

        while(numero>=1){
            resto = divisor = 1;
            while(resto!=0){
                numerosReaisPositivos++;
                if(numerosReaisPositivos>1){
                    resto = numero%numerosReaisPositivos; 
                    divisor = numerosReaisPositivos;
                }              
            }
            numerosReaisPositivos = 0;
            System.out.println(divisor);
            numero = numero/divisor;
        }
        
    }
}
