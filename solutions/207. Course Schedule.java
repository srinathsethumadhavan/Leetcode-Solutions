class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[numCourses];
        for(int[] pre :prerequisites )
            indegree[pre[0]]++;
        
        for(int i=0;i<numCourses;i++)
            if(indegree[i]==0)
                queue.add(i);
        
        if(queue.isEmpty()==true)
            return false;
        
        while(queue.isEmpty()!=true){
            int c = queue.poll();
            for(int[] pre : prerequisites)
            {
                if(c==pre[1]){
                    indegree[pre[0]]--;
                if(indegree[pre[0]]==0)
                    queue.add(pre[0]);
                }
                    
            }
        }
        
        for(int i : indegree)
            if(i!=0)
                return false;
        return true;
    }
}
