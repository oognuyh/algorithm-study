from typing import List


def solution(numbers, target) -> int:
    def bfs(numbers: List[int], target: int, index: int) -> int:
        return (
            bfs(numbers, target - numbers[index], index + 1)
            + bfs(numbers, target + numbers[index], index + 1)
            if len(numbers) > index
            else 1
            if target == 0
            else 0
        )

    return bfs(numbers, target, 0)
