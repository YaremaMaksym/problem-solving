package org.xsakon.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class N_FavoriteGame {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        Map<Integer, Integer> statistic = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            int id = Integer.parseInt(s[0]);
            int time = Integer.parseInt(s[1]);

            if (!statistic.containsKey(id)) {
                statistic.put(id, time);
            }
            else {
                statistic.replace(id, statistic.get(id) + time);
            }
        }

        int favoriteGameId = 0;
        int maxTime = 0;
        for (Map.Entry<Integer, Integer> entry: statistic.entrySet()) {
            if (maxTime < entry.getValue()) {
                maxTime = entry.getValue();
                favoriteGameId = entry.getKey();
            }
        }

        System.out.println(favoriteGameId);
        in.close();
    }
}
