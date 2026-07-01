class Solution {
    public int minOperations(String s) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            list.add(new ArrayList<>());
        char[] arr = s.toCharArray();
        int acounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a')
                acounter++;
            list.get((arr[i]) - 'a').add(i);
        }
        if (acounter == arr.length)
            return 0;
        int ans = 0;
        for (int i = 1; i < 26; i++) {
            if(!list.get(i).isEmpty()) {
                list.get((i + 1) % 26).addAll(list.get(i));
                ans++;
            }
        }
        return ans;
    }
}
