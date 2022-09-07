import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,divisor,contador,somaDivisores,perfeito;

        contador = perfeito = numero = 0;

        while(contador<1000){
            contador++;            
            numero = divisor = contador;
            somaDivisores = 0;          
            while(divisor> 0){  
                divisor--;  
                if(divisor > 0)   {         
                    if(numero % divisor == 0){
                        somaDivisores = somaDivisores + divisor;
                     }
                 }
            }
            if(somaDivisores == numero){
                perfeito++; 
            }
        }

        System.out.println(perfeito);
    }
}
