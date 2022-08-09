import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class bee1015 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Double x1, y1, x2, y2, distancia;
        String linha1, linha2;
        String[] linhaSplit1, linhaSplit2;

        linha1 = in.nextLine();
        linha2 = in.nextLine();

        linhaSplit1 = linha1.split(" ");
        linhaSplit2 = linha2.split(" ");

        x1 = Double.parseDouble(linhaSplit1[0]);
        y1 = Double.parseDouble(linhaSplit1[1]);
        x2 = Double.parseDouble(linhaSplit2[0]);
        y2 = Double.parseDouble(linhaSplit2[1]);

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);
        in.close();

    }

}
