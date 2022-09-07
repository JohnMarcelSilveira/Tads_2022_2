import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor,contador,divisivelPor3,divisivelPor5,divisivelPor3e5;

        contador = divisivelPor3 = divisivelPor5 = divisivelPor3e5 = 0;

        while(contador<100){
            contador++;
            System.out.print("Digite o " +contador+"º valor:");
            valor = in.nextInt();
            if(valor%3==0 && valor>1){
                divisivelPor3++;
            }
            if(valor%5==0 && valor>1){
                divisivelPor5++;
            }
            if(valor%3==0 && valor%5==0 && valor>1){
                divisivelPor3e5++;
            }
        }

        System.out.print("Divisivel por 3:" +divisivelPor3+ "\n");
        System.out.print("Divisivel por 5:" +divisivelPor5+ "\n");
        System.out.print("Divisivel por 3 e 5:" +divisivelPor3e5+ "\n");
    }
}
