class Solution {
    public int mySqrt(int x) {
        if(x<2)
            return x;
        int start=0;
        int end = x;
        int mid = 0;
        while(true)
        {
            mid=(start+end)/2;
            if(mid<=x/mid&&(mid+1)>(x/(mid+1)))
                return mid;
            else if(mid>x/mid)
                end=mid-1;
            else
                start=mid+1;
        }
    }
}
