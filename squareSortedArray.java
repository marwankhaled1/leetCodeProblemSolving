import org.w3c.dom.xpath.XPathResult;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[]arr={-2,-1,0,2,3};
      int [] result=arrSquare(arr);

        for(int i:result){

            System.out.println(i);

        }



    }

    public static int[] arrSquare(int [] arr){
        


        int [] result=new int[arr.length];
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<=j){

            if(Math.pow(arr[j],2)>=Math.pow(arr[i],2)){

                result[j]=arr[j]*arr[j];
                j--;
            }
            else
            {
// we decrement j because elements are negative so the square of the next square element will not be more than the square of the element before  
            temp=arr[i]*arr[i];
            result[i]=arr[j]*arr[j];
            result[j]=temp;
            i++;
            j--;
            }


        }

    //    result[j]=result[j]*result[j];




        return result;

    }



}


