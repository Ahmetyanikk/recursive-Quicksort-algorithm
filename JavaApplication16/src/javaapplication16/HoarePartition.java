/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import static javaapplication16.JavaApplication16.HoarePartition;
import static javaapplication16.JavaApplication16.HoareQuickSort;
import static javaapplication16.JavaApplication16.Swap;

/**
 *
 * @author Ahmet Yanık
 */
public class HoarePartition {
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
        
        }
        
       
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
    }
}
