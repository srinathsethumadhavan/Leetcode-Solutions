class Solution {
    public List<Integer>
        filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance)    
    {
        ArrayList<int[]> list = new ArrayList<>();
         List<Integer> idList = new ArrayList<>();
        for(int[] restaurant : restaurants)
         {
            if((veganFriendly==0 || restaurant[2]==veganFriendly )&& 
               restaurant[3]<=maxPrice && 
               restaurant[4] <=maxDistance)
                list.add(restaurant);
          }
        
        Collections.sort(list,new myComparator());
        for(int[] restaurant : list)
            idList.add(restaurant[0]);
            return idList;
        
        
    }
    
    class myComparator implements Comparator<int[]>
    {
        public int compare(int[] a,int[] b)
        {
            int rating1 = a[1];
            int rating2= b[1];
            int id1= a[0];
            int id2 = b[0];
            if(rating1==rating2)
                return id2-id1;
            else
                return rating2-rating1;
        }
    }
}
