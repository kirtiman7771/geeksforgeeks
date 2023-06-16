// Min Time
class Solution {
    public static long minTime(int n, int[] locations, int[] types) {
        // code here
        Map<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int t=types[i],l=locations[i];
            if(map.containsKey(t))
            {
                int[]arr=map.get(t);
                arr[0]=Math.min(arr[0],l);
                arr[1]=Math.max(arr[1],l);
                arr[2]=Math.abs(arr[0]-arr[1]);
            }
            else map.put(t,new int[]{l,l,0});
        }
        int size=map.size();
        int[]arr=new int[size];
        int i=0;
        for(int key:map.keySet())arr[i++]=key;
        Arrays.sort(arr);
        long[]res=helper(map,arr,0,size);
        int[]arr2=map.get(arr[0]);
        return Math.min(res[0]+Math.abs(arr2[1]),res[1]+Math.abs(arr2[0]));
    }
    static long[] helper(Map<Integer,int[]>map,int[]arr,int index,int n)
    {
        int []arr2=map.get(arr[index]);
        int travel=arr2[2],st=arr2[0],end=arr2[1];
        if(index==n-1)
        {
            return new long[]{Math.abs(st)+travel,Math.abs(end)+travel};
        }
        long[]arr3=helper(map,arr,index+1,n);
        int nextSt=map.get(arr[index+1])[0],nextEnd=map.get(arr[index+1])[1];
        //for left
        long left=Math.min(Math.abs(nextEnd-st)+arr3[0],Math.abs(nextSt-st)+arr3[1]);
        //for right
        long right=Math.min(Math.abs(nextEnd-end)+arr3[0],Math.abs(nextSt-end)+arr3[1]);
        return new long[]{left+travel,right+travel};
    }
}