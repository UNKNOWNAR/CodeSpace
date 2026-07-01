class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> coords = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    coords.add(temp);
                }
            }
        }
        for(int i=0;i<coords.size();i++){
            int x = coords.get(i).get(0);
            int y = coords.get(i).get(1);
            for(int j=0;j<n;j++)
                matrix[x][j] = 0;
            for(int j=0;j<m;j++)
                matrix[j][y] = 0;
        }
        return;
    }
}
