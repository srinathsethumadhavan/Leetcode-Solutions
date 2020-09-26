class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> Triangle = new ArrayList<>();
        
        
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        Triangle.add(firstrow);
        if(numRows==0)
            return Triangle.get(numRows);
        
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> prev_row= Triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
             row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            row.add(1);
            Triangle.add(row);
        }
        return Triangle.get(numRows);
    }
}
