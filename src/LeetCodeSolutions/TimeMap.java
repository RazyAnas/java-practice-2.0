package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
        private Map<String, List<Pair>> store;

        public TimeMap() {
            store = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!store.containsKey(key)) {
                store.put(key, new ArrayList<>());
            }
            store.get(key).add(new Pair(value, timestamp));
        }

        public String get(String key, int timestamp) {
            String res = "";
            List<Pair> values = store.getOrDefault(key, new ArrayList<>());

            int l = 0, r = values.size() - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (values.get(m).time <= timestamp) {
                    res = values.get(m).val;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return res;
        }

        private static class Pair {
            String val;
            int time;
            Pair(String v, int t) {
                this.val = v;
                this.time = t;
            }
        }

}
