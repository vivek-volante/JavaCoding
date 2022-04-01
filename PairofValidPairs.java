
import java.util.*;
public class PairofValidPairs {
    public static void main(String args[]) {
      String brace ="{}(((())))";
      Stack<Character> stack=new Stack<Character> ();
      boolean isvalid =true;
      for(char c : brace.toCharArray()){
          if(c=='{' || c=='[' || c=='(')
          stack.push(c);
          else
          if(stack.isEmpty()){
              isvalid=false;
          }else{
              char peekChar = stack.peek();
              if((c=='}' && peekChar!='{') || (c==')' && peekChar!='(') || (c==']' && peekChar=='[')){
              isvalid=false;
                  break;
              }else{
                  stack.pop();
              }
          }
          
      }
      if(!stack.isEmpty())
        isvalid=false;
      System.out.println("Sum of x+y = "+ isvalid);
    }
}
