import Foundation

let N = Int(readLine()!)!
var arr: [Int] = []
for _ in 0..<N {
	arr.append(Int(readLine()!)!)
}

arr.sort()
arr.reverse()

for i in arr {
	print(i)
}
