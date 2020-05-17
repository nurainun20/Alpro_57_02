package algoritma_insertion_sort;


public class Algoritma_Insertion_Sort {
public static void main(String[] args) {
       int i,j,data_sisip;
        int[] tabInt = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    System.out.print("sebelum dilakukan pengurutan insertingsort \n");

        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        
        
        
        for(i=1; i<tabInt.length; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        System.out.print("\n setelah dilakukan pengurutan insertingsort \n");
       
         for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
}
}

        
        