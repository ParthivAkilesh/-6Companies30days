class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st = new Stack<>();
        // String sar[] = {"+", "-", "*", "/"};
        String sar = "+-*/";
        for(int i=0; i<tokens.length; i++)
        {
            int a = 0, b = 0,c = 0;
            if (!(sar.contains(tokens[i])))
            {
                st.push(Integer.parseInt(tokens[i]));
                //System.out.println("inserting  "+Integer.parseInt(tokens[i]));
            }
            else
            {
                // System.out.println(" i: "+i);
                
                // System.out.println(" b: "+b+" a: "+a);
                if (tokens[i].equals("+"))
                {
                    b = st.pop();
                    a = st.pop();
                    //System.out.print(a + " "+b);
                    c = a + b;
                    st.push(c);
                   // System.out.println("inserting "+c);
                    
                }
                else if (tokens[i].equals("-"))
                {
                    b = st.pop();
                    a = st.pop();
                    c = a - b;
                    st.push(c);
                   // System.out.println("inserting "+c);
                }
                else if (tokens[i].equals("*"))
                {
                    b = st.pop();
                    a = st.pop();
                    c = a * b;
                    st.push(c);
                    //System.out.println("inserting "+c);
                }
                else if (tokens[i].equals("/"))
                {
                    b = st.pop();
                    a = st.pop();
                    c = a / b;
                    st.push(c);
                    //System.out.println("inserting "+c);
                }
            }
        }
        // System.out.println(st);
        int r = st.pop();
        return r;
    }
}