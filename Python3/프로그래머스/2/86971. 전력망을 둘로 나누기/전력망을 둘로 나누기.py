def solution(n, wires):
    def dfs(x, g, v):
        v[x] = 1
        return 1 + sum(dfs(i, g, v) for i in g[x] if not v[i])
    
    ans = n
    for i in range(len(wires)):
        g = [[] for _ in range(n+1)]
        for j, (a, b) in enumerate(wires):
            if i != j:
                g[a].append(b)
                g[b].append(a)
        v = [0] * (n+1)
        cnt = dfs(1, g, v)
        ans = min(ans, abs(n - 2 * cnt))
    return ans
