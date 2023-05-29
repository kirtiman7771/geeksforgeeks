// CamelCase Pattern Matching
class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
     ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
            String temp="";
            for(int j=0;j<Dictionary[i].length();j++)
            if(Dictionary[i].charAt(j)>='A' && Dictionary[i].charAt(j)<='Z' ){
                temp+=Dictionary[i].charAt(j);
            }
            int index=temp.indexOf(Pattern);
            if(index==0){
                ans.add(Dictionary[i]);
            }
            
        }
        Collections.sort(ans);
        if(ans.size()==0){
            ans.add("-1");
        }
        return ans;
    }
}