public class Main {
    public static void main(String[] args) {


        System.out.println(checkBalanced("[202+144]]"));


    }


    public static boolean checkBalanced(String expression) {
        char lastParenthesis;
        // create stack to save open parenthesis
        Stack<Character> parenthesis = new Stack<>();
        // iterate on array to match parenthesis in Expression
      for( int i=0;i<expression.length();i++)
     {
         // if open parenthesis add it to stack
        if (expression.charAt(i)=='{'||expression.charAt(i)=='['||expression.charAt(i)=='(')
        {

            parenthesis.push(expression.charAt(i));


        }
        // if close parenthesis
        else if (expression.charAt(i)=='}'||expression.charAt(i)==']'||expression.charAt(i)==')')
        {

            // check if stack empty or not equal
            if(parenthesis.isEmpty()||!checkParenthesisEquality(parenthesis.peek(),expression.charAt(i))){

                return false;
            }
            // else that's mean parenthesis are matched till now
            else
            {
                 parenthesis.pop();

            }


        }


     }
// that's mean all parenthesis are matched or no parenthesis in expression 
    return parenthesis.isEmpty();
    }


    public static boolean checkParenthesisEquality(Character openParenthesis,Character closeParenthesis )
    {

        if(openParenthesis.equals('{'))
        {

        if (!closeParenthesis.equals('}')){
            return false;
        }

        }


        if(openParenthesis.equals('('))
        {

            if (!closeParenthesis.equals(')')){
                return false;
            }

        }

        if(!openParenthesis.equals('{'))
        {

            if (closeParenthesis.equals('}')){
                return false;
            }

        }


        return true;
    }





}
