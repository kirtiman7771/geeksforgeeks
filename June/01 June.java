// Topological sort
class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
    int[] arr = new int[V];
        Queue<Integer> qq = new LinkedList<>();
        
        for(ArrayList<Integer> aa : adj){
            for(int k : aa){
                arr[k]++;
            }
        }
        
        for(int i=0;i<V;i++){
            if(arr[i]==0) qq.add(i);
        }
        
        int j=0;
        int[] ans= new int[V];
        while(!qq.isEmpty()){
            int s= qq.poll();
            ans[j]=s;
            j++;
            
            for(int l : adj.get(s)){
                arr[l]--;
                if(arr[l]==0) qq.add(l);
            }
        }
        
        return ans;
    }
}