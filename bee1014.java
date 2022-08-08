import java.io.IOException;
import java.util.Scanner;

public class bee1014 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int a;
        double b,c;

        a = Integer.parseInt(in.nextLine());
        b = Double.parseDouble(in.nextLine());
        c = a / b;

        System.out.printf("%.3f km/l\n", c);
        in.close();

    }

}
