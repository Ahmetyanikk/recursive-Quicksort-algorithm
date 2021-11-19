/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;


/**
 *
 * @author Ahmet Yanık
 */
public class LomutoPartition {
      static void Swap(int[] array,
                 int position1,
                 int position2)
{
   
    int temp = array[position1];
    
    array[position1] = array[position2];
     
    array[position2] = temp;
}

  static int LomutoPartition(int []arr, int low,
                                int high)
{
    int pivot = arr[high];
     
    
    int i = (low - 1);
 
    for (int j = low; j <= high- 1; j++)
    {
        
        if (arr[j] <= pivot)
        {
            i++; 
            Swap(arr, i, j);
        }
    }
    Swap(arr, i + 1, high);
    return (i + 1);
} 
static void LomutoQuickSort(int []arr, int low,
                                 int high)
{
    
    if (low < high)
    {
        /* pi is partitioning index,
        arr[p] is now at right place */
        int pi = LomutoPartition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        LomutoQuickSort(arr, low, pi - 1);
        LomutoQuickSort(arr, pi + 1, high);
    }
    
    
}
      
      public static void main(String[] args) {
         int[] arr2 = { 6, 42, 59, 14, 8, 3 };
          int n = arr2.length;
        long start2 = System.nanoTime();
        LomutoQuickSort(arr2, 0, n - 1);
          long end2 = System.nanoTime();
          long elapsedTime2 = (end2 - start2) ;
          System.out.println(elapsedTime2);
        for (int i = 0; i < n; i++) {
              System.out.print(" " + arr2[i]);
        }
         System.out.println(" ");
    }
}
