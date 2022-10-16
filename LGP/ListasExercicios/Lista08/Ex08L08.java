package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex08L08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valores[] = new int[20];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor:");
            valores[i] = in.nextInt();
        }

        System.out.println("Digite o valor que deseja testar:");
        int valorUsuario = in.nextInt();

        int maior, menor, igual;
        maior = 0;
        menor = 0;
        igual = 0;

        for(int i = 0; i<valores.length;i++){
            if(valores[i]==valorUsuario){
                igual++;
            }else if(valores[i]<valorUsuario){
                menor++;
            }else {
                maior++;
            }
        }

        System.out.println("Dentro do vetor tem \n"
                         + maior+ " maiores que " + valorUsuario+ 
                   "\n " + menor+ " menores que " + valorUsuario+
                   "\n " + igual+ " iguais a " + valorUsuario);

    }
}
