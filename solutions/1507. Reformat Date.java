class Solution {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        HashMap<String,String> map = new  HashMap<>();
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");              
        String Date =str[0].replaceAll("[^0-9]", ""); 
        if(Integer.parseInt(Date)<=9)
            Date="0"+Date;

        return str[2]+"-"+(String)map.get(str[1])+"-"+Date;
    }
}