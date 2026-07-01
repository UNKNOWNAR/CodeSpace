class Solution {
    class Trio{
        int position;
        int health;
        char direction;
        int indx;
        Trio(int position,int health,char direction,int indx){
            this.health = health;
            this.position = position;
            this.direction = direction;
            this.indx = indx;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        List<Trio> robots = new ArrayList<>();
        for(int i=0;i<n;i++)
            robots.add(new Trio(positions[i],healths[i],directions.charAt(i),i));
        robots.sort(Comparator.comparingInt(p -> p.position));
        List<Trio> stack = new ArrayList<>();
        for(Trio robot:robots){
            if(robot.direction=='R'){
                stack.add(robot);
                continue;
            }
            while(stack.size()!=0){
                Trio rightRobot = stack.get(stack.size()-1);
                if(robot.position<rightRobot.position||rightRobot.direction=='L')
                    break;
                stack.remove(stack.size()-1);
                if(robot.health>rightRobot.health)
                    robot.health--;
                else if(robot.health<rightRobot.health){
                    rightRobot.health--;
                    stack.add(rightRobot);
                    robot = null;
                    break;
                }
                else{
                    robot = null;
                    break;
                }
            }
            if(robot!=null)
                stack.add(robot);
        }
        System.out.println(stack.size());
        stack.sort(Comparator.comparingInt(p -> p.indx));
        List<Integer> ans = new ArrayList<>();
        for(Trio robot:stack)
            ans.add(robot.health);
        return ans;
    }
}
