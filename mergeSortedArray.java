 public static void merge(int[] nums1, int m, int[] nums2, int n) {

        
        
        //note m and n are the numbers of elements in each array not length  of each array  
         int last=m+n-1;

        while(m>0 &&n>0)
        {
            if(nums1[m-1]>nums2[n-1]){

                nums1[last]=nums1[m-1];
                        m--;
            }
            else{

               nums1[last]= nums2[n-1];
                n--;

            }
            last--;

        }


        while(n>0)
        {
        nums1[last]=nums2[n-1];
        n--;
        last--;

        }


    }


