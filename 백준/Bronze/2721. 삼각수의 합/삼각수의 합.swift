import Foundation

Q2721()

func Q2721() {

	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {
		let n = Int(readLine()!)!
		var sum = 0
		for i in 1 ... n {
			sum += i * T(n: i+1)
		}
		print(sum)
	}

	func T(n: Int) -> Int {

		if n == 1 {
			return 1
		}else {
			return T(n: n-1) + n
		}
	}
}