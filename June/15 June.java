// Longest Palindrome in a String
class Solution{
    static String longestPalin(String S){
        // code here
     int length = 0;
        String ans = "";
        for(int i=0; i<S.length(); i++){
            int l = i, r = i;
            while(l>=0 && r<S.length() && S.charAt(l) == S.charAt(r)){
                if(r-l+1 > length){
                    ans = S.substring(l, r+1);
                    length = r-l+1;
                }
                l--;
                r++;
            }
            l = i; r = i+1;
            while(l>=0 && r<S.length() && S.charAt(l) == S.charAt(r)){
                if(r-l+1 > length){
                    ans = S.substring(l, r+1);
                    length = r-l+1;
                }
                l--;
                r++;
            }
        }
        return ans;
    }
}

