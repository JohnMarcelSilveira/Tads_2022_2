package Provas.Avaliacao_1;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,pares,impares,multiplosDe3,maior,menor,contador;
        contador = maior = menor = numero = pares = impares = multiplosDe3 = 0; //inicializei as variaveis para poder utilizar nas condições a seguir

        while(contador<20){  
            contador++;
            System.out.print("Digite o "+ contador+"º número:");
            numero = in.nextInt();
            
            while(numero < 0){   
                     System.out.printf("Opss você digitou um número fora das regras! \nDigite um número maior ou igual a zero:");
                     numero = in.nextInt();                     
                }
            

            if(numero%2==0){
                pares++;
            }else{
                impares++;
            }

            if(numero%3 == 0){
                multiplosDe3++;
            }

            if(contador == 1){ //esse teste serve para colocar o primeiro número digitado como o menor já que a variavel menor esta inicializada em zero.
                menor = numero;
            }

            if(numero>maior){
                maior = numero;
            }else if(numero<menor){
                menor = numero;
            } 
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Multiplos de 3: " + multiplosDe3);
        
    }
}
