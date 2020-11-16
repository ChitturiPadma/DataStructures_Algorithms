package com.expedia.java.demos.ds.arrays;

public class MinimumPlatforms {
    public static void main(String[] args)
    {
        double[] arrival = {9.0, 9.4, 9.5, 11.0, 15.0, 18.0};

        double[] departure  = {9.1, 12.0, 11.2, 11.3, 19.0, 20.0};

        int n = arrival.length;

        int platforms = 1;
        int minPlatforms = 1;

        int i =1, j=0;

        for(;i<n && j< n; )
        {
            if(arrival[i] < departure[j])
            {
                platforms +=1;
                i++;
                if(platforms > minPlatforms)
                    minPlatforms = platforms;
            }
            else
            {
                platforms -= 1;
                j+=1;
            }
        }

        System.out.println("Minimum #platforms: " + minPlatforms);
    }
}
