class BusBooking {
public:
    int seats;
    int totalTime;
    vector<vector<bool>> bus;
    vector<vector<int>> seatCost;
    BusBooking(int n) {
        bus.resize(n, vector<bool>(4, false));
        seatCost.resize(n, vector<int>(4, 1));
        seats = 0;
        totalTime = 0;
    }
    
    void toggle(string seat) {
        int s = seat[0]-'A';
        int snum = stoi(seat.substr(1))-1;
        bus[snum][s] = !bus[snum][s];
        if(bus[snum][s])
            seats++;
        else
            seats--;
        if(s==1||s==2){
            if(bus[snum][s])
                totalTime++;
            else
                totalTime--;
        }
        if(s==0){
            if(bus[snum][s]){
                if(bus[snum][1])                    
                    seatCost[snum][s] = 3;
                else
                    seatCost[snum][s] = 1;
                totalTime += seatCost[snum][s];
            }
            else
                totalTime -= seatCost[snum][s];
        }
        if(s==3){
            if(bus[snum][s]){
                if(bus[snum][2])                    
                    seatCost[snum][s] = 3;
                else
                    seatCost[snum][s] = 1;
                totalTime += seatCost[snum][s];
            }
            else
                totalTime -= seatCost[snum][s];
        }
    }
    
    int getTotalTime() {
        return totalTime;
    }
    
    int getMinTime() {
        return seats;
    }
};

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking* obj = new BusBooking(n);
 * obj->toggle(seat);
 * int param_2 = obj->getTotalTime();
 * int param_3 = obj->getMinTime();
 */