import java.util.Scanner;

public class L02Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Digite as duas notas do aluno (exemplo de nota 7.9):");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.printf("A media do aluno foi %.2f \n", media);

        if (media >= 6)
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno reprovado!");

    }
}
