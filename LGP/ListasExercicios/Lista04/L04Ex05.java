import java.util.Scanner;

public class L04Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, media;

        int cont = 0;
        nota=0f;
        media=0f;

        while (cont < 5) {
            cont++;
            System.out.print("Digite a " + cont + "ª nota:");
            nota += in.nextFloat();            
        }
        media = nota/cont;
        System.out.printf("A média desse aluno é: %.2f",media);
    }
}