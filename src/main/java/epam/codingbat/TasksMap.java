package epam.topic_one.codingbat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TasksMap {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove(map.remove("a"));
            map.remove(map.remove("b"));
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        String value = map.get("a");
        if (value != null) {
            map.put("b", value);
        }
        map.remove("c");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        var valueIce = map.get("ice cream");
        var valueSpinach = map.get("spinach");

        if (valueIce != null) {
            map.put("yogurt", valueIce);
        }
        if (valueSpinach != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        var valueA = map.get("a");
        var valueB = map.get("b");
        if (valueA != null && valueB == null) {
            map.put("b", valueA);
        } else if ((valueA == null && valueB != null)) {
            map.put("a", valueB);
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if ((map.containsKey("a")) && map.containsKey("b")) {
            String resultA = map.get("a");
            String resultB = map.get("b");
            String total = resultA + resultB;
            map.put("ab", total);
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }

        if (map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") != null) {
            if (map.get("a").length() != map.get("b").length()) {
                map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b")); //тернарный оп
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String string : strings) {
            if (map.containsKey(string)) {
                int count = map.get(string);
                map.put(string, count + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String symbol = s.substring(0, 1);
            if (!map.containsKey(symbol)) {
                map.put(symbol, s);
            } else {
                String result = map.get(symbol);
                result = String.format("%s%s", result, s);
                map.put(symbol, result);
            }
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Arrays.sort(strings);
        return strings;
    }


    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String firstSymbol = s.substring(0, 1);
            String lastSymbol = s.substring(s.length() - 1);
            map.put(firstSymbol, lastSymbol);
        }
        return map;
    }

   /* public String wordAppend(String[] strings) {
        Map<String, Integer> mapforString = new HashMap();
        String resultFromArray = "";
        for (String string : strings) {
            if (mapforString.containsKey(string)) {
                int count = mapforString.get(string);
                mapforString.put(string, count + 1);
            } else {
                mapforString.put(string, 1);
            }
        }
        for (String key : mapforString.keySet()) {
              if (mapforString.get(key) % 2 == 0) {
                int i = mapforString.get(key) / 2;
                        while (i > 0){
                            resultFromArray = resultFromArray + key;
                            i--;
                        }
            }
        }
        return resultFromArray;
    }*/


}
