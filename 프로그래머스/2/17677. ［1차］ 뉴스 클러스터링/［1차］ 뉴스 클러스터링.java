import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        List<String> list1 = strToSet(str1);
        List<String> list2 = strToSet(str2);
        
        if(list1.size() == 0 && list2.size() == 0) {
            return 65536;
        }
        
        Map<String, Integer> map1 = setToMap(list1);
        Map<String, Integer> map2 = setToMap(list2);
        
        int inter = 0;
        int union = 0;
        
        for(String key1 : map1.keySet()) {
            if(map2.containsKey(key1)) {
                inter += Math.min(map1.get(key1), map2.get(key1));
                union += Math.max(map1.get(key1), map2.get(key1));
            } else {
                union += map1.get(key1);
            }
        }
        
        for(String key2 : map2.keySet()) {
            if(map1.containsKey(key2)) {
                continue;
            } else {
                union += map2.get(key2);
            }
        }
        
        float result = ((float)inter / union) * 65536;
        
        answer = (int) result;
        
        return answer;
    }
    
    public List<String> strToSet(String str) {
        List<String> list = new ArrayList<>();
        
        String temp = "";
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            char lc = Character.toLowerCase(c);
            
            if(Character.isLetter(lc)) {
                temp += lc;
                
                if(temp.length() == 2) {
                    list.add(temp);
                    temp = temp.substring(1);
                }
            } else {
                temp = "";
            }
        }
        
        return list;
    }
    
    public Map<String, Integer> setToMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : list) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }
        
        return map;
    }
}