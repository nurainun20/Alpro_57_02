package code2i;

public class Code2i {
    public static void main(String[] args) {
        int [] x= {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
      
   int angka_max = x[0];
   int angka_min=  x [0];
     for (int i=0; i<=82; i++){
   // Menghitung selisih
    int selisih = angka_max - angka_min;
     System.out.println("Selisih angka = " + selisih);
   }
 }
}
    
   