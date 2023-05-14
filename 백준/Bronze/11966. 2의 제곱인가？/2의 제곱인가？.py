"""
https://www.acmicpc.net/problem/11966
"""
import sys

# Make list for Square numbers of 2
# Range: N(1 ≤ N ≤ pow(2,30))
# CAUTION: 2^^0 is 1
square_2: list = [pow(2, i) for i in range(0, 31)]

n: int = int(sys.stdin.readline().rstrip())

if n in square_2:
    print(1)
else:
    print(0)
