from collections import deque

def solution(dartResult):
    mapper = {
        "S": 1,
        "D": 2,
        "T": 3,
        "*": 2,
        "#": -1
    }
    dq = deque(dartResult)
    scores = [0, 0, 0]
    
    for r, score in enumerate(scores):
        scores[r] = int(dq.popleft())
        scores[r] *= (10 + int(dq.popleft())) if dq[0].isdigit() else 1
        
        scores[r] = scores[r] ** mapper[dq.popleft()]
        
        if dq and dq[0] in mapper:
            option = dq.popleft()
            scores[r] *= mapper[option]
            if option == "*" and r > 0:
                scores[r - 1] *= mapper[option]
    
    return sum(scores)