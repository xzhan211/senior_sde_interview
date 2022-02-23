import java.util.*;
class LRUCache {

    Map<Integer, Node> keyToNode;
    int size;
    int cap;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        size = 0;
        cap = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        keyToNode = new HashMap<>();

    }

    public int get(int key) {
        if(!keyToNode.containsKey(key)) return -1;
        Node cur = keyToNode.get(key);
        del(cur);
        addToHead(cur);
        return cur.value;
    }

    private void del(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void addToHead(Node node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }


    public void put(int key, int value) {
        if(keyToNode.containsKey(key)){
            del(keyToNode.get(key));
            keyToNode.remove(key);
            size--;
        }
        Node cur = new Node(key, value);
        keyToNode.put(key, cur);
        addToHead(cur);

        if(size == cap){
            keyToNode.remove(tail.prev.key);
            del(tail.prev);
        }else{
            size++;
        }
    }

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
