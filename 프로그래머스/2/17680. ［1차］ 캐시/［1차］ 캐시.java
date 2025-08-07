import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Map<String, Integer> cacheMap = new HashMap<>();
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cacheMap.containsKey(city)) {
                mapValuesAddOne(cacheMap);
                cacheMap.replace(city, 0);
                answer += 1;
                
            } else {
                if (cacheMap.size() < cacheSize) {
                    mapValuesAddOne(cacheMap);
                    cacheMap.put(city, 0);
                    answer += 5;
                    
                } else {
                    mapValuesAddOne(cacheMap);
                    String maxKey = "";
                    Integer maxValue = 0;
                    
                    for (Map.Entry<String, Integer> entry : cacheMap.entrySet()) {
                        if (entry.getValue() > maxValue) {
                            maxKey = entry.getKey();
                            maxValue = entry.getValue();
                        }
                    }
                    
                    cacheMap.remove(maxKey);
                    cacheMap.put(city, 0);
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
    
    public void mapValuesAddOne(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), entry.getValue() + 1);
        }
    }
}