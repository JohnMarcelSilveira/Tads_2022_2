import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee2006 {

    public static void main(String[] args) throws IOException {

        int contador, entrada, temporario;
        String linha;
        String[] chas;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        entrada = Integer.parseInt(in.readLine());
        linha = in.readLine();
        chas = linha.split(" ");
        contador = 0;

        for (int i = 0; i < chas.length; i++) {
            temporario = Integer.parseInt(chas[i]);
            if (temporario == entrada) {
                if (contador == 0) {
                    contador = 1;
                } else {
                    contador++;
                }
            }
        }

        System.out.println(contador);

        in.close();
    }

}
