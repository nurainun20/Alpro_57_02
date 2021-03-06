import java.util.Vector;

public class Sieve_of_atkin {
    public static void main(String[] args) {
         int limit = 99999999; // Batas maksimum bil. prima yang dicari
        boolean[] bil_asal = new boolean[limit];
        for (int i = 0; i < limit; i++) {
            bil_asal[i] = true;
        }
        bil_asal[0] = false; // bilangan 0 bukan bilangan prima
        bil_asal[1] = false; // bilangan 1 bukan bilangan prima
 
        // Penerapan algoritma Sieve of Erathosthenes
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (bil_asal[i]) {
                for (int j = i * i; j < limit; j = j + i) {
                    bil_asal[j] = false;
                }
            }
        }
 
        // Masukkan semua bilangan prima hasil pencarian ke dalam array "prima"
        Vector<Integer> prima = new Vector<Integer>();
        for (int i = 2; i < limit; i++) {
            if (bil_asal[i]) {
                prima.add(i);
            }
        }
        System.out.println("Jumlah bilangan prima antara 0 sampai " + limit
                + " adalah " + prima.size() + " buah");
       
}
    }

    
