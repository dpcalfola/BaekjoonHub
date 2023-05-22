"""
https://www.acmicpc.net/problem/27110
"""
import sys

n: int = int(sys.stdin.readline().rstrip())
favorite_list: list = list(map(int, sys.stdin.readline().split()))

satisfied_people: int = 0

for f in favorite_list:
    satisfied_people += min(f, n)

print(satisfied_people)
