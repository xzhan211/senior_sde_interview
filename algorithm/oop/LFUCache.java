import java.util.*;
class LFUCache {
    int minFreq;
    int cap;
    Map<Integer, Integer> keyToVal;
    Map<Integer, Integer> keyToFreq;
    Map<Integer, LinkedHashSet<Integer>> freqToKeys;
    public LFUCache(int capacity) {
        cap = capacity;
        minFreq = 0;
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();
    }

    public int get(int key) {
        if(!keyToVal.containsKey(key)) return -1;
        increaseFreq(key);
        return keyToVal.get(key);
    }

    private void increaseFreq(int key){
        int curFreq = keyToFreq.get(key);
        keyToFreq.put(key, curFreq+1);
        LinkedHashSet<Integer> set = freqToKeys.get(curFreq);
        set.remove(key);
        freqToKeys.putIfAbsent(curFreq + 1, new LinkedHashSet<>());
        freqToKeys.get(curFreq + 1).add(key);
        if(set.isEmpty()){
            freqToKeys.remove(curFreq);
            if(curFreq == minFreq){
                minFreq++;
            }
        }
    }

    public void put(int key, int value) {
        if(cap == 0) return;
        if(keyToVal.containsKey(key)){
            keyToVal.put(key, value);
            increaseFreq(key);
            return;

        }
        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
        if(keyToVal.size() > cap){
            delete(freqToKeys.get(minFreq).iterator().next());
        }
        minFreq = 1;
    }

    private void delete(int key){
        keyToVal.remove(key);
        int freq = keyToFreq.get(key);
        keyToFreq.remove(key);
        LinkedHashSet<Integer> set = freqToKeys.get(freq);
        set.remove(key);
        if(set.isEmpty()){
            freqToKeys.remove(freq);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
