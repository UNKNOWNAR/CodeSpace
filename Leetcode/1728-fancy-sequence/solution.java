class Fancy {
    long mod = (long)1e9+7;
    List<Long> list;
    long add;
    long multiply;
    private long pow(long a,long b){
        if(b==0)    return 1;
        long half = pow(a,b>>1);
        long result = (half*half)%mod;
        if((b&1)==1)
            result = (a*result)%mod;
        return result;
    }

    public Fancy() {
        list = new ArrayList<>();
        multiply = 1;
    }
    
    public void append(int val) {
        long x = ((val-add+mod)%mod)*pow(multiply,mod-2)%mod;
        list.add(x);
    }
    
    public void addAll(int inc) {
        add = (add+inc)%mod;
    }
    
    public void multAll(int m) {
        multiply = (multiply*m)%mod;
        add = (add*m)%mod;
    }
    
    public int getIndex(int idx) {//O(1)
        if(idx<0||idx>=list.size())
            return -1;
        return (int)((list.get(idx)*multiply+add)%mod);
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
