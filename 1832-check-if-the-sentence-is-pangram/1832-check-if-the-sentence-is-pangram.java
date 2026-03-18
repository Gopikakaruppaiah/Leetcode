class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean a[]=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(c>='a' && c<='z'){
               a[c-'a']=true;
            }
            else if(c>='A'  && c<='Z'){
                a[c-'A']=true;
            }
        }
        for(boolean b:a)
        {
            if(!b) return false;
        }
        
            return true;

    }
}