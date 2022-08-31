package LGP.ListasExercicios.Lista04;

import java.util.Scanner;

public class L04Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float saldo, saque, deposito;
        char opcao;

        final char CONSULTA_SALDO = 'a';
        final char SAQUE = 'b';
        final char DEPOSITO = 'c';
        final char SAIR = 'd';

        saldo = 0f;
        opcao = 'a';

        while (opcao != 'd'){
            System.out.println("\nDigite um opção\n(a) consulta saldo\n(b) saque\n(c) depósito\n(d) sair");
            opcao = in.next().charAt(0);
            if(opcao == 'a') {
                
                    System.out.printf("Seu saldo é R$%.2f\n", saldo);
                    
                }
            else if(opcao == 'b'){                
                    System.out.println("Quanto você quer sacar?");
                    saque = in.nextFloat();
                    if (saldo - saque < 0) {
                        System.out.println("Você não tem saldo para fazer esse saque");
                    } else {
                        saldo -= saque;
                    }
                    
                }
            else if(opcao == 'c'){
                    System.out.println("Quanto você quer depositar?");
                    saldo += in.nextFloat();                    
                }
                else{
                    System.out.println("Digite uma opção válida");
                }
            } 
        }

        /*
         * do{
         * System.out.
         * println("\nDigite um opção\n(a) consulta saldo\n(b) saque\n(c) depósito\n(d) sair"
         * );
         * opcao = in.next().charAt(0);
         * switch(opcao){
         * case 'a': {
         * System.out.printf("Seu saldo é R$%.2f\n",saldo);
         * break;
         * }
         * case 'b': {
         * System.out.println("Quanto você quer sacar?");
         * saque = in.nextFloat();
         * if(saldo-saque<0){
         * System.out.println("Você não tem saldo para fazer esse saque");
         * }else{
         * saldo -= saque;
         * }
         * break;
         * }
         * case 'c':{
         * System.out.println("Quanto você quer depositar?");
         * saldo += in.nextFloat();
         * break;
         * }
         * }
         * }while(opcao!='d');
         */
    }
}
