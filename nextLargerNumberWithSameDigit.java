public class Main {
    public static void main(String[] args) {


    }
  public static int nextLargerNumber(int num) {
        char temp;

        String x = String.valueOf(num);
        char[]stringarray=new char[x.length()];
        for (int i = x.length() - 1; i > 0; i--) {

            if (Integer.parseInt(String.valueOf(x.toCharArray()[i]))   > Integer.parseInt(String.valueOf(x.toCharArray()[i-1])) ) {

                stringarray=x.toCharArray();
                temp = x.charAt(i-1) ;
                stringarray[i-1] = stringarray[i] ;
                stringarray[i]=temp;
                break;

            }

        }


        int y =Integer.parseInt(String.valueOf(stringarray));

        if (y == num) {
            return -1;
        } else {
            return y;
        }


    }


}
