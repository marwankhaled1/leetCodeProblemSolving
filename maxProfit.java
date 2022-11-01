public class Main {
    public static void main(String[] args) {


        }


    public static int maxProfit(int[] prices) {
   //using loop on array save the mini value and calcauate the max profit for the current value - mini value
        // we save the mini value update in it if needed and each time calculate max profit
       int max=0;
       int min=Integer.MAX_VALUE;

       for(int i=0;i<prices.length;i++)
       {
           min=Math.min(min,prices[i]);
           max=Math.max(max,prices[i]-min);

       }


      return  max;
    }



    public static int nonoptimalmaxProfit(int[] prices)
    {
        // iterate through array and compare each value with the elements after it
        int max=0;
        for(int i=0; i<prices.length;i++)
        {

            for( int j=i+1;j<prices.length;j++){

                max= Math.max(prices[j]-prices[i],max);

            }


        }


              return max;




    }













}
