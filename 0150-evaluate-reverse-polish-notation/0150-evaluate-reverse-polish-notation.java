class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            int a,b;
            switch(s){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                    a=st.pop();
                    b=st.pop();
                    st.push(b-a);
                    break;
                case "*":
                    st.push(st.pop()*st.pop());
                    break;
                case "/":
                    a=st.pop();
                    b=st.pop();
                    st.push(b/a);
                    break;
                default:
                    st.push(Integer.parseInt(s)); 
            }
        }
        return st.pop(); 
    }
}