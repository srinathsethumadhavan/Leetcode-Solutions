class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        int[] counter = new int[n];
        List<Integer> result = new ArrayList<>();
        for(List<Integer> list: edges)
            counter[list.get(1)]=1;
            for(int i=0;i<n;i++)
                if(counter[i]==0)
                    result.add(i);
            return result; 
        
    }
}
