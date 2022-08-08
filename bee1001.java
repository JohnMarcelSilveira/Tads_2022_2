import java.io.IOException;
import java.util.Scanner;

public class bee1001 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = a + b;

        System.out.println("X = " + c);
        in.close();

    }

}
