public class Main {
    public static void main(String[] args) {
      int[]arr={0,2,3,4,5};

      int []result=search(arr,6);

           System.out.println("the first Index: "+result[0]);
           System.out.println("the second Index: "+result[1]);



    }
public static int[]search(int[]arr,int targetSum)
{
    int [] result=new int[2];
    result[0]=-1;
    result[1]=-1;

    // iterate on the array with two ptrs one from the begin and the other from the end the array is sorted so we
    // start by check if the element pointed by begin and the element pointed by end if less increment being if greater
    //decrement the end and if equals update the ptr

    int begin=0;
    int end=arr.length-1;

    while (begin!=end)
    {

        if(arr[begin]+arr[end]==targetSum){

            result[0]=begin;
            result[1]=end;
            break;
        }
        else if (arr[begin]+arr[end]<targetSum){
              begin++;
        }

     else {
             end--;
        }


    }

      return result;
}



}


