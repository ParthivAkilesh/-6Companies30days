public class kmp 
{
    public static void main(String[] args) 
    {
        String s = "ABABDABACDABABCABAB";
        String p = "ABABCABAB";
        int i=0,j=0,f=0;
        while(i<s.length() && j<p.length())
        {
            System.out.println("ci: "+s.charAt(i)+" cj: "+s.charAt(j));
            System.out.println("i: "+i+" j: "+j);
            if (s.charAt(i) == p.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if (j!=0)
                {
                    j--;
                }
                else if (j == p.length())
                {
                    
                }
                else
                {
                    i++;
                    // f=j;
                }
                continue;
            }
            
        }
        System.out.println("Starting at: "+(i-j));
        System.out.printf("String given %s pattern found is %s", s, s.substring((i-j), (i-j)+p.length()));
        
    }
}
