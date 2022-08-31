import java.util.Scanner;

public class L04Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, notaOptativa, media;

        System.out.print("Digite a 1ª nota:");
        nota1 = in.nextFloat();

        System.out.print("Digite a 2ª nota:");
        nota2 = in.nextFloat();

        System.out.print("Digite a optativa:");
        notaOptativa = in.nextFloat();

        if (notaOptativa != -1f) {
            if (nota1 < nota2) {
                nota1 = notaOptativa;
            } else {
                nota2 = notaOptativa;
            }
        }

        media = (nota1 + nota2) / 2;

        if (media >= 6f) {
            System.out.println("Aprovado " + media);
        } else if (media < 3f) {
            System.out.println("Exame " + media);
        } else {
            System.out.println("Reprovado " + media);
        }

    }
}
