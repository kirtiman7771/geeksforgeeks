// Queue Reversal
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
     ArrayList<Integer> a=new ArrayList<>();
        int i=0;
        while(!q.isEmpty()){
            a.add(q.remove());
            i++;
        }
        i--;
        while(i>=0){
            int h=a.get(i);
            q.add(h);
            i--;
        }
        return q;
    }
}