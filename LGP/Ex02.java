import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lado;
        float medidaDoLado,perimetro;

        System.out.print("Digite a quantidade de lados do polígono: ");
        lado = in.nextInt();
        
        System.out.print("Digite a medida do lado(cm):");
        medidaDoLado = in.nextInt();

        if(lado==3){
            System.out.println("TRIÂNGULO");
            perimetro = medidaDoLado *3f;
            System.out.printf("E seu perímetro é: %.2f \n", perimetro);
        }else if(lado==4){
            System.out.println("QUADRADO");
            perimetro = medidaDoLado *2f;
            System.out.printf("E sua área é: %.2f \n", perimetro);
        }else if(lado == 5){
            System.out.println("PENTÁGONO");
        }else{
            System.out.println("FIGURA DESCONHECIDA");
        }
    }
}
