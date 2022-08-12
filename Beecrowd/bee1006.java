//PROBLEMA: 1006 - Média 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee1006 {

    public static void main(String[] args) throws IOException {

        Double A, B, C, media;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());

        media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

    }

}