"""
https://www.acmicpc.net/problem/16204
"""
import sys

n: int
m: int
k: int

n, m, k = map(int, sys.stdin.readline().rstrip().split())

back_o: int = m
back_x: int = n - m
front_o: int = k
front_x: int = n - k

back: list = [True for _ in range(back_o)] + [False for _ in range(back_x)]
front: list = [True for _ in range(front_o)] + [False for _ in range(front_x)]

cnt: int = 0

for i in range(n):
    if back[i] == front[i]:
        cnt += 1

print(cnt)
