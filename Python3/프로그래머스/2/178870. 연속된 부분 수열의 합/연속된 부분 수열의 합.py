def solution(sequence, k):
    n = len(sequence)
    left = right = total = 0
    answer = []

    min_len = n + 1  # 아주 큰 값으로 초기화

    while right <= n:
        if total < k:
            if right == n: break
            total += sequence[right]
            right += 1
        else:
            if total == k and (right - left) < min_len:
                min_len = right - left
                answer = [left, right - 1]
            total -= sequence[left]
            left += 1

    return answer
