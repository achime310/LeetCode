class Solution {
    public int removeDuplicates(int[] nums) {
       
        int length = nums.length;
        
        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(nums[j]==nums[i]){
                    nums[j]=nums[length-1];
                    nums[length-1]=nums[i];
                    j--;
                    length--;
                }else if(nums[j]<nums[i]){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return length;
    }
}
