class AuctionSystem {
    private class Bid{
        int userId;
        int bidAmount;
        Bid(int userId,int bidAmount){
            this.userId = userId;
            this.bidAmount = bidAmount;
        }
    }
    private Map<Integer,Map<Integer,Integer>> itemUserBid;//Item->User->Bid
    private Map<Integer,PriorityQueue<Bid>> itemHeaps;//Item->MaxHeap
    public AuctionSystem() {
        itemUserBid = new HashMap<>();
        itemHeaps = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        Map<Integer,Integer> temp = new HashMap<>();
        if(itemUserBid.containsKey(itemId))
            temp = itemUserBid.get(itemId);
        temp.put(userId,bidAmount);
        itemUserBid.put(itemId,temp);
        itemHeaps.putIfAbsent(itemId, new PriorityQueue<>((a, b) -> {
            if (b.bidAmount != a.bidAmount) return Integer.compare(b.bidAmount, a.bidAmount); 
            return Integer.compare(b.userId, a.userId);}));
        itemHeaps.get(itemId).add(new Bid(userId,bidAmount));
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        addBid(userId,itemId,newAmount);
    }
    
    public void removeBid(int userId, int itemId) {
        Map<Integer,Integer> temp = itemUserBid.get(itemId);
        temp.remove(userId);
        if(temp.size()==0){
            itemUserBid.remove(itemId);
            return;
        }
        itemUserBid.put(itemId,temp);
    }
    
    public int getHighestBidder(int itemId) {
        if(!itemUserBid.containsKey(itemId)||!itemHeaps.containsKey(itemId)||itemHeaps.get(itemId).isEmpty())
            return -1;
        PriorityQueue<Bid> pq = itemHeaps.get(itemId);
        while(!pq.isEmpty()){
            Bid temp = pq.peek();
            if(itemUserBid.get(itemId).containsKey(temp.userId)&&itemUserBid.get(itemId).get(temp.userId)==temp.bidAmount){
                return temp.userId;
            }
            pq.poll();
        }
        return -1;
    }
}

/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */
