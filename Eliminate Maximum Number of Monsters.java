import java.util.Arrays;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for (int i = 0; i < dist.length; i++) {
            if(dist[i] % speed[i] == 0){
                dist[i] = dist[i] / speed[i];
            }else {
                dist[i] = dist[i] / speed[i] + 1;
            }
        }

        Arrays.sort(dist);
        int countMonsters = 0;
        int time = 0;

        for (int i = 0; i < dist.length; i++) {
            if(time - dist[i] < 0){
                countMonsters++;
                time++;
            }else break;
        }


        return countMonsters;
    }
}
