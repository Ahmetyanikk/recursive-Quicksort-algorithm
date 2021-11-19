/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Ahmet
 */
public class JavaApplication16 {
    static void Swap(int[] array,
                 int position1,
                 int position2)
{
   
    int temp = array[position1];
    
    array[position1] = array[position2];
     
    array[position2] = temp;
}
 
 static int HoarePartition(int[] arr, int low, int high)
    {
       long start = System.nanoTime();
       
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
 
        while (true)
        {
            do {
                i++;
            } while (arr[i] < pivot);
 
            do {
                j--;
            } while (arr[j] > pivot);
 
            if (i >= j) {
                return j;
            }
 
            Swap(arr, i, j);
          long end = System.nanoTime();
 long elapsedTime = end - start; 
    System.out.println(elapsedTime);
        }
        
       
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
 static void HoareQuickSort(int []arr, int low,
                                 int high)
{ 

    if (low < high)
    {
        
        /* pi is partitioning index,
        arr[p] is now at right place */
        int pi = HoarePartition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        HoareQuickSort(arr, low, pi - 1);
        HoareQuickSort(arr, pi + 1, high);
         
    }

}
 static void LomutoQuickSort(int []arr, int low,
                                 int high)
{
    
    if (low < high)
    {
        /* pi is partitioning index,
        arr[p] is now at right place */
        int pi = HoarePartition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        LomutoQuickSort(arr, low, pi - 1);
        LomutoQuickSort(arr, pi + 1, high);
    }
    
    
}
 
 
 
    public static void main(String[] args) {
      
    int[] arr = { 6, 42, 59, 14, 8, 3 };
        int n = arr.length;
long start1 = System.nanoTime();
        HoareQuickSort(arr, 0, n - 1);
       long end1 = System.nanoTime();

long elapsedTime1 = (end1 - start1) ;
        System.out.println(elapsedTime1);
        for (int i = 0; i < n; i++) {
              System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
        int[] arr2 = { 6, 42, 59, 14, 8, 3 };
        long start2 = System.nanoTime();
        LomutoQuickSort(arr, 0, n - 1);
          long end2 = System.nanoTime();
          long elapsedTime2 = (end1 - start1) ;
          System.out.println(elapsedTime2);
        for (int i = 0; i < n; i++) {
              System.out.print(" " + arr[i]);
        }
         System.out.println(" ");
    }
    
}
