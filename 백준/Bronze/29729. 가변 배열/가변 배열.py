import sys


class VariableSizeList:

    def __init__(self, size: int):
        # size of list
        self.size = size
        # num of elements in list
        self.num_elements = 0

    def append(self):
        if self.num_elements < self.size:
            self.num_elements += 1
            return
        if self.num_elements == self.size:
            self.size *= 2
            self.num_elements += 1
            return
        if self.num_elements > self.size:
            print("Error: num_elements > size")
            return

    def pop(self):
        self.num_elements -= 1

    def return_size(self) -> int:
        return self.size

    def return_num_element(self) -> int:
        return self.num_elements


input_list = list(map(int, sys.stdin.readline().split()))

init_size: int = input_list[0]
num_order: int = input_list[1] + input_list[2]

var_list = VariableSizeList(size=init_size)

for i in range(num_order):
    order: int = int(sys.stdin.readline().rstrip())
    if order == 1:
        var_list.append()
    if order == 0:
        var_list.pop()

answer = var_list.return_size()
print(answer)
