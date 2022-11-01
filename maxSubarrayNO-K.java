public class Main {
    public static void main(String[] args) {


        }

 public static int maxSubArray(int[] nums) {

        // we iterate on the array and update current sum if the current sum <0 we will set it equal  zero and start from the next element

        int max = nums[0];
        int current_Sum = 0;

        for (int i = 0; i < nums.length; i++)
        {

            if (current_Sum < 0) {
                current_Sum = 0;
            }
            current_Sum+=nums[i];
            max=Math.max(max,current_Sum);

        }

        return max;

}


    }
