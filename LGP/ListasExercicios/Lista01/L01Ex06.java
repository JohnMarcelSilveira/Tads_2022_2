package ListasExercicios.Lista01;

import java.util.Scanner;

public class L01Ex06 {

    public static void main(String[] args) {
        float nota1,nota2,media;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a 1ª nota do aluno:");
        nota1 = in.nextFloat();
        System.out.print("Digite a 2ª nota do aluno:");
        nota2 = in.nextFloat();

        media = (nota1+nota2)/2;

        System.out.printf("A média do aluno é: %.2f", media);

    }
    
}
