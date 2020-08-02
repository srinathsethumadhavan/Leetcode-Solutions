class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<tasks.length;i++)
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        queue.addAll(map.values());
        int cycles =0;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<n+1;i++){
                if(!queue.isEmpty())
                    list.add(queue.remove());
            }
            for(int i :list){
                if(--i>0)
                    queue.add(i);
            }
            cycles+=queue.isEmpty()? list.size():n+1;
            
        }
        return cycles;
    }
}
