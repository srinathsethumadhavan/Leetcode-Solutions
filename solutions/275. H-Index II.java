class Solution {
    public int hIndex(int[] citations) {
        
        int n = citations.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            if(citations[mid]==n-mid)
                return citations[mid];
            else if(citations[mid]>n-mid)
                high = mid-1;
            else
                low=mid+1;
        }
        return n-low;
    }
}
