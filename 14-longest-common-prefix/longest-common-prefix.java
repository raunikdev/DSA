class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String hello = strs[0];
        Boolean bro = true;
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(hello.length()>j && strs[i].length()>j){
                if(hello.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
                    hello = hello.substring(0,j);

        }
        return hello;
    }
}