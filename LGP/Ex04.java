import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int interacoes,contador;
        double valorDePi,denominador,denominadorFinal;

        contador =  0;
        denominador = 1;  
        valorDePi  = denominadorFinal = 0f;       

        System.out.println("Quantas interações serão feitas?");
        interacoes = in.nextInt();

        while(contador<(interacoes-1)){
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

        valorDePi = 4f*(1f/denominadorFinal);

        System.out.println("O valor de Pi deveria ser " + valorDePi + " mas infelizmentes dessa vez não deu!");
    }
}
