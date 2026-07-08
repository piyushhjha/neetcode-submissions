class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String st = str.toLowerCase();
        int n = st.length();
        String res ="";
        for(int i=n-1; i>=0; i--){
            res = res+st.charAt(i);
        }
        if(st.equals(res))return true;
        else return false;
    }
}
