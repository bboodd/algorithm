import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        s = s.substring(2,s.length()-2);
        List<List<Integer>> list = new ArrayList<>();
        
        String[] sets = s.split("\\},\\{");
        
        for(String set : sets) {
            List<Integer> temp = new ArrayList<>();
            for(String num : set.split(",")) {
                temp.add(Integer.valueOf(num));
            }
            list.add(temp);
        }
        
        list.sort(Comparator.comparingInt(List::size));
        
        List<Integer> result = new ArrayList<>();
        for(List<Integer> l : list) {
            for(int num : l) {
                if(!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}