class Solution {
    public void perm(List<List<Integer>>ans,List<Integer>ds,boolean[]freq,int []nums,int index){
        if(index==nums.length)
        {
            ArrayList<Integer>a=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                a.add(nums[i]);
            }
            ans.add(a);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            perm(ans,ds,freq,nums,index+1);
            swap(nums,i,index);
        }
    }
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
   
    public List<List<Integer>> permute(int[] nums) {
        
       List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        perm(ans,ds,freq,nums,0);
        return ans;
    }
}