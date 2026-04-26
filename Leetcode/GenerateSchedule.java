package LeetCode.contset.Biweekly_Contest165;

import java.util.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 13-09-2025
 */
public class GenerateSchedule {
    public int[][] generateSchedule(int n) {
        if(n<4)
            return new int[0][0];
        int day = n*(n-1);
        int schedule[][] = new int[day][2];
        HashSet<String> set = new HashSet<>();
        schedule[0][0]=0;
        schedule[0][1]=1;
        String key = 0+""+1;
        set.add(key);
        for(int i=1;i<day;i++){
            boolean added = false;
            int h = schedule[i-1][0];
            int a = schedule[i-1][1];
            for(int j=0;j<n;j++){
                if(added)
                    break;
                if(j==h||j==a)
                    continue;
                for(int k = 0; k <n; k++){
                    if(j==k||k==h||k==a||set.contains(j+""+k))    continue;
                    schedule[i][0]=j;
                    schedule[i][1]=k;
                    set.add(j+""+k);
                    added = true;
                    break;
                }
            }
        }
        return schedule;
    }
    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        GenerateSchedule obj = new GenerateSchedule();
        obj.generateSchedule(5);
    }
}