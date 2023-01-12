    public static void optimizeduplicateszero(int[]arr)
    {
        //time complexity o(N)
       // space complexity o(1)

        // count number of zeroes because that's make us know how many elements will bw discard from array when duplicate zeroes
        //use two pointer iterate through array to first one to check the element if zero or not and the second to change the value of the arr[j]
        // if the element is non-zero insert value of arr[i] in arr[j]
        // if element is zero insert zero again in the new index of arr[j]
        //terminate condition should be when i = j because there is no adjust in array
      
      
      int zeroes=0;
         for( int i=0;i<arr.length;i++){
           if(arr[i]==0) {
            zeroes++;
           }
         }

       int i=arr.length-1; // first array
        int j=arr.length+zeroes-1;
        while(i!=j&& i>=0) {
            insert(arr, i, j--);

            if (arr[i] == 0) {
             //insert j-- not j :|
                insert(arr, i, j--);
            }

            i--;

        }

    }

public static void  insert (int[]arr,int i,int j) {
    if (j < arr.length) {
        arr[j] = arr[i];

    }

}


 //brute force Solution
// time complexity O(N^2)
// space complexity O(1)


       public static void BruteForceduplicatZerowithshif(int[]nums)
    {

      
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0 && i!= nums.length-1)
            {
          for(int j=nums.length-2;j>i;j--)
          {
              nums[j+1]=nums[j];
          }
          //   nums[i]=0;
             nums[i+1]=0;
             i++;
            }

        }
        
    }
