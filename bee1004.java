import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee1004 {

    public static void main(String[] args) throws IOException {

        int A, B, PROD;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        A = Integer.parseInt(reader.readLine());
        B = Integer.parseInt(reader.readLine());

        PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);

    }

}