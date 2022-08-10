import java.io.IOException;
import java.util.Scanner;

public class bee1019 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int entrada,hora,minuto,segundo;

        entrada = in.nextInt();

        hora = entrada/3600;

        if(hora > 0) entrada = entrada - hora*3600; 

        minuto = entrada/60;

        if(minuto > 0) entrada = entrada - minuto * 60;

        segundo = entrada;         

        System.out.println(hora+":"+minuto+":"+segundo);
        in.close();

    }

}
