package ListasExercicios.Lista02;

import java.text.NumberFormat;
import java.util.Scanner;

public class L02Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valorHora, salario, horasTrabalhadas, imposto;

        System.out.println("Qual o valor da sua hora trabalhada?");
        valorHora = in.nextFloat();
        System.out.println("Quantas horas você trabalhou?");
        horasTrabalhadas = in.nextFloat();
        System.out.println("Quanto você paga de imposto?");
        imposto = in.nextFloat();

        salario = horasTrabalhadas * valorHora;

        NumberFormat formatador = NumberFormat.getCurrencyInstance();

        String salarioFormatado = formatador.format(salario);
        String salatioLiquidoFormatado = formatador.format(salario - salario * 0.15);

        System.out.println("Salário bruto " + salarioFormatado);
        System.out.println("Salário líquido (com desconto) " + salatioLiquidoFormatado);

        // perguntar ao Vini se devo calcular o desconto em 15% como diz na lista ou
        // utilizar o quanto o usuário digitar

    }

}
