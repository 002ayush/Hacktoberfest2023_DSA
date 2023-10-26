//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftheight = new int[n];
        int[] rightheight = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0;i < n;++i){
            max1 = Math.max(height[i],max1);
            leftheight[i] = max1;
        }
        for(int i = n-1;i >= 0;--i){
            max2 = Math.max(height[i],max2);
            rightheight[i] = max2;
        }

        int trapped_water = 0;
        for(int i = 0;i < n;++i){
            trapped_water += Math.min(leftheight[i],rightheight[i])-height[i];


        }
        return trapped_water;
    
    }

  public static void main(String[] args) 
    { 
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; 
        
  
        System.out.println(trap(arr)); 
    } 
}
