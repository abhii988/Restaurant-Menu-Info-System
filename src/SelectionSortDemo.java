import java.util.Arrays;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SelectionSortDemo
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(5, 15);
      System.out.println(Arrays.toString(a));

      SelectionSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}

   