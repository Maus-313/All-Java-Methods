import java.util.PriorityQueue;

class Solution {
    static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        if(stones.length==1){
            return stones[0];
        }
        for(int i:stones){
            maxHeap.add(i);
        }
        while(maxHeap.size()!=0 || maxHeap.size()!=1){
            int hs=maxHeap.poll();  // heavy stone
            int shs=maxHeap.poll(); // second heavy stone
            int smash=hs-shs;   
            if(smash>0){
                maxHeap.add(smash);
            }
        }
        if(maxHeap.size()!=0){
            return maxHeap.poll();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        lastStoneWeight(stones);
    }
}