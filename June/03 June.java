// Find Maximum Equal sum of Three Stacks
class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        
        int s1[]= new int[N1];
        int s2[]= new int[N2];
        int s3[]= new int[N3];
        
        s1[N1-1] = S1[N1-1];  
        s2[N2-1] = S2[N2-1];  
        s3[N3-1] = S3[N3-1];  
        
        for(int i = N1-2; i>=0; i--) s1[i] = S1[i] + s1[i+1];
        for(int i = N2-2; i>=0; i--) s2[i] = S2[i] + s2[i+1];
        for(int i = N3-2; i>=0; i--) s3[i] = S3[i] + s3[i+1];
        

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        while(p1<N1 && p2<N2 && p3<N3){
        
            int min = Math.min(s1[p1], Math.min(s2[p2], s3[p3]));
            while(p1<N1 && s1[p1]>min) p1++;
            while(p2<N2 && s2[p2]>min) p2++;
            while(p3<N3 && s3[p3]>min) p3++;
            
            if(p1<N1 && p2<N2 && p3<N3)
            if(s1[p1] == s2[p2] && s2[p2] == s3[p3]) return s1[p1];
        }
        
        return 0;
    }  
}
