import java.util.Scanner;

public class L04Ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lado,contador,contador2;
        String parte;

        System.out.println("Digite o tamanho do lado do quadrado:");
        lado = in.nextInt();

        contador = 0;
        contador2 = 0;
        parte = "";

        while(contador<lado){
            parte +="*";
            contador++;
        }

        while(contador2<lado){
            System.out.println(parte);
            contador2++;        
        }        
    }
}
