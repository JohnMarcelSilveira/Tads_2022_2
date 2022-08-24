package ListasExercicios.Lista03;

import java.util.Scanner;

public class L03Ex07 {
    public static void main(String[] args) {
        
        final float ALCOOL = 3.9f;
        final float GASOLINA = 4.3f;

        float litrosVendidos,valorPago=0f;
        String tipoDeCombustivel;
        boolean continua =  false;

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos litros foram abastecido?");
        litrosVendidos = in.nextFloat();
        System.out.println("Qual o tipo de combustível? A - álcool G - gasolina");
        tipoDeCombustivel = in.next();        

        if(tipoDeCombustivel.toUpperCase().equals("G")){
            valorPago = litrosVendidos * GASOLINA;  
            if(litrosVendidos<= 20){
                valorPago -= valorPago*0.03f;
            }else{
                valorPago -= valorPago*0.05f;
            }
            continua = true;
        }else if(tipoDeCombustivel.toUpperCase().equals("A")){
            valorPago = litrosVendidos * ALCOOL;
            if(litrosVendidos<= 20){
                valorPago -= valorPago*0.04f;
            }else{
                valorPago -= valorPago*0.06f;
            }
            continua = true;
        }else {
            System.out.println("Você digitou um valor errado, digite A para álcool e G para gasolina");
        }

        if(continua){
            System.out.printf("Valor total pago: R$%.2f\n",valorPago);
        }

    }
}
