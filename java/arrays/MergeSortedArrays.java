package com.expedia.java.demos.ds.arrays;

public class MergeSortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};//{7, 3, 5, 1};
        int[] arr2 = {0,2,6,8,9};//{6, 2 , 0, 8, 9};




        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArr = new int[m+n];
        int i = 0 , j=0;
        int k = 0;

        while(i < m && j < n)
        {
            if(arr1[i] < arr2[j])
            {
                mergedArr[k] = arr1[i];
                k++;i++;
            }
            else
            {
                mergedArr[k] = arr2[j];
                k++;j++;
            }

        }

        if(i == m)
        {
            while(j < n)
            {
                mergedArr[k] = arr2[j];
                j++;k++;
            }

        }

        if(j==n)
        {
            while(i < m)
            {
                mergedArr[k] = arr1[i];
                i++;k++;
            }
        }

        System.out.println("Merged two sorted Arrays :");
        for(int l = 0;l< mergedArr.length;l++)
        {
            System.out.print(mergedArr[l] +",");
        }




    }
}
