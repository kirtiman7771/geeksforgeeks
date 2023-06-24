// Prefix match with other strings
class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
      int c=0;
        if(k>str.length())
            return 0;
        else{
            String r = str.substring(0,k);
         //   System.out.println("r== "+r);
            for(int i=0; i<n; i++){
           //     System.out.println(arr[i].substring(0,k));
                if(arr[i].length()>=k && arr[i].substring(0,k).equals(r)){
                    c++;
                }
            }
        }
        return c;
    }
}