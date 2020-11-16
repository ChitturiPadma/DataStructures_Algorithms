package com.expedia.java.demos.ds.hashing;

public class SubArrayWithSumZero {

    public static void main(String[] args)
    {
        int[] arr = {1, 4, -3 , 1, 2 };
        int n = arr.length;
        boolean isSubArrayZero = false;
        int i;
        int j = 0;
        int curr_sum;
        for(i = 0; i<n; i++)
        {
            curr_sum = 0;
            j=i ;
            for(;j<n;j++)
            {
                curr_sum+=arr[j];
                if(curr_sum == 0)
                {
                    isSubArrayZero = true;
                    break;
                }
            }

            if(isSubArrayZero)
                break;
        }

        if(isSubArrayZero)
        {
            System.out.println("SubArray that is giving zero Sum:i: " + i + " :j " + j);
            for(int k=i; k<=j; k++)
                System.out.print(arr[k] + ",");

        }
        else
            System.out.println("Sub Array with Zero sum is not found");

        efficientMethod(arr);


    }


    // Efficient Method
    //Compute pre-fix sum of elements of the array

  public  static void efficientMethod(int[] arr)
    {
        int n = arr.length;
        int[] prefixSumArr = new int[n];
        prefixSumArr[0] = arr[0];
            for(int i=1;i<n; i++)
                prefixSumArr[i] = arr[i] + prefixSumArr[i-1];



        int[] hashtable = new int[n];
            int startIndex = 0;
            int endIndex= 0 ;

        for(int i=0;i<n;i++)
        {
            int bucket = prefixSumArr[i] % n;
            if(hashtable[bucket] > 0)
            {
               startIndex = hashtable[bucket] + 1;
               endIndex = i;
               break;

            }
            else
                hashtable[bucket] = i;
        }

        System.out.println("\nSub Array with Sum Zero:Efficient Method");
        for(int i=startIndex; i<=endIndex; i++)
            System.out.print(arr[i] + ",");

    }

}
