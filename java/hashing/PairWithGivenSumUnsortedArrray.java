package com.expedia.demos.ds.hashing;

public class PairWithGivenSumUnsortedArrray {

    public static void main(String[] args)
    {
        int[] arr = {3, 8, 4, 7, 6,1};
        int n = arr.length;
        int[] hashTable = new int[n];
        boolean elementFound = false;
        int slot = 0 ;
        int index = 0;

        int sum = 14;
        for(int i =0; i<n; i++)
        {
            slot = (sum - arr[i]) % n;
            if( hashTable[slot] == 0 )
            {
                int elementSlot = arr[i] % n;
                hashTable[elementSlot] = arr[i];
            }
            else
            {
                elementFound = true;
                index = i;
                break;

            }

        }

        if(elementFound)
        {
            System.out.println("Elements are: " + hashTable[slot] + "," + arr[index]);
        }
        else
            System.out.println("Pair of elements are not found");
    }
}
