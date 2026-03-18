class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            int d=0;
            while(a>0)
            {
                d++;
                a=a/10;
            }
            if(d%2==0)
            {
                count++;
            }
        }
       return count;
    }
}