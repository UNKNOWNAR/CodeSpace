import java.util.*;

class LRUCache {
    int capacity;
    int length;
    Node2 head;
    Node2 tail;
    Map<Integer,Node2> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.head = new Node2(0,0);
        this.tail = new Node2(0,0);
        head.next = tail;
        tail.prev = head;
        this.cache = new HashMap<>();
    }

    public void update_priority(Node2 temp){
        Node2 next = head.next;
        head.next = temp;
        if(temp.next!=null){
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
        temp.prev = head;
        temp.next = next;
        next.prev = temp;
    }


    public int get(int key) {
        if(cache.containsKey(key)){
            if(head.next !=cache.get(key))
                update_priority(cache.get(key));
            return cache.get(key).data;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            if(head.next !=cache.get(key)   )
                update_priority(cache.get(key));
            cache.get(key).data = value;
            return;
        }
        if(length==capacity){
            Node2 prev = tail.prev.prev;
            cache.remove(tail.prev.key);
            prev.next = tail;
            tail.prev = prev;
            length--;
        }
            Node2 temp = new Node2(value,key);
            cache.put(key, temp);
            update_priority(temp);
            length++;
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        System.out.println(lRUCache.get(2));
        lRUCache.put(1,1); // cache is {1=1}3
        lRUCache.put(2,2);
        System.out.println(lRUCache.get(1));// returns -1 (not found)
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));// returns -1 (not found
        lRUCache.put(4, 4);
        lRUCache.get(1);
        System.out.println(lRUCache.get(3)); //return 3
        System.out.println(lRUCache.get(4)); //return 3
    }
}


/*
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */