class Solution {
    public int[] getConcatenation(int[] nums) {
        // ArrayList<Integer> s=new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     s.add(nums[i]);


        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     s.add(nums[i]);
        // }
        // int res[]=new int[nums.length*2];
        // int index=0;
        // for(int num:s)
        // {
        //     res[index++]=num;
        // }
        // return res;
        int a[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
            a[i+nums.length]=nums[i];
        }
        return a;

    }
}