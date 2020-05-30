class Solution {
    private static String reduceLocalName(String input){
        int endLength = input.indexOf('+');
        if(endLength != -1){
            input = input.substring(0,endLength);
        }
        return input.replace(".","");
    }
    
    public int numUniqueEmails(String[] emails) {
        HashSet<String> map = new HashSet<String>();
        
        for(String email:emails){
            String localName = email.split("@")[0];
            String domainName = email.substring(localName.length());
            localName = reduceLocalName(localName);
            map.add(localName+domainName);
        }
        return map.size();
    }
}