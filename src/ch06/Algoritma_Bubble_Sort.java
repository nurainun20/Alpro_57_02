import java.util.Arrays;

public class Algoritma_Bubble_Sort {
 public static void main(String[] args) {
        int[] intArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("\n* Unsorted Integer Array *******");
        for(int x: intArray){
            System.out.print(x+" ");
        }
        Arrays.sort(intArray);

        System.out.println("\n* Sorted Integer Array *******");
        for(int x: intArray){
            System.out.print(x+" ");
        }
    }
        }
    