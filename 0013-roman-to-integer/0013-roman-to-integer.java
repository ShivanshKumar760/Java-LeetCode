class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int number=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'M':number=1000;break;
                case 'D':number=500;break;
                case 'C':number=100;break;
                case 'L':number=50;break;
                case 'X':number =10;break;
                case 'V':number =5;break;
                case 'I':number=1;break;
            }
            if(number<prev)//1<0//1<1//1<1//5<1//50<5
            {
                ans-=number;//
            }
            else
            {
                ans+=number;//ans=1//2//3//8//58
            }
            prev=number;//prev=1//1//1//5//50
        }
        return ans;//58
    }
}