import sys
word1, word2 = sys.stdin.readline().strip(), sys.stdin.readline().strip()
n, m = len(word1), len(word2)
dp = [[0]*(m+1) for _ in range(n+1)]

for i in range(1, n+1):
    for j in range(1, m+1):
        if word1[i-1] == word2[j-1]: # 같은 단어가 나오면
            dp[i][j] = dp[i-1][j-1] + 1 # 같은 단어 체크
        else: # 그 외부분은
            dp[i][j] = max(dp[i][j-1], dp[i-1][j]) # 왼쪽 위 중에 최대값 
print(dp[n][m])