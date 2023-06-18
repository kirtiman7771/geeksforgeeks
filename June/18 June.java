// Ticket Counter
class Solution {
    public static int distributeTicket(int N,int K)
    {
     int l = 1, r = N;
        while(r-l>=K){
            l+=K;
            if(r-l<K)return l;
            r-=K;
        }
        return r;    
    }
}