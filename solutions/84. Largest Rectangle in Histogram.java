class Solution {
    public int largestRectangleArea(int[] heights) {
        int res= 0;
        for(int i=0;i<heights.length;i++){
            int curr = heights[i];
            for(int j=i-1;j>=0;j--){
                if(heights[j]>=heights[i])
                    curr+=heights[i];
                else
                    break;
            }
            //previous smaller elelemnt
            
            
            //next smaller elelemnt
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>=heights[i])
                   curr+=heights[i];
                else
                    break;
            }
            res = Math.max(res,curr);
        }
        
        return res;
    }
}