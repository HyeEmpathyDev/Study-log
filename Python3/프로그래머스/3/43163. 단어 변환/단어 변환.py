from collections import deque

def solution(begin, target, words):
    if target not in words:
        return 0

    q = deque([(begin, 0)])
    visited = {begin} 

    while q:
        word, count = q.popleft()

        if word == target:
            return count

        for w in words:
            if w not in visited:
                if sum(c1 != c2 for c1, c2 in zip(word, w)) == 1:
                    visited.add(w)
                    q.append((w, count + 1))
    
    return 0