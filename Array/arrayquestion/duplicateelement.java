class solution {
    public boolean hasDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
               {
                return true;
               } 
               
            }
        }
        return false;
        
    }

    public static void main(String args[])
    {
        int num[]={1,2,3,3,4};
        solution s1=new solution();
        System.out.println(s1.hasDuplicate(num));
    }


}