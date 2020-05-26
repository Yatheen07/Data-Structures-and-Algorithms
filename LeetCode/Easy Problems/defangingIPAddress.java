class Solution {
    public String defangIPaddr(String address) {
        StringBuffer result = new StringBuffer();
        for(char c : address.toCharArray()){
            if(c == '.')
                result.append("[.]");
            else
                result.append(c);
        }
        return result.toString();
    }
}