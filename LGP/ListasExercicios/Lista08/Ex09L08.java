package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex09L08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean segredo[] = {false, false,false,false,false};
        int valores[] = {1,2,3,4,5};
        boolean acertouTodos = false;

        while(!acertouTodos){
            System.out.println("Digite um valor");
            int valorDigitado = in.nextInt();

            //testa se o valor esta dentro do segredo
            for(int i = 0; i<valores.length;i++){
                if(valorDigitado == valores[i])
                    segredo[i] = true;
            }

            //testar se todos os valores já foram acertados
            for(int i = 0; i<segredo.length;i++){
                acertouTodos = segredo[i];
                if(!acertouTodos)
                    break;
            }
            
        }
    }
}
