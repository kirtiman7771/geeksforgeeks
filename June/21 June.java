// Reverse Coding
class Solution {
    static int sumOfNaturals(int n) {
        // code here
     int mod = (int)(Math.pow(10,9)+7);
        long res = ((long)n*(long)(n+1))/2;
        return (int)(res%mod); 
    }
};