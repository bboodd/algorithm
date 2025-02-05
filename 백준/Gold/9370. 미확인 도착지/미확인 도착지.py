import sys
import heapq

T = int(sys.stdin.readline())
INF = int(1e9)

def dijkstra(start):
    distance = [INF] * (n+1)
    heap = []
    heapq.heappush(heap, [0, start])
    distance[start] = 0

    while heap:
        weight, now = heapq.heappop(heap)

        if distance[now] < weight:
            continue

        for next, cost in graph[now]:
            if distance[next] > weight + cost:
                distance[next] = weight + cost
                heapq.heappush(heap, [distance[next], next])
        
    return distance

for _ in range(T):
    n, m, t = map(int, sys.stdin.readline().split())
    s, g, h = map(int, sys.stdin.readline().split())
    graph = [[] for _ in range(n+1)]
    answer = []

    for _ in range(m):
        a, b, d = map(int, sys.stdin.readline().split())
        if (a == g and b == h) or (a == h and b == g):
            gToh = d
        graph[a].append([b, d])
        graph[b].append([a, d])

    candidate = {}
    for _ in range(t):
        candidate[int(sys.stdin.readline().rstrip())] = 1

    distFromS = dijkstra(s)
    distFromG = dijkstra(g)
    distFromH = dijkstra(h)

    for i in candidate:
        if (distFromS[g] + gToh + distFromH[i] == distFromS[i]) or (distFromS[h] + gToh + distFromG[i] == distFromS[i]):
            answer.append(i)
    
    answer.sort()
    print(*answer)
