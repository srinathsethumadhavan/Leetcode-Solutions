class Solution {
    public int orangesRotting(int[][] grid) {
        
        
        if(grid==null || grid.length==0)
            return 0;
        int countFresh = 0;
        int count=0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> q  = new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                if(grid[i][j]==2)
                q.add(new int[]{i,j});
                else if(grid[i][j]==1)
                    countFresh++;
        }
        
        if(countFresh==0)
            return 0;
        while(q.isEmpty()!=true){
            count++;
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] point = q.poll();
                for(int[] d : dir){
                     int x = point[0]+d[0];
                     int y = point[1]+d[1];
                    if(x<0 || y<0 || x>=rows || y>=cols||grid[x][y]==0||grid[x][y]==2 )
                        continue;
                    grid[x][y]=2;
                    q.add(new int[]{x,y});
                    countFresh--;
                }
            }
        }
        
        return countFresh==0 ? count-1:-1;
        
        
    }
}
