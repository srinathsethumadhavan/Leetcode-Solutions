class Solution {
    public boolean isRectangleOverlap(int[] rect1, int[] rect2) {
        
        
        boolean xAxis= rect1[0]<rect2[2] && rect2[0] < rect1[2];
        boolean yAxis= rect1[1]<rect2[3] && rect2[1] < rect1[3];
        return xAxis && yAxis;
        
    }
}
