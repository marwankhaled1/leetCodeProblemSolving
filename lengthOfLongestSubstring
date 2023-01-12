public class Main {
    public static void main(String[] args) {


        }



        public static int lengthOfLongestSubstring(String s) {

       int max=0;
       int prev=0;
       int curr=0;
       HashSet<Character>exist=new HashSet<>();
       //Set<Character>exist=new HashSet<>();
     while(curr<s.length())
     {

    while(exist.contains(s.toCharArray()[curr]))
         {
             exist.remove(s.toCharArray()[prev]);
             prev++;

     }

    exist.add(s.toCharArray()[curr]);
    curr++;
    max=Math.max(max,exist.size());



     }


       return max;
    }



    public static int nonefficiecntlengthOfLongestSubstring(String s)
    {
        Set<Character>existed=new HashSet<>();
        int max=0;
        int counter;

    for( int i=0;i<s.length();i++)
    {
        counter=1;
        existed=new HashSet<>();
        existed.add(s.toCharArray()[i]);
        for(int j=i+1;j<s.length();j++)
        {

        if(existed.contains(s.toCharArray()[j])){

            break;

        }
        existed.add(s.toCharArray()[j]);
        counter++;

        }
        max=Math.max(counter,max);


    }
        return max;
    }






    }
