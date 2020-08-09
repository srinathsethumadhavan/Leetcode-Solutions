class Solution {
    public List<String> simplifiedFractions(int n) {
        Set<Double> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        String s ="";
        double d = (double)0;
        for(int i=1;i<n;i++){
            for(int j =2;j<=n;j++)
            {
                if(i/j!=1 && i<j)
                    
               {
                    d = (double)i/(double)j;
                   if(!set.contains(d))
                   { 
                    s = ""+i+"/"+j;
                    list.add(s);
                   set.add(d);
                   }
                   
                }
                    
        }
        }
        
        return list;
        
    }
}
​
/*
we need to check if the i/j becomes 1 . we should not include it. 1 is not afraction
then also we should check if i< j  eg: 4/2 is not a fraction. it  is a whole number 
we need only fractions
​
*/
