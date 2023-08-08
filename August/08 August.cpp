// Fraction pairs with sum 1

class Solution
{
    public:
    int countFractions(int n, int numerator[], int denominator[])
    {
        map<pair<int, int>, int> m;
        map<pair<int, int>, bool> visited;
        for(int i=0;i<n;i++){
            int n = numerator[i];
            int d = denominator[i];
            int g = __gcd(n, d);
            n = n/g;
            d = d/g;
            pair<int, int> p = {n, d};
            m[p]++;
            visited[p] = false;
        }
        
        int ans = 0;
        for(auto i:m){
            if(m[{i.first.first, i.first.second}] > 0 && m[{i.first.second-i.first.first, i.first.second}] > 0 && !visited[{i.first.first, i.first.second}] && !(i.first.first == 1 && i.first.second == 2)){
                ans += m[{i.first.first, i.first.second}]*m[{i.first.second-i.first.first, i.first.second}];
                visited[{i.first.first, i.first.second}] = true;
                visited[{i.first.second-i.first.first, i.first.second}] = true;
            }
            
            if(i.first.first == 1 && i.first.second == 2){
                ans += (m[{i.first.first, i.first.second}]*(m[{i.first.first, i.first.second}] -1))/2;
            }
        }
        return ans;
    }
};