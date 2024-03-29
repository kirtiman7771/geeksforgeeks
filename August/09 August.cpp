// Largest prime factor

class Solution{
public: 
    long long int largestPrimeFactor(int N){
        // code here
    long long int maxPrime = -1;
        while (N%2==0) {
            maxPrime = 2;
            N/=2;
        }
        for (int i=3; i<int(sqrt(N))+1;i+=2) {
            while (N % i == 0){
                maxPrime = i;
                N/=i;
            }
        }
      return N > 2 ? N :maxPrime;
    }
};