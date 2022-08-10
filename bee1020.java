import java.io.IOException;
import java.util.Scanner;

public class bee1020 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int entrada, dia, mes, ano;

        entrada = in.nextInt();

        ano = entrada/365;
        entrada = entrada - ano * 365;
        mes = entrada/30;
        dia = entrada%30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        in.close();

    }

}
