class Solution {
    public int[][] kClosest(int[][] points, int k) {
         int[][] arr = new int[k][2];
        Arrays.sort(points,new myComparator());
       
        for(int i=0;i<k;i++)
                arr[i]=points[i];
        
        return arr;
    }
    
    class myComparator implements Comparator<int[]>{
        public int compare(int[] a,int []b){
          return (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]);
            
        }
    }
}
