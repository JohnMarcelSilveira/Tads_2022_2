import java.io.IOException;
import java.util.Scanner;

public class bee1016 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int horasDeViagem,kmPorH;
        Double combustivelGasto;

        horasDeViagem = in.nextInt();
        kmPorH = in.nextInt();

        combustivelGasto = horasDeViagem*kmPorH/12d;

        System.out.printf("%.3f\n", combustivelGasto);
        in.close();

    }

}
