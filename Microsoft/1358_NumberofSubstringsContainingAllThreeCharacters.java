class Solution {
    public int numberOfSubstrings(String s) 
    {
        int fr[] = new int[3];
        int i = 0, x = 0, pos = 0, res=0;
        while (x<s.length())
        {
            pos = (int)s.charAt(x) - 97;
            fr[pos] += 1;
            while (fr[0]>0 && fr[1]>0 && fr[2]>0)
            {
                char c = s.charAt(i);
                // System.out.println("adding "+i+" iter: "+x);
                fr[(int)c - 97] -= 1;
                // System.out.println("fr: "+Arrays.toString(fr));
                i+=1;
            }  
            res += i;
            x+=1;
            // System.out.println("fr: "+Arrays.toString(fr));
        }
        // System.out.println("res: "+res);
       return res; 
    }
}