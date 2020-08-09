class Solution {
    public List<String> simplifiedFractions(int n) {
        Set<Double> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        String s ="";
        double d = (double)0;
        for(int i=1;i<n;i++){
            for(int j =2;j<=n;j++)
            {
                if(i/j==1 || i>j)
                    continue;
                else{
                    d = (double)i/(double)j;
                   if(!set.contains(d))
                   { 
                    s = ""+i+"/"+j;
                    list.add(s);
                   }
                    set.add(d);
                }
                    
        }
        }
        
        return list;
        
    }
}
