import java.util.Scanner;

public class L04Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, media, menor;
        System.out.print("Digite a 1ª nota:");
        nota1 = in.nextFloat();
        System.out.print("Digite a 2ª nota:");
        nota2 = in.nextFloat();
        System.out.print("Digite a 3ª nota:");
        nota3 = in.nextFloat();

        if (nota1 < nota2) {
            menor = nota1;
        } else {
            menor = nota2;
        }
        if (nota3 < menor) {
            menor = nota3;
        }

        media = ((nota1 + nota2 + nota3) - menor) / 2f;
        System.out.println(media);

    }
}
