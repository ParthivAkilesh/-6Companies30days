import java.util.*;

class KMPAlgoPart2
{

    private static int[] calcLPS(String s)
    {
        int lps[] = new int[s.length()];
        int len=0, i=1; 
        lps[0]=0;
        while(i<s.length())
        {
            if (s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len != 0)
                {
                    len = lps[len-1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        // System.out.println("lps: "+Arrays.toString(lps));
        return lps;
    }
    public static void main(String[] args) 
    {
        String s = "ABABDABACDABABCABAB";
        String p = "ABABCABAB";

        int m = p.length();
        int n = s.length();
        int i=0,j=0;
        int[] lps = calcLPS(p);
        System.out.println(Arrays.toString(lps));

        while((n-i) >= (m-j))
        {
            if (p.charAt(j) == s.charAt(i))
            {
                i++;
                j++;
            }
            if (j == m)
            {
                System.out.println("Pattern starting at "+(i-j));
                j = lps[j-1];
            }
            else if (i < n && p.charAt(j)!=s.charAt(i))
            {
                if (j != 0)
                {
                    j = lps[j-1];
                }
                else
                {
                    i+=1;
                }
            }
            
        }
    }
}







       