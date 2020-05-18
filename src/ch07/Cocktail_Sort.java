package cocktail_sort;
public class Cocktail_Sort {
static int temp;
static void Cocktail(int a[], int n){
    boolean is_swapped = true;
    int begin = 0, i;
    int end = n - 1;
    
    while (is_swapped){
        is_swapped = false;
        for(i=begin; i <end; ++i){
            if (a[i] > a [i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a [i+1]= temp;
                is_swapped=true;
            }
        }
        if (is_swapped)
            break;
        is_swapped = false;
            for(i=end - 1; i>=begin; --i){
                if(a[i]>a[i+1]){
                    temp= a[i];
                    a[i]= a[i+1];
                    a[i+1] = temp;
                    is_swapped = true;
                    
                }
                 }
            ++begin;
            
        }
    }

    public static void main(String[] args) {
        int data[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3},i;
        int n = data.length;
        Cocktail(data, n);
        System.out.println("mencetak array yang diurutkan :\n");
        for (i=0; i <n; i++)
            System.out.print(data[i]+ " ");
        System.out.println();
        
    }
}
 