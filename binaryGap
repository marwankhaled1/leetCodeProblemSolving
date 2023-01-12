public class Main {
    public static void main(String[] args) {

        System.out.println(solution(1));

    }

    public static int solution(int N){
        // convert N to binary
        String binaryNumber=Integer.toBinaryString(N);
        int maxGap=0;
        int count=0;
        Stack<Character> storage=new Stack<>();

        //loop on number if it one  makes max =max ,count and set count =0
        for (int i=0 ;i<binaryNumber.length();i++){

            if(binaryNumber.charAt(i)=='1')
            {
            if(!storage.isEmpty()){

                maxGap=Math.max(maxGap,count);
                count=0;

            }

            else
            {

            storage.push('1');

            }

            }

            else{

                if (!storage.isEmpty())
                {
                    count++;

                }


            }



        }


       return  maxGap;

    }
}
