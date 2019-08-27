class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int p=0,i=0,j=n-1;
        while(i<j){
            max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
//using single loop with slow and fast pointer
