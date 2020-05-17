
package algoritmaeuclidean;
import java.util.Scanner;

public class Algoritmaeuclidean{
    public static void main(String[] args) {
        int n,m,r;
        
        Scanner dataInput= new Scanner(System.in);
        System.out.print("Masukkan nilai m:");
        m = dataInput.nextInt();
        System.out.print("Masukkan nilai n:");
        n = dataInput.nextInt();
        System.out.print("Nilai PBB:");
        r = dataInput.nextInt();
        System.out.println();
        r = m%n;
        while (r!=0);{
        m=n;
        n=r;
        r=m%n;
        
   }
        r++;
        System.out.println();;
        
    }
}
