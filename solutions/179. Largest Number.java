class Solution {
    public String largestNumber(int[] nums) {
      
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,new myComparator());
        if(str[0].equals("0"))
            return "0";
        String largestNumber = new String();
        for(String number : str)
            largestNumber+=number;
        
        return largestNumber;
        
    }
    class myComparator implements Comparator<String>{
        public int compare(String a, String b){
            String order1  = a+b;
            String order2 = b+a;
            return order2.compareTo(order1);
            
        }
    }
}
​
​
/*
simply sort the string in descending order
*/
