from typing import List, Tuple
from itertools import combinations

def solution(nums: List[int]) -> int:
    is_prime = [False, False] + [True for _ in range(1000 + 999 + 998 - 1)]
    
    for number in range(2, int(len(is_prime) ** (1 / 2)) + 1):
        if is_prime[number]:
            for multiple in range(number * 2, len(is_prime), number):
                is_prime[multiple] = False
                
    return sum(map(lambda combination: 1 if is_prime[sum(combination)] else 0, combinations(nums, 3)))