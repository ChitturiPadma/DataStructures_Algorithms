package com.expedia.java.demos.ds.arrays;

public class EquilibriumPointInArray {

    public static void main(String[] args)
    {
        int[] arr = {2, 4,5, 2,2, 1, 1};

        int n  =arr.length;
        int sum = 0 ;

        int leftSum = 0;
        int equilibriumIndex =  -1;

        for(int i = 0; i<n ; i++)
            sum+=arr[i];

        for(int i =0; i<n;i++)
        {
            sum -=arr[i];

            if(leftSum == sum)
            {
                equilibriumIndex = i;
                break;
            }
            leftSum+=arr[i];
        }

        if(equilibriumIndex != -1)
        {
            System.out.println("Equilibrium point found at: " + equilibriumIndex);
            System.out.println("Equilibrium Element is : " + arr[equilibriumIndex]);
        }



    }
}
