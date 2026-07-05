class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        for(int i=0; i<s.length(); i++){
            if (c[i] != ch[i]) {
                return false;
            }
        }
        return true;
    }
}
