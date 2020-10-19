package com.expedia.demos.ds;

public class ReverseAnArray {
    public static void main(String[] args)
    {
       // int[] arr =  {10, 20, 20, 30, 50};

        int[] arr =  {10, 12, 32, 50};

       int len = arr.length;
       int middleIndex ;



       int i = 0 ; // low index
       int j = len-1; // high index

        // Iterate till lower index is less than higher index
       while(i<j)
       {

           // in case of odd number of elements , i ==j and in even number of elements, i ll move forward of j. Then quit the iteration
           if(i == j || i > j)
           {
               break;
           }
           else
           {
               arr[i] = arr[i] + arr[j];
               arr[j] = arr[i] - arr[j];
               arr[i] = arr[i] - arr[j];
           }

           i++;
           j--;
       }

       for(int k = 0; k < len ; k++)
           System.out.print(arr[k] + ",");


    }
}
