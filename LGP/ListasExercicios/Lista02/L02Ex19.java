import java.util.Scanner;

public class L02Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimento,altura,largura,dimensao1,dimensao2,caixa;

        System.out.println("Digite as dimensões (comprimento, largura e altura):");
        comprimento = in.nextFloat();
        altura = in.nextFloat();
        largura = in.nextFloat();

        dimensao1 = comprimento*altura;
        dimensao2 =comprimento+largura;

        caixa = dimensao1/1.5f + dimensao2/1.5f;

        System.out.printf("Vamos precisar de %.0f caixas de azulejos",caixa);


    }
}
