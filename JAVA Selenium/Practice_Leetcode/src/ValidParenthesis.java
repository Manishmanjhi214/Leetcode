import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str="[]{}()";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> leftSymbols= new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='('|| c=='{'|| c=='['){
                leftSymbols.push(c);
            } else if (c==')' && !leftSymbols.isEmpty() && leftSymbols.peek()=='(') {
                leftSymbols.pop();
            }
            else if (c=='}' && !leftSymbols.isEmpty() && leftSymbols.peek()=='{') {
                leftSymbols.pop();
            }
            else if (c==']' && !leftSymbols.isEmpty() && leftSymbols.peek()=='[') {
                leftSymbols.pop();
            }
            else {
                return  false;
            }
        }
        return  leftSymbols.isEmpty();

    }
}
