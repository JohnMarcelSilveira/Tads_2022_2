import java.util.Scanner;

public class L04Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor,resto;

        resto =1;

        while(resto!=0){
            System.out.print("Digite um número inteiro:");
            valor = in.nextInt();
            resto = valor%5;
        }
    }
}
