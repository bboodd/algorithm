import heapq
import sys

INF = int(1e9)

n, e = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n+1)]

for _ in range(e):
    x, y, cost = map(int, sys.stdin.readline().split())
    graph[x].append((y, cost))
    graph[y].append((x, cost))

def dijkstra(start, end):
    distance = [INF] * (n+1)
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        if distance[now] < dist:
            continue

        for i in graph[now]:
            cost = dist + i[1]

            if distance[i[0]] > cost:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance[end]

v1, v2 = map(int, sys.stdin.readline().split())

v1_path = dijkstra(1, v1) + dijkstra(v1, v2) + dijkstra(v2, n)
v2_path = dijkstra(1, v2) + dijkstra(v2, v1) + dijkstra(v1, n)

answer = min(v1_path, v2_path)
print(answer if answer < INF else -1)
