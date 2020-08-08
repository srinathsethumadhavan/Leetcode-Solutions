class Solution {
    public boolean isBoomerang(int[][] points) {
        
        int[] a = points[0];
        int [] b = points[1];
        int [] c = points[2];
        
        double s1 = Math.abs((c[1]-b[1])*(a[0]-b[0]));
         double s2 = Math.abs((a[1]-b[1])*(b[0]-c[0]));
        double s3 =  Math.abs((a[0]-b[0])*(c[1]-a[1]));
         double s4 =  Math.abs((c[0]-a[0])*(a[1]-b[1]));        
        if(s1==s2 &&  s4==s3)
            return false;
        return true;
            
    }
}
