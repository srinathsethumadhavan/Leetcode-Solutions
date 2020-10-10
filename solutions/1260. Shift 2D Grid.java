class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[] array = new int[m*n];
        int a=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                array[a++]=grid[i][j];
        }
        
        int shifts = k%(m*n);
        int l = array.length;
        reverse(array,0,l-1);
        reverse(array,0,shifts-1);
        reverse(array,shifts,l-1);
        
        a=0;
        List<List<Integer>> mainList = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++)
                list.add(array[a++]);
            
            mainList.add(list);
        }
        
        return mainList;
    }
    
    
    public void reverse(int[] arr ,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
​
​
​
/*
instead of shitng the 2 d arrya directly, flatten the 2d array to 1 d array 
​
and rotate 4 times right 
rotate clockwise 
the number of shifts require dis calculated using  
shifts = k%(m*n)
*/
