class Solution {
    public boolean isPalindrome(int x) {
        String num=Integer.toString(x);
        int pointer1=0;
        int pointer2=num.length()-1;
        boolean flag=false;
        while(pointer1<=pointer2)
        {
            if(num.equals("0")||num.equals("1"))
            {
                flag=true;
            }
            else if(num.charAt(pointer1)==num.charAt(pointer2))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }
            pointer1++;
            pointer2--;
        } 
        return flag;
        
    }
}