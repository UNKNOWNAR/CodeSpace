class TimeMap {
    private class ValueTime{
        int timestamp;
        String value;
        ValueTime(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    Map<String,List<ValueTime>> TimeStore;
    public TimeMap() {
        TimeStore = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<ValueTime> temp = new ArrayList<>();
        if(TimeStore.containsKey(key)){
            temp = TimeStore.get(key);
            temp.add(new ValueTime(value,timestamp));
        }
        else
            temp.add(new ValueTime(value,timestamp));
        TimeStore.put(key,temp);
    }
    
    public String get(String key, int timestamp) {
        if(!TimeStore.containsKey(key))
            return "";
        List<ValueTime> temp = TimeStore.get(key);
        if(temp.size()==0)
            return "";
        int low = 0;
        int high = temp.size()-1;
        String result = "";
        while(low<=high){
            int mid = (low+high)>>1;
            if(temp.get(mid).timestamp==timestamp)
                return temp.get(mid).value;
            else if(temp.get(mid).timestamp<timestamp){
                result = temp.get(mid).value; 
                low = mid + 1;
            }
            else 
                high = mid-1;
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
