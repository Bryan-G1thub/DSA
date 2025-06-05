import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        for (int i = 0; i < strs.length; i++) {
            map.computeIfAbsent(i, k -> new ArrayList<>()).add(strs[i]);
        }

        System.out.println(map);
    }
}