import java.util.*;

class Solution {
    static int LEFT = 0;
    static int UP = 1;
    static int RIGHT = 2;
    static int DOWN = 3;
    
    public int solution(String dirs) {
        int answer = 0;
        
        int[][][] board = new int[11][11][4];
        
        int x = 5;
        int y = 5;
        
        for(int i=0; i<dirs.length(); i++) {
            char c = dirs.charAt(i);
            switch(c) {
                case 'L':
                    if(x-1 >= 0) {
                        if(board[x][y][LEFT] == 0) {
                            board[x][y][LEFT] = 1;
                            board[x-1][y][RIGHT] = 1;
                            answer += 1;
                        }
                        x -= 1;
                    }
                    break;
                case 'U':
                    if(y+1 < 11) {
                        if(board[x][y][UP] == 0) {
                            board[x][y][UP] = 1;
                            board[x][y+1][DOWN] = 1;
                            answer += 1;
                        }
                        y += 1;
                    }
                    break;
                case 'D':
                    if(y-1 >= 0) {
                        if(board[x][y][DOWN] == 0) {
                            board[x][y][DOWN] = 1;
                            board[x][y-1][UP] = 1;
                            answer += 1;
                        }
                        y -= 1;
                    }
                    break;
                case 'R':
                    if(x+1 < 11) {
                        if(board[x][y][RIGHT] == 0) {
                            board[x][y][RIGHT] = 1;
                            board[x+1][y][LEFT] = 1;
                            answer += 1;
                        }
                        x += 1;
                    }
                    break;
            }
        }
        
        return answer;
    }
}