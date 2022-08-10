import java.io.IOException;
import java.util.Scanner;

public class bee1019 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int entrada,hora,minuto,segundo;

        entrada = in.nextInt();

        hora = entrada/3600;

        minuto = entrada/60;

        segundo = entrada%60;         

        System.out.println(hora+":"+minuto+":"+segundo);
        in.close();

    }

}
