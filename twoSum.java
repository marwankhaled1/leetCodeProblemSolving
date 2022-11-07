class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int[] result=new int[2];

        Hashtable <Integer,Integer> series=new Hashtable<>();

        for( int i=0;i<nums.length;i++)
        {

           if(series.containsValue(nums[i])!=true )
           {

               series.put(nums[i],i);

           }

        }

         for(int i=0;i<nums.length;i++){

             if(series.containsKey(target-nums[i])  && i!= series.get(target-nums[i]) )
             {

             result[0]=i;
             result[1]=series.get(target-nums[i]);
             return result;
             }

         }





        return result;
    }
    }
