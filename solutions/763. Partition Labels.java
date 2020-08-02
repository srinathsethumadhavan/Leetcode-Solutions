class Solution {
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = new int[26];
        for(int i=0;i<S.length();i++)
            arr[S.charAt(i)-'a']=i;
        int i=0;
        int end=0;
        while(i<S.length()){
            end =arr[S.charAt(i)-'a'];
            int j=i;              
            while(j!=end){
                end = Math.max(end,arr[S.charAt(j++)-'a']);
            }
             list.add(j-i+1);             
            i= j+1;              
        }
                          
             return list;             
    }
}
