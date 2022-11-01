public class Main {
    public static void main(String[] args) {


        }

 public static int bs(int[]nums,int begin,int end, int num)
    {
       if(end>begin) {
           int mid = (end + begin) / 2;

           if (nums[mid] == num) {
               return mid;
           } else if (nums[mid] > num) {

               return bs(nums, begin, mid, num);

           } else {
               return bs(nums, mid + 1, end, num);

           }
       }
      else {

        return -1;

      }

    }





    }


  

