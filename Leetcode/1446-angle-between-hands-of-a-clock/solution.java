class Solution {
    public double angleClock(int hour, int minutes) {
        double ang1 = (6*minutes)%360;
        double ang2 = (30*hour+minutes/2.0)%360;
        double val = Math.abs(ang1-ang2);
        return Math.min(val,360-val);
    }
}
