def solution(s):
    if len(s) == 1:
        return 1

    min_len = len(s)

    for step in range(1, len(s) // 2 + 1):
        compressed = ''
        prev = s[:step]
        count = 1

        for i in range(step, len(s), step):
            cur = s[i:i+step]
            if cur == prev:
                count += 1
            else:
                compressed += (str(count) + prev) if count > 1 else prev
                prev = cur
                count = 1

        compressed += (str(count) + prev) if count > 1 else prev
        min_len = min(min_len, len(compressed))

    return min_len
