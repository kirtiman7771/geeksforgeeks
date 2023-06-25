// Unique rows in boolean matrix
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
     ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<r;i++){
             ArrayList<Integer> check = new ArrayList<>();
             String res="";
            for(int j=0;j<c;j++){
                check.add(a[i][j]);
                res+= (char)a[i][j];
            }
            if(set.contains(res)){
                continue;
            }else{
                ans.add(check);
                set.add(res);
            }
        }
        return ans;
    }
}