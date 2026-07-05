class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int k=0;
        for(int i=0;i<n; i++){
            for(int j=i; j<n; j++){
                if(nums[i]==nums[j]) k++;
            }
            if(k>n/2) return nums[i];
        }
        return k;
    }
}