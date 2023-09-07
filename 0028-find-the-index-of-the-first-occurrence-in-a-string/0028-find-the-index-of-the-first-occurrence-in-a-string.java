class Solution {
    public int strStr(String haystack, String needle) {
        int resultIndex=0;
        outer:
        for(int i=0;i<haystack.length();i++)
        {
            for(int j=i;j<haystack.length();j++)
            {
                if(haystack.substring(i,j+1).equals(needle))
                {
                    resultIndex=i;
                    break outer;
                }
                else
                {
                    resultIndex=-1;
                }
            }
        }

        return resultIndex;
    }
}