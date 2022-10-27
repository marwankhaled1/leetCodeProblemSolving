public class Main {
    public static void main(String[] args) {
        int[]arr={1};
        System.out.println(naivemaxsub(arr,2));
        System.out.println(optimalmaxsub(arr,2));
    }
    public static int optimalmaxsub(int[]arr,int k){
    int result=0;
    int max=-1;

    if(arr.length<k){
        return 0;

    }
    else{
        for (int i=0;i<k;i++){

            result+=arr[i];
        }

    }


        for(int i=1;i<arr.length-k+1;i++)
        {

            result=result-arr[i-1]+arr[i+k-1];
            max=Math.max(result,max);

        }

        return  max;
    }




    public static int naivemaxsub(int[]arr,int k)
    {
        //naive solution
        // loop on array and each iteration is the beginning of the sliding window
   // nested loop on the array for k element and sum them  in temp from index i to i+ k-1
        // update the max based on the result
        // return the max  in the end.
        int max=-1;
        int temp=0;
        for (int i=0;i<arr.length-k+1;i++){
             temp=0;
            for(int j=0;j<k;j++)
            {
                 temp+=arr[i+j];
            }

            max=Math.max(max,temp);

        }

   return max;
    }




}
