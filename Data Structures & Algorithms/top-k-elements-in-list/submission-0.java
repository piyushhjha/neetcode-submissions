class Solution {
    public int[] topKFrequent(int[] nums, int k){
        int n = nums.length;
        int[] freq = new int[n];
        for (int i=0; i<n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            freq[i] = count;
        }
        int[] ans = new int[k];
        for (int x=0; x<k; x++){
            int max = -1;
            int index = -1;
            for (int i=0; i<n; i++){
                boolean used = false;
                for (int j=0;j<x;j++){
                    if (ans[j]==nums[i]){
                        used = true;
                        break;
                    }
                }
                if (!used && freq[i]>max){
                    max = freq[i];
                    index = i;
                }
            }
            ans[x] = nums[index];
        }
        return ans;
    }
}