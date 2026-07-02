class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num==0)
        {
            return 0;
        }
        if(num<10)
        {
            return num;
        }
        while(num>=10)
        {
            sum=0;
            int d=num%10;
            num=num/10;
            sum=d+num;
            num=sum;
        }
        return sum;
    }
}