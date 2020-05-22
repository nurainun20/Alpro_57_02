import java.util.Scanner;


public class Sieve_of_sundaram {
    private boolean[] calcPrimes(int limit)
    {
        int n = limit/2;
        boolean[] prime = new boolean[limit];        
 
        for (int i = 1; i < n; i++)
            for (int j = i; j <= (n - i) / (2 * i + 1); j++)
                prime[i + j + 2 * i * j] = true;
 
        return prime;
   
    }
    public void getPrimes(int N)
    {
        boolean[] primes = calcPrimes(N);
        display(primes);
    }
    public void display(boolean[] primes)
    {
        System.out.print("\nPrimes = 2 3 ");
        for (int i = 2; i < primes.length/2; i++)
            if (!primes[i])
                System.out.print((2 * i + 1) +" ");
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Sundaram Prime Algorithm Test\n");
         Sieve_of_sundaram sos  = new  Sieve_of_sundaram();
        System.out.println("Enter number to find all primes less than the number\n");
        int n = scan.nextInt();
             
    }
}
    

