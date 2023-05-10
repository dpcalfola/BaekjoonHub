"""
https://www.acmicpc.net/problem/5988
"""
import sys

t: int = int(sys.stdin.readline().rstrip())

for _ in range(t):
    # Read input value as string
    # Then take last character and convert it to integer
    input_str: str = sys.stdin.readline().rstrip()
    last_int: int = int(input_str[-1])

    if last_int % 2 == 0:
        print("even")
    else:
        print("odd")
