class Solution {
    public int[] minOperations(String boxes) {
        int l = boxes.length();
        int answer[] = new int[l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(boxes.charAt(j) == '1')
                    answer[i] += Math.abs(j-i);
            }
        }
        return answer;
    }
}
