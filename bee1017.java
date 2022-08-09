import java.io.IOException;
import java.util.Scanner;

public class bee1017 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int dinheiroRecebido, dinheiroRecebidotemp, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        nota100 = nota50 = nota20 = nota10 = nota5 = nota2 = nota1 = 0;

        dinheiroRecebido = dinheiroRecebidotemp = in.nextInt();

        if (dinheiroRecebidotemp >= 100) {
            nota100 = dinheiroRecebidotemp / 100;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota100 * 100;
        }
        if (dinheiroRecebidotemp >= 50) {
            nota50 = dinheiroRecebidotemp / 50;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota50 * 50;
        }
        if (dinheiroRecebidotemp >= 20) {
            nota20 = dinheiroRecebidotemp / 20;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota20 * 20;
        }
        if (dinheiroRecebidotemp >= 10) {
            nota10 = dinheiroRecebidotemp / 10;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota10 * 10;
        }
        if (dinheiroRecebidotemp >= 5) {
            nota5 = dinheiroRecebidotemp / 5;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota5 * 5;
        }
        if (dinheiroRecebidotemp >= 2) {
            nota2 = dinheiroRecebidotemp / 2;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota2 * 2;
        } else {
            nota1 = dinheiroRecebidotemp / 1;
            dinheiroRecebidotemp = dinheiroRecebidotemp - nota1 * 1;
        }

        System.out.println(dinheiroRecebido);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
        in.close();

    }

}
