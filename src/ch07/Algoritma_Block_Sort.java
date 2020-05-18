package algoritma_block_sort;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;


public class Algoritma_Block_Sort {

    public static void main(String[] args) {
         int[] nilaiInteger = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
         
          String tampilan;
      JTextArea areaTampilan;
 
      // Menampilkan elemen larik integer
      tampilan = "Menampilkan elemen larik integer :\n";
      for (int x = 0; x < nilaiInteger.length; x++)
         tampilan += nilaiInteger[x] + "   ";
 
      Arrays.sort(nilaiInteger);
 
      // Menampilkan elemen larik integer setelah diurutkan
      tampilan += "\nMenampilkan elemen larik integer setelah diurutkan :\n";
      for (int x = 0; x < nilaiInteger.length; x++)
         tampilan += nilaiInteger[x] + "   ";
 areaTampilan = new JTextArea();
      areaTampilan.setText(tampilan);
      JOptionPane.showMessageDialog(null, areaTampilan, "Mengurutkan Elemen Larik",
         JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri aplikasi
      System.exit(0);
   }
}
    
