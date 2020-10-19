package com.expedia.demos.ds;

public class LeadersInArray {

    public static void main(String[] args)
    {
        int[] arr = {7, 10, 4, 3 , 6, 5, 2};
        int n = arr.length;

        // last element in the array is always leader since there are no elements right to it
        int curr_leader = arr[n-1];
        System.out.print(curr_leader );


        /* Printing leaders from right to left. Starting from last but one element. compare with the current leader and
        print if its greater than current leader. Also change the current leader.
         */

        for(int i = n -2 ; i >= 0 ; i-- )
        {
            if(arr[i] > curr_leader)
            {
                System.out.print("," + arr[i]);
                curr_leader = arr[i];

            }
        }


    }
}
