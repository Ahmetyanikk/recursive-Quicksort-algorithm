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
 static int HoarePartition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true) {
          
            do {
                i++;
            } while (arr[i] < pivot);
 
          
            do {
                j--;
            } while (arr[j] > pivot);
 
        
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           
        }
    }
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
     
    // Index of smaller element
    int i = (low - 1);
 
    for (int j = low; j <= high- 1; j++)
    {
        // If current element is smaller
        // than or equal to pivot
        if (arr[j] <= pivot)
        {
            i++; // increment index of
                 // smaller element
            Swap(arr, i, j);
        }
    }
    Swap(arr, i + 1, high);
    return (i + 1);
}  
 static void quickSort(int []arr, int low,
                                 int high)
{
    if (low < high)
    {
        /* pi is partitioning index,
        arr[p] is now at right place */
        int pi = HoarePartition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
 
 
 
    public static void main(String[] args) {
   
    }
    
}
