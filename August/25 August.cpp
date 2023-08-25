// Palindrome String

class Solution{
public:	
	
	
	int isPalindrome(string S)
	{
	    // Your code goes here
	  int t = S.length();
        for(int i=0 ; i<t/2 ;i++){
            if(S[i]==S[t-(i+1)]){
                continue ;
            } else {
                return 0 ;
            }
        }
        return 1 ;
	}

};