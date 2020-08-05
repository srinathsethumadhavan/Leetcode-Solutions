class Solution {
    public int compareVersion(String version1, String version2) {
        
        if(version1.length()==0 || version2.length()==0 || version1==null || version2==null)
            return 0;
        List<String> list1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
        List<String> list2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));
        while(list1.size()<list2.size())
            list1.add("0");
        while(list2.size()<list1.size())
            list2.add("0");
        int i=0;
        while(i<list1.size())
        {
            int a = Integer.parseInt(list1.get(i));
            int b = Integer.parseInt(list2.get(i));
            if(a>b)
                return 1;
            if(a<b)
                return -1;
            else
                i++;
        }
       
        return 0;
    }
}
​
/*
split the array on dot.
obtain it in the list.
make both the list size equal by appending zeros to whichever list size is small
compare the indiviadual elements in the list
if the elements are same then continue;
if you getting out of the loop then both the versions are same
*/
​
