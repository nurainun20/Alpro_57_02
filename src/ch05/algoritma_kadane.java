public class algoritma_kadane{
 public static void maxSumIndexes(int[]a){
   int size = a.leght;
   if (size==0) return;

   int maxAtIndex = a[0], max = a[0];
   int bAtIndex = 0;
   int b = 0, e=0;

   for (int i = 1; i < size; i++){
      maxAtIndex = Math.max(a[i], a[i] + maxAtIndex);
       if(maxAtIndex==a[i])
        batIndex = i;

   max = Math.max(max, maxAtIndex);

   if (max==maxAtIndex){
     e = 1;
     b = (b != bAtIndex)? bAtIndex ex : b;
   }
 
   System.out.println(b);
   System.out.println (e);
 }
}