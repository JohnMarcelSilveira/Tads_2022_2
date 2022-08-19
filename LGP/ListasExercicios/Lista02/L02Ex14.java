import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class L02Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ano, anoAtual;

        System.out.println("Em que ano você nasceu?");
        ano = in.nextInt();

        Calendar data = Calendar.getInstance();

        anoAtual = data.get(Calendar.YEAR);

        if (anoAtual - ano >= 18)
            System.out.println("Você deve votar!");
        else if (anoAtual - ano >= 16)
            System.out.println("Você pode votar!");
        else
            System.out.println("Você não pode votar!");

    }

}
