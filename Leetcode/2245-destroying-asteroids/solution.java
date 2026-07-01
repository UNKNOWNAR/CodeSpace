class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long mass_planet = mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=mass_planet)
                mass_planet += asteroids[i];
            else
                return false;
        }
        return true;
    }
}
