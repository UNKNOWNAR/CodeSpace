class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        for(int i=0;i<2;i++){
            if(arr1[i]==arr2[i+2]&&arr2[i]==arr1[i+2]){
                char temp = arr1[i];
                arr1[i] = arr1[i+2];
                arr1[i+2] = temp;
            }
        }
        for(int i=0;i<2;i++){
            if(arr1[i]==arr2[i+2]&&arr2[i]==arr1[i+2]){
                char temp = arr2[i];
                arr2[i] = arr2[i+2];
                arr2[i+2] = temp;
            }
        }
        for(int i=0;i<4;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
