// Lemonade Change
class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
    if(bills[0]==10 || bills[0]==20) return false;
        int freq[] = new int[2];
        /*freq[0] is 5 bill and freq[1] is 10 bill to keep count of each bill*/
        for(int i=0;i<N;i++){
            if(bills[i]==5) freq[0]++;
            else if(bills[i]==10){
                if(freq[0]!=0){
                    freq[0]--;
                    freq[1]++;
                }
                else return false;
            }
            else{
                if(freq[0]!=0 && freq[1]!=0){
                    freq[0]--;
                    freq[1]--;
                }
                else if(freq[0]>=3 && freq[1]==0) freq[0]-=3;
                else return false;
            }
        }
        return true;
    }
}