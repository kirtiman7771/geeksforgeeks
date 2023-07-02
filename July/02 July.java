// Copy Set Bits in Range
class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        int m1 = 1 << (r-l+1);
        m1--;
        m1 = m1 << l -1;
        m1 = y & m1;
        int m2 = x | m1;
        return m2;
    }
}
