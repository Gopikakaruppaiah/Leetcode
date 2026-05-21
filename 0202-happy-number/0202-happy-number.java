class Solution 
{
    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;
        do
        {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        } while(slow != fast);

        return slow == 1;
    }
    public int findSquare(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;

            sum = sum + digit * digit;

            num = num / 10;
        }
        return sum;
    }
}