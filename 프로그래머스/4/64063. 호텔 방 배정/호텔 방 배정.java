import java.util.*;

class Solution {
    Map<Long, Long> roomMap = new HashMap<>();
    
    public long[] solution(long k, long[] room_number) {
        int len = room_number.length;
        long[] answer = new long[len];
        
        for (int i=0;i<len;i++) {
            answer[i] = findEmptyRoom(room_number[i]);
        }
        
        return answer;
    }
    
    private long findEmptyRoom(long room) {
        if (!roomMap.containsKey(room)) {
            roomMap.put(room, room+1);
            return room;
        }
        
        long nextRoom = roomMap.get(room);
        long emptyRoom = findEmptyRoom(nextRoom);
        roomMap.put(room, emptyRoom);
        return emptyRoom;
    }
}