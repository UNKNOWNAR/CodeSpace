class LinkedNode{
    LinkedNode prev;
    LinkedNode next;
    int key;
    int val;

    LinkedNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {

    Map<Integer, LinkedNode> map;
    LinkedNode head;
    LinkedNode last;
    int capacity;
    
    public LRUCache(int capacity) {
        head = new LinkedNode(-1, -1);
        last = new LinkedNode(-1, -1);
        last.prev = head;
        head.next = last;
        map = new HashMap();
        this.capacity = capacity;
    }
    
    public int get(int key) {
    //Map<Integer, LinkedNode> Viewmap = map;

        if (!map.containsKey(key)){
            return -1;
        }

        LinkedNode node = map.get(key);
        moveNodeToEnd(node);

        return node.val;
    }
    
    public void put(int key, int value) {
    //Map<Integer, LinkedNode> Viewmap = map;

        //printLink("Put Start: ");
        if (!map.containsKey(key)){
            LinkedNode node = new LinkedNode(key, value);
            //printNode(last);
            node.next = last;
            node.prev = last.prev;
            //printNode(node);
            node.prev.next = node;
            //printNode(node);
            last.prev = node;            
            //printNode(last);
            //printLink("");
            if(map.size() == capacity){
                map.remove(head.next.key);
                head = head.next;
            }
            map.put(key, node);
        } else {
            LinkedNode node = map.get(key);
            node.val = value;
            moveNodeToEnd(node);
        }
        //printLink("Put End: ");
    }

    private void moveNodeToEnd(LinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = last.prev;
        node.next = last;
        last.prev.next = node;
        last.prev = node;
    }

    private void printLink(String message){
        LinkedNode node = head;
        StringBuilder str = new StringBuilder(message);
        while(node.next != null){
            str.append(node.val).append(" -> ");
            node = node.next;
        }
        str.append(node.val);
        System.out.println(str);
    }

    private void printNode(LinkedNode node){
        StringBuilder str = new StringBuilder();
        str.append(node.prev == null? -2:node.prev.key).append(" <- ").append(node.key).append(" -> ").append(node.next == null?-2:node.next.key);
        System.out.println(str);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
