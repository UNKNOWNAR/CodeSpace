class Solution {
public:
    int findDay(string date,vector<int>& cumMonth){
        int month = stoi(date.substr(0,2));
        int days = stoi(date.substr(3));
        return cumMonth[month-1]+days;
    } 
    int countDaysTogether(string arriveAlice, string leaveAlice, string arriveBob, string leaveBob) {
        vector<int> monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        vector<int> cumMonth(13,0);
        cumMonth[1] = 31;
        for(int i=2;i<=12;i++)
            cumMonth[i] = cumMonth[i-1]+monthDays[i-1];
        int arriveAliceDay = findDay(arriveAlice,cumMonth);
        int leaveAliceDay = findDay(leaveAlice,cumMonth);
        int arriveBobDay = findDay(arriveBob,cumMonth);
        int leaveBobDay = findDay(leaveBob,cumMonth);
        int overlap = min(leaveAliceDay,leaveBobDay)-max(arriveAliceDay,arriveBobDay)+1;
        return overlap<0?0:overlap;
    }
};