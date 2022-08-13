package ListasExercicios.Lista02;

import java.util.Calendar;
import java.util.Scanner;

public class L02Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] dataNascimentoSplit;
        //String dataNascimento,dia,mes,ano;
        int dataNascimento,dia,mes,ano;
        

        System.out.print("Digite o dia de nascimento:");
        dia = in.nextInt();
        System.out.print("Digite o mês de nascimento:");
        mes = in.nextInt();
        System.out.print("Digite o ano de nascimento:");       
        ano = in.nextInt();

        Calendar calendario = Calendar.getInstance();
        Calendar dataUsuario = Calendar.getInstance();
        dataUsuario.set(ano, Calendar.MONTH,dia);

        dataNascimento =  dataUsuario.compareTo(calendario);

        System.out.println(dataNascimento);
    }
}
