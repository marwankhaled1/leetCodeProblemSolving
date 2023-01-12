public class Main {
    public static void main(String[] args) {

        int[]nums={80,10,50,60,10,3};

        //insertionSort(nums);

        mergeSort(nums,0,nums.length-1);

        for (int i : nums ){

            System.out.println(i);

        }



    }


    public static int maxTasks(int []tasks,int time)
    {

        // create variable to save the potential tasks you Can Do
        int numOfTaks=0;

        // Sort the array of times in ascending order




        // loop on array

         //if time of task <= rest of the time you have
             // update time you have and update #of tasks you can do




        //returm # tasks you can do

        return numOfTaks;
    }

    public static void mergeSort(int []nums,int left,int right) {


        if (left < right) {

            // get mid of array
            int mid = (left + right) / 2;
            // merge sort in left part
            mergeSort(nums, left, mid);
            //merge sort in right part
            mergeSort(nums, mid + 1, right);
            //merge the left and right part
            mergeArrays(nums, left, mid, right);
        }

    }

    private static void mergeArrays(int[] nums, int left, int mid, int right)
    {

        //create to arrays to put two parts in
        //size of two arrays
        int sizeArr1=mid-left+1;
        int sizeArr2=right-mid;

        int [] firstPart=new int[sizeArr1];
        int [] secondtPart=new int[sizeArr2];
        //move the first half and second half into 2 temps arrays

        for(int i=0;i<sizeArr1;i++)
        {

        firstPart[i]=nums[left+i];

        }


        for(int i=0;i<sizeArr2;i++)
        {

            secondtPart[i]=nums[mid+1+i];

        }

        // create three ptrs i for array 1 and j for array2 and k for array 3
        //k must start from the left not zeroo
         int i=0;int j=0; int k=left;
         //loop while ptr1<size of array 1 and ptr2<array2
         while(i<sizeArr1&&j<sizeArr2)
         {
             //put in result array and increase ptr of the array that i add from only
             if(firstPart[i]<=secondtPart[j]) {

                 nums[k]=firstPart[i];
                 i++;
             }
             else {
                 nums[k]=secondtPart[j];
                 j++;
             }

             // increment ptr of result array
              k++;
         }
        //loop on the first array to see if there is any element i haven't put

        while(i<sizeArr1) {
        nums[k]=firstPart[i];
        i++;
        k++;
        }
        // the same previous operation for the second array
        while(j<sizeArr2) {
            nums[k]=secondtPart[j];
            j++;
            k++;
        }

    }


    public static void insertionSort(int []nums)
    {
        int key=0;
        int index=0;
        // loop on array from index 1 to n
        for (int i=1;i<nums.length;i++) {
            // save key which is the element we want to check the correct position and it's previous index to shift elements if we need
            key=nums[i];
            index=i-1;
            // loop from j to the index where it's current element greater than key
            //we put index >=0 first so that if we check the first element and j -> -ve don't through exception
            while(index>=0 && nums[index]>key) {
                //shift elements by 1 and move to previous element
                nums[index+1]=nums[index];
                index--;

            }

            //put key in nums[j+1] where it's previous element shifted to j+2
            nums[index+1]=key;



        }



    }




        public static void bubbleSort(int []nums)
    {
        int temp=0;
        // loop on array [outer loop]
         for(int i=0;i<nums.length;i++) {
             //loop on array again
             for (int j=0;j<nums.length-1;j++) {
                 // if the prev> curr element
                 if(nums[j]>nums[j+1])
                 {
                     // swap two element
                      temp=nums[j+1];
                     nums[j+1]=nums[j];
                     nums[j]=temp;
                 }
             }

         }


    }


        public static int [] selectionSort(int []nums)
    {

        int minIndex=0;
        int tempValue=0;
        //iterate on each element

        for(int i=0;i<nums.length;i++) {
            //nested loop for the rest of element in array
            minIndex=i;
            for(int j=i+1;j<nums.length;j++)
            {
                // find minimum element that is smaller that the nums[j]
                 if(nums[minIndex]>nums[j]) {

                     // get minimum element index
                     minIndex = j;

                 }

            }
            //swap elements
            tempValue=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=tempValue;

        }
           return nums;
    }


}
