import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee1007 {

    public static void main(String[] args) throws IOException {

        int A, B, C, D, dif;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        D = Integer.parseInt(in.readLine());

        dif = (A * B - C * D);

        System.out.printf("DIFERENCA = %d\n", dif);

    }

}