class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false;
        int i=0,j=0;
        while(i<t.length()){
            if(j==s.length())
                break;
            else{
                if(t.charAt(i) == s.charAt(j)){
                    j++;
                }
                i++;
            }
        }
        if(j==s.length())   return true;
        else return false;
    }
}