class Solution {
    public static boolean isSubsequence(String s, String t) {
      char[] first = s.toCharArray();
      char[] second = t.toCharArray();
      int firstCounter = 0;
      int secondCounter = 0;
      while(firstCounter<first.length && secondCounter<second.length){
        if(first[firstCounter] == second[secondCounter]){
           firstCounter++;
        }
        secondCounter++;
      }
      return firstCounter == first.length;
    }  
}
