class Solution {
public:
    int minLights(vector<int>& lights) {
        int n = lights.size();
        vector<bool> isVisible(n);
        int range = 0;
        for(int i=0;i<n;i++){
            int v = lights[i];
            if(v>0)
                range = max(range,v+1);
            if(range>0){
                isVisible[i] = true;
                range--;
            }
        }
        range = 0;
        for(int i=n-1;i>=0;i--){
            int v = lights[i];
            if(v>0)
                range = max(range,v+1);
            if(range>0){
                isVisible[i] = true;
                range--;
            }
        }
        int bulbs = 0;
        for(int i=0;i<n;i++){
            if(!isVisible[i]){
                bulbs++;
                isVisible[i] = true;
                if(i + 1 < n) isVisible[i + 1] = true;
                if(i + 2 < n) isVisible[i + 2] = true;
            }
        }
        return bulbs;
    }
};
