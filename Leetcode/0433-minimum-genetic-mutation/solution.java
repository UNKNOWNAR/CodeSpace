class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        if(startGene.equals(endGene)) return 0;
        char proteins[] = {'A','T','G','C'};
        Queue<String> queue = new LinkedList<>();
        Set<String> allStates = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for(String gene:bank)
            allStates.add(gene);
        queue.offer(startGene);
        if(!allStates.contains(endGene))
            return -1;

        int count = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0;k<size;k++){
                startGene = queue.poll();
                for(int i=0;i<8;i++){
                    for(int j=0;j<4;j++){
                        String gene = startGene.substring(0,i)+proteins[j]+startGene.substring(i+1);
                        if(gene.compareTo(endGene)==0)
                            return count+1;
                        if(allStates.contains(gene)&&!visited.contains(gene)){
                            visited.add(gene);
                            queue.offer(gene);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
