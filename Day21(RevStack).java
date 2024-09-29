class Day21 {

    public static void insertAtBottom(char c,Stack<> st)
    {
 
        if (st.isEmpty())
            st.push(c);
 
        else {
 
            char a = st.peek();
            st.pop();
            insertAtBottom(c);
 
            st.push(a);
        }
    }

    public static void reverse(Stack<> st)
    {
        if (st.size() > 0) {
            char c = st.peek();
            st.pop();
            reverse();

            insertAtBottom(c,st);
        }
    }
}
