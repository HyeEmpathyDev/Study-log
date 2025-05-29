from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])
    visited = [[0]*m for _ in range(n)]
    visited[0][0] = 1
    queue = deque([(0, 0)])
    
    while queue:
        x, y = queue.popleft()
        for dx, dy in [(0,1),(1,0),(0,-1),(-1,0)]:
            nx, ny = x+dx, y+dy
            if 0<=nx<n and 0<=ny<m and maps[nx][ny] == 1 and visited[nx][ny] == 0:
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx, ny))
    
    return visited[n-1][m-1] if visited[n-1][m-1] else -1
