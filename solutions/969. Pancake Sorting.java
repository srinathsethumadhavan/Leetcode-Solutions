class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i;j++)
            {
                if(arr[j]==i+1)
                {
                    flip(arr,j);
                    list.add(j+1);
                    break;
                }
            }
            
            flip(arr,i);
            list.add(i+1);
        }
        
        return list;
    }
    
    private void flip(int[] arr, int k){
        int i=0;
        int j=k;
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
this problem invloves reducing the problem size in every iteration 
​
first we pick the larget number 
we flip till that to bring it to the front
then flip the entire array to move it to the last.
the last elenemt is fixed as it is in correct place.
we push the indexes i and j into the list
i+1 and j+1 becuase indexas are numbered from 1 not from zero.
*/
