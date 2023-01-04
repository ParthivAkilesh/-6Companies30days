class Solution {
    public String getHint(String secret, String guess) 
    {
        int sar[] = new int[10];
        // int gar[] = new int[10];
        int b = 0, c = 0;
        for (int i=0; i<guess.length(); i++)
        {
            if (secret.charAt(i) == guess.charAt(i))
            {
                b+=1;
            }
            sar[Integer.parseInt(secret.charAt(i)+"")]++;
        }
        for (int j=0; j<guess.length(); j++)
        {
            if (sar[Integer.parseInt(guess.charAt(j)+"")]!=0)
            {
                c += 1;
                sar[Integer.parseInt(guess.charAt(j)+"")]--;
            }
        }
        c = c-b;
        return b+"A"+c+"B";
    }
}