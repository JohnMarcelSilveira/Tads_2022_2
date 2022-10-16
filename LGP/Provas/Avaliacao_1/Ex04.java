package Provas.Avaliacao_1;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int interacoes,contador;
        double valorDePi,denominador,denominadorFinal;

        boolean a;

        a = Par(2);

        contador =  0;
        denominador = 1;  
        valorDePi  = denominadorFinal = 0f;       

        System.out.println("Quantas interações serão feitas?");
        interacoes = in.nextInt();

       /*  while(contador<(interacoes-1)){
            contador++;
            if(contador == 1){
                denominadorFinal = -2f;
                denominador = 3f;
            }            
            if(contador%2==0){                
                denominadorFinal +=denominador;
            }else if(contador > 1){                
                denominadorFinal += -1f*denominador;
            }
            denominador +=2;
        }
        */

        while(contador<(interacoes-1)){
            contador++;
            if(contador == 1){
                denominadorFinal = denominador * (denominador+2);
                valorDePi += (denominador + denominadorFinal) / (denominador * denominadorFinal);
                denominador = 3f;

            }            
            if(contador%2==0){                
                denominadorFinal +=denominador;
                valorDePi += (denominador + denominadorFinal) / (denominador * denominadorFinal);valorDePi = denominador + denominadorFinal / denominador * denominadorFinal;
            }else if(contador > 1){                
                denominadorFinal += -1f*denominador;
                valorDePi += (denominador + denominadorFinal) / (denominador * denominadorFinal);valorDePi = denominador + denominadorFinal / denominador * denominadorFinal;
            }
            denominador +=2;
            
        }

        valorDePi = 4f*(valorDePi);

        System.out.println("O valor de Pi deveria ser " + valorDePi + " mas infelizmentes dessa vez não deu!");
    }



    private static boolean Par(int numeroA) {
        boolean par;

        par = numeroA%2==0;

        return par;
        
    }

}


