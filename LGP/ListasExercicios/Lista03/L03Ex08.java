package ListasExercicios.Lista03;

import java.util.Scanner;

public class L03Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int codigo, codigoCorreto, senha,senhaCorreta;
        codigoCorreto = 1234;
        senhaCorreta = 9999;

        System.out.print("usuario:");
        codigo = in.nextInt();

        if(codigo==codigoCorreto){
            System.out.print("senha:");
            senha = in.nextInt();
            if(senha==senhaCorreta){
                System.out.println("senha correta");
            }else{
                System.out.println("senha invalida");
            }
        }else{
            System.out.println("usuario invalido");
        }

        
    }
}
