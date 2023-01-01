import Foundation

let (a, b): (Int, Int) = (1, 500001)
var arr: [Int] = Array(0...b+1)
let limit: Int = Int(sqrt(Double(b)))
arr[0] = -1
arr[1] = -1
for i in 2...limit {
	guard arr[i] != -1 else { continue }
	for j in stride(from: i*i, through: b, by: i) {
		arr[j] = -1
	}
}

var primeArr: [Int] = []
for i in arr where i != -1 {
	primeArr.append(i)
}

let N = Int(readLine()!)!
print(primeArr[N-1])
