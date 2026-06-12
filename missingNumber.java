class Solution {
    public int missingNumber(int[] nums) {
    int sum=0;
    int arraysum=0;
    for(int i=0;i<=nums.length;i++){
     sum=sum+i;   
    }
    for(int i=0;i<nums.length;i++){
    arraysum=arraysum+nums[i];    
    }
    return sum-arraysum;
    }
}
