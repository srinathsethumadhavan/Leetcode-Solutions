class Solution {
    public List<Integer> addToArrayForm(int[] A, int k) {
     
        int n=0;
        int K=k;
       int count= new String(k+"").length();
        int [] B = new int[count];
        int l=Math.max(A.length,B.length);
        
        List<Integer> list= new ArrayList<>();
        while(k>0){
          B[n++]= k%10;
          k/=10;
      }
         int e=0;
        int f=B.length-1;
        while(e<f)
        {
            int temp= B[e];
            B[e]=B[f];
            B[f]=temp;
            e++;
            f--;
        }
        
        int i=A.length-1;
         int j=B.length-1;
        int sum=0;
        int carry=0;
        while(i>=0 || j>=0)
        {
            sum=carry;
            if(i>=0)
                sum+=A[i--];
            if(j>=0)
                sum+=B[j--];
            list.add(0,sum%10);
            carry=sum/10;
            
        }
        if(carry>0)
           list.add(0,carry);       
  return list;
    }
}