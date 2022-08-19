import java.math.RoundingMode;
import java.text.DecimalFormat;

public class aula6 {
    public static void main(String[] args) {
        double numero = 3.784847;

        // existe uma classe no java responsavel por formatação numerica
        // nome dessa classe é DecimalFormat

        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("Numero: " + df.format(numero));
    }
}
