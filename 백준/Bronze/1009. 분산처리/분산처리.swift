import Foundation

let testCase: Int = Int(readLine()!)!

for _ in 0..<testCase {
	let inputNum : [Int] = readLine()!.components(separatedBy: " ").map { Int($0)! }
	let answer = getAnswer(base: inputNum[0], power: inputNum[1])
	print(answer)
}

func getAnswer(base: Int, power: Int) -> Int {
	var result = 1
	for _ in 1...power{
		result *= base
		result %= 10
//		print(result)
	}
	if result == 0 {
		return 10
	}else{
		return result
	}
}