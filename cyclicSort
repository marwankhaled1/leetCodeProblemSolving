public class Main {
    public static void main(String[] args) {
       int []arr={};
       cyclicSort(arr);
       for (int i:arr){

       System.out.println(i);
      }

    }


    public static void cyclicSort(int[]nums) {
       int temp;
        int rightIndex;
     // iterate on array
        for (int i=0;i<nums.length;i++){
            rightIndex=nums[i]-1;
            // check  if the current element in its right position or not
            // if no swap element with it's right position
            if(nums[i]!=nums[rightIndex])
            {
               swap(nums,i,rightIndex);

            }


        }


    }

    public  static void swap(int[]nums,int i, int rightIndex){

        int temp;

        temp=nums[rightIndex];
        nums[rightIndex]=nums[i];
        nums[i]=temp;



    }






}


