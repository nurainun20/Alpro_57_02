 import java.util.Scanner;
public class MenentukanSebuahAngkaBilanganPrimaAtauTidak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukkan angka yang akan di cek: ");
        
        int angka = input.nextInt();
        
        int temp;
        boolean prima = true;
        
        //penggunaan for loop 
        for (int pembagi=2; pembagi<=angka /2; pembagi++){
            temp = angka % pembagi;
            if (temp==0){
             prima = false;
             break;
            }
        }
        /*
         jika prima adalah true dan angka yang diberikan user bukanlah 0 dan 1
         */
        if (prima &&((angka>0)&&(angka!=1)))
            System.out.println(angka + " adalah bilangan prima");
        else
            System.out.println(angka + " bukanlah bilangan prima");
    }
}
