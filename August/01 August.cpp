// DFS of graphs

class Solution {
    unordered_map<int,bool>visited;
    vector<int>ans;
  
     void dfs(int node,vector<int>adj[]){
      ans.push_back(node);
      visited[node]=true;
      
      // traversee all children nodes
      for(auto children:adj[node]){
          if(!visited[children]){
              dfs(children,adj);
              }
         }
      }
    // Function to return a list containing the DFS traversal of the graph.
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        // Code here
        dfs(0,adj);
        return ans;
    }
};