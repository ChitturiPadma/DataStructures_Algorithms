package com.expedia.demos.ds;

public class StockBuySell {

    public static void main(String[] args)
    {
        int[] price = {1, 5, 3, 8, 12};
        int n = price.length;

        int profit = 0;

        // Efficient solution.
        /*
          Stock purchased when price is low and sold at high price.
          Hence when  price[i] > price[i-1], calculate the difference and add the difference to the profit variable.
         */
        for(int i = 1; i < n ; i++)
        {
            if(price[i] > price[i-1])

                profit += (price[i] - price[i-1]);

        }

        System.out.println("Profit:" + profit);
    }
}
