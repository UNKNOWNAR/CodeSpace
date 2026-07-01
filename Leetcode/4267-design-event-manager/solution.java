class EventManager {
    private class Pair{
        int eventId;
        int priority;
        Pair(int eventId,int priority){
            this.eventId = eventId;
            this.priority = priority;
        }
    }
    PriorityQueue<Pair> maxHeap;
    Map<Integer,Integer> map;
    public EventManager(int[][] events) {
        map = new HashMap<>();
        maxHeap = new PriorityQueue<>((a,b)->{
            if(a.priority!=b.priority)
                return Integer.compare(b.priority,a.priority);
            return Integer.compare(a.eventId,b.eventId);
        });
        for(int event[]:events){
            maxHeap.add(new Pair(event[0],event[1]));
            map.put(event[0],event[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        if(map.containsKey(eventId)){
            map.put(eventId,newPriority);
            maxHeap.add(new Pair(eventId,newPriority));
        }
    }
    
    public int pollHighest() {
        if(maxHeap.size()==0)
            return -1;
        while(!maxHeap.isEmpty()){
            Pair Peek = maxHeap.poll();
            if(!map.containsKey(Peek.eventId))
                continue;
            else{
               
                if(map.get(Peek.eventId)==Peek.priority){
                    map.remove(Peek.eventId);
                    return Peek.eventId;
                }
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
