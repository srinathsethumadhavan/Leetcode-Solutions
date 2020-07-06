class Solution {
    public String reformat(String s) {
        
        
        List<Character> letters = new ArrayList<>();
        List<Character> nums = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                nums.add(c);
            } else {
                letters.add(c);
            }
        }
       
        int lettersCount= letters.size(), numCount = nums.size();
        if (Math.abs(lettersCount- numCount) >1) {
            return "";
        }
        
        if (lettersCount < numCount) {
            return print(nums, letters);
        }
        return print(letters, nums);
    }

   
    private String print(List<Character> l1, List<Character> l2) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        while (idx < l2.size()) {
            sb.append(l1.get(idx));
            sb.append(l2.get(idx++));
        }
        while (idx < l1.size()) {
            sb.append(l1.get(idx++));
        }
        return sb.toString();
    }
    }
