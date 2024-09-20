import java.util.Stack;
class Day12 {
    public static boolean IsValid(String str){
        Stack<Character> st = new Stack<>(); 
        for(char c : str.toCharArray()){
            if(c == '(' || c == '{' || c=='['){
                st.push(c);
            }
            else{

                if(st.isEmpty()) return false;
                char top = st.pop();

                if((c == ')' && top == '(') || (c == '}' && top ==
                '{' ) || (c == ']' && top == '[')){
                    continue;
                }

                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
