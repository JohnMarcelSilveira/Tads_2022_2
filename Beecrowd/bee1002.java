import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Double area, raio;
        Double n = 3.14159;

        raio = Double.parseDouble(in.readLine());

        area = n * (raio * raio);

        System.out.printf("A=%.4f\n", area);

    }

}
