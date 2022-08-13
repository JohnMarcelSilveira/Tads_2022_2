import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class bee1003 {
 
    public static void main(String[] args) throws IOException {
 
        
         int A,B,SOMA;
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(System.in));
         
         A = Integer.parseInt(reader.readLine());
         B = Integer.parseInt(reader.readLine());
         
         SOMA = A+B;
         
         System.out.printf("SOMA = %d\n", SOMA);
 
    }
 
}