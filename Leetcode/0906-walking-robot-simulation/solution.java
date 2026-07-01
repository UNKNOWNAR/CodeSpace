class Solution {
    final int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacle = new HashSet<>();
        for(int arr[]:obstacles)
            obstacle.add(String.valueOf(arr[0])+","+String.valueOf(arr[1]));
        int direction = 0;
        int x =0,y=0;
        int ans = 0;
        for(int command:commands){
            if(command==-1)
                direction = (direction+1)%4;
            else if(command==-2)
                direction = (direction-1+4)%4;
            else{
                for(int i=0;i<command;i++){
                    x+= directions[direction][0];
                    y+= directions[direction][1];
                    String key = String.valueOf(x)+","+String.valueOf(y);
                    if(obstacle.contains(key)){
                        x-= directions[direction][0];
                        y-= directions[direction][1];
                        break;
                    }
                    ans = Math.max(ans,x*x+y*y);
                }
            }
        }
        return ans;
    }
}
