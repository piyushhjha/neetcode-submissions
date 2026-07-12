class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        //if (n<=k) return nums;
        //else{
        int arr[] = new int[n - k + 1];;
        int z=0;
        

        for(int i=0; i<=n-k; i++){
            int max = nums[i];
            for(int j=i; j<i+k; j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            arr[z] = max;
            z++;
        }
        return arr;
    }
}//}
