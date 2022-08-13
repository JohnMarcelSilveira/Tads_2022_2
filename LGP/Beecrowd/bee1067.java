import java.io.IOException;
import java.util.Scanner;

public class bee1067 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int a;

        a = in.nextInt();

        for(int i = 1; i<=a;i++){
            if(i%2!=0) System.out.println(i);
        }
        
        in.close();

    }

}
