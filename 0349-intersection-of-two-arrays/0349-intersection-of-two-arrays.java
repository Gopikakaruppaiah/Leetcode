class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            n.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(n.contains(nums2[i]))
            res.add(nums2[i]);
        }
        int result[]=new int[res.size()];
        int m=0;
        for(int k:res)
        {
            result[m++]=k;
        }
        return result;

    }
}