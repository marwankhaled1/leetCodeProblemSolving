public class Main {

    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,1,1,1,1,1};
        System.out.println(maxConsecutive(arr));
    }

    public static int maxConsecutive(int[] arr) {

        int currentNumbersOfOnes = 0; // count the consecutive ones in array
        int maxConsecutive = 0; // the last max consecutive ones

        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]==1)
            {
            currentNumbersOfOnes++;
            maxConsecutive=Math.max(currentNumbersOfOnes,maxConsecutive);
            }
            else
            {
            currentNumbersOfOnes=0;

            }

        }

    return maxConsecutive;
    }


}



