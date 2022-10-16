package ListasExercicios.Lista08;

import java.util.Scanner;

public class Ex03L08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float v[], media;
        v = new float[10];
        media = 0;
        
        for(int i = 0;i<v.length;i++){
            System.out.println("Digite o " + (i+1)+"º valor:");
            v[i] = in.nextFloat();
            media += v[i];
        }

        media = media/10f;

        System.out.printf("A media foi %.2f", media);
    }
}
