public class Main {
    public static void main(String[] args) {


        }


public static int maxNonRepeatedSubsing(String s)
{

    /*
    we will iterate with two pointers  right will iterate and left update based on
     the value of right if exist in
     hashset we will update left one step forward
     else we will add item and update right and max
         */
    int left=0;
    int right=0;
    int maxSub=0;

    Set<Character>existed=new HashSet<>();

    while (right<s.length())
    {

        if(!existed.contains(s.toCharArray()[right]))
        {
            existed.add(s.toCharArray()[right]);
            right++;
            maxSub=Math.max(maxSub,existed.size());

        }
        else
        {
            existed.remove(s.toCharArray()[left]);
            left++;

        }

    }


        return maxSub;
}







}
