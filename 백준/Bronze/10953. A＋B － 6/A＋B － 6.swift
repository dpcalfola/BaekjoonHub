import Foundation

Q10953()

func Q10953() {

	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {
		let inputStr = readLine()!
		let str: [String] = inputStr.map { String ( $0 ) }
		let a = Int(str[0])!
		let b = Int(str[2])!
		print(a+b)
	}
}
