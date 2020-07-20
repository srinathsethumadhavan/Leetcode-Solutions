class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int [] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        Arrays.sort(count);
        int res =0;
        int sum =0;
        for(int i=count.length-1;i>=0;i--){
            sum+=count[i];
            res++;
            if(sum>=arr.length/2)
                break;
            
        }
        
        return res;
    }
}




/*

Sort arr
Count frequency
Sort frequency
Loop
*/