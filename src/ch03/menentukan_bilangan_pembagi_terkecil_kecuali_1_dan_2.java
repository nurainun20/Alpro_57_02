package menentukan_bilangan_pembagi_terkecil_kecuali_1_dan_2;
public class menentukan_bilangan_pembagi_terkecil_kecuali_1_dan_2 {
    public static void main(String[] args) {
        int a=2;
        
        System.out.println("*********************************");
        System.out.println("*masukkan bilangan bulat pertama*");
        System.out.println("*********************************");
        System.out.println(a+"\n");
        
        int b=4;
        
        System.out.println("*********************************");
        System.out.println("*masukkan bilangan bulat kedua*");
        System.out.println("*********************************");
        System.out.println(b+"\n");
        
        int c=0;
        
        for(int x=1;x<=b;x++){
            c=(c+a);
        }
        System.out.println("*******************************");
        System.out.println(" *FBB dari " + a + " dan " + b + " adalah* ");
        System.out.println("*******************************");
        
        int d;
        
        d = a % b;
        
        while ( d != 2){
           a = b;
           b = d;
           d = a % b;
        }
        
        System.out.println(b);
        
    }
}
