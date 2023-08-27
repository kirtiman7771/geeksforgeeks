// Reverse a String

class Solution
{
    public:
    string reverseWord(string str)
    {
        // Your code goes here
    int i=0,j=str.length()-1;
        while(i<j)
        {
            int temp;
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return str;
    }
};