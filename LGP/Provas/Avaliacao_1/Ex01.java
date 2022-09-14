package Provas.Avaliacao_1;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float AREA_DA_CAIXA = 1.5F;

        float altura,largura,comprimento,caixasDeAzulejo,areaDaCozinha,parede1,parede2;

        System.out.print("Qual a altura das paredes? ");
        altura = in.nextFloat();

        System.out.print("Qual a largura da cozinha? ");
        largura = in.nextFloat();

        System.out.print("Qual o comprimento da cozinha? ");
        comprimento = in.nextFloat();

        //parede1 = 2 * altura * comprimento;
        //parede2 = 2 * altura * largura;

        //areaDaCozinha = parede1 * parede2;

        areaDaCozinha = altura * largura * comprimento;

        caixasDeAzulejo = areaDaCozinha / AREA_DA_CAIXA;

        System.out.printf("%.0f " ,caixasDeAzulejo);
    }
}
