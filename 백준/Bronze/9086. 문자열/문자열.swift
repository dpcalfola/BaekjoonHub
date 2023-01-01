import Foundation

Q9086()

func Q9086() {
	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {
		let str = readLine()!
		printLastEnd(str: str)
	}


	func printLastEnd(str: String) {
		let start: Character = str[str.startIndex]
		let end: Character = str[str.index(before: str.endIndex)]

		print(start, terminator: "")
		print(end)
	}
}
