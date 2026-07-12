class Solution{
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            sb.setLength(0); 
            for (int j=i; j<s.length(); j++) {
                char ch = s.charAt(j);
                if (sb.indexOf(String.valueOf(ch))!=-1) {
                    break;
                }
                sb.append(ch);
                max = Math.max(max, sb.length());
            }
        }
        return max;
    }
}