import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        System.out.println(isHappy(19));


    }
    public static boolean isHappy(int n) {

        // get the number while (true)
         // get the sum of the squares of digits
           // if it ==1
          // return happy
        //else if exist in hashset return  not happy
        // else
        // get the sum of this number again
        int sumDigits=0;
        int checkedNumber=n;
        HashSet<Integer>previousCalculated=new HashSet<>();
        while (true){

            sumDigits=sum(checkedNumber);
            if(sumDigits==1){
                return true;

            }
            else if (previousCalculated.contains(sumDigits))
            {

                return false;

            }
            else{

                previousCalculated.add(sumDigits);
                checkedNumber=sumDigits;

            }


        }






    }

    private static int sum(int checkedNumber) {
        int output=0;
        int digit=0;
        while (checkedNumber!=0){

            digit=checkedNumber%10;
            output+=digit*digit;
            checkedNumber=checkedNumber/10;

        }


        return output;
    }


}
