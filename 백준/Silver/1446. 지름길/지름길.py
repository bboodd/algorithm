import heapq
import sys

n, d = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(d+1)]
INF = int(1e9)
distance = [INF] * (d+1)

for i in range(d):
    graph[i].append((i+1, 1))

for _ in range(n):
    a, b, cost = map(int, sys.stdin.readline().split())
    if b <= d:
        graph[a].append((b, cost))

def dijkstra(start, end):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        if dist > distance[now]:
            continue

        for i in graph[now]:
            cost = dist + i[1]

            if distance[i[0]] > cost:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance[end]

answer = dijkstra(0, d)
print(answer)
