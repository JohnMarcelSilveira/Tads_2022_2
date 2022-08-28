import java.util.Scanner;

public class L04Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,numeroOriginal;
        boolean primo = true;

        System.out.print("Digite um número inteiro positivo: ");
        numero = numeroOriginal = in.nextInt();        
        while(numero>1){
            numero--;
            if(numeroOriginal%numero == 0 && numero != 1){
                primo = false;
            }           
        }
        if(primo){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }
    }
}
