import sys

while True:
    sentence: str = sys.stdin.readline().rstrip('\n')

    if not sentence:
        break

    cnt_lowercase: int = 0
    cnt_uppercase: int = 0
    cnt_number: int = 0
    cnt_space: int = 0

    for char in sentence:
        if char.islower():
            cnt_lowercase += 1
        elif char.isupper():
            cnt_uppercase += 1
        elif char.isdigit():
            cnt_number += 1
        elif char == ' ':
            cnt_space += 1

    print(f'{cnt_lowercase} {cnt_uppercase} {cnt_number} {cnt_space}')
