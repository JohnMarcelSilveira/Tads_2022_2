
/*Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite
um nome qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver
armazenado no vetor C ou “NÃO ACHEI” caso contrário. Repita o comportamento
até que o usuário digite a palavra FIM. */

import java.util.Scanner;

public class ex03 {

    public static Scanner in = new Scanner(System.in);

    static String[] PreencheVetor(int tamanho) {
        String[] vetorPreenchido = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa.");
            vetorPreenchido[i] = in.next();
        }

        return vetorPreenchido;
    }

    public static void main(String[] args) {

        int tamanho = 10;
        String[] pessoas = new String[tamanho];
        String nome = "";
        // Scanner in = new Scanner(System.in);
        Boolean achei = false;

        pessoas = PreencheVetor(tamanho);

        do {
            System.out.println("Digite o nome de uma pessoa que deseja procurar ou FIM para sair: ");
            nome = in.next();
            if (!nome.equals("FIM")) {
                for (int index = 0; index < pessoas.length; index++) {
                    if (pessoas[index].equals(nome)) {
                        achei = true;
                        break;
                    }
                }
                if (achei) {
                    System.out.println("ACHEI");
                } else {
                    System.out.println("NÃO ACHEI");
                }
                System.out.println("Vamos repetir!");
            }
        } while (!nome.equals("FIM"));

        System.out.println("Encerrando o programa, volte sempre!");

    }
}