class Solution {
public:
    int secondsBetweenTimes(string startTime, string endTime) {
        int  n = startTime.size(),diff = 0, carry = 0;
        int s1 = stoi(startTime.substr(n-2,2)), s2 = stoi(endTime.substr(n-2,2));
        if(s1>s2){
            carry++;
            diff = 60+s2-s1;
        }
        else
            diff = s2-s1;
        cout<<diff<<endl;
        int m1 = stoi(startTime.substr(3,2)), m2 = stoi(endTime.substr(3,2));
        if(m1>m2-carry){
            diff += (60+m2-carry-m1)*60;
            carry = 1;
        }
        else{
            diff += (m2-carry-m1)*60;
            carry = 0;
        }
        cout<<diff<<endl;
        int h1 = stoi(startTime.substr(0,2)), h2 = stoi(endTime.substr(0,2));
        if(h1>h2-carry){
            diff += (60+h2-carry-h1)*60*60;
            carry = 1;
        }
        else
            diff += (h2-carry-h1)*60*60;
        return diff;
    }
};