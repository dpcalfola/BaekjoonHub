import Foundation

let inputNum = Int(readLine()!)!

var number: Int = 1
var group = 0

for i in 0... {
	if number >= inputNum {
		break
	}
	number = number + 6*i
	group = i
}

print(group+1)
