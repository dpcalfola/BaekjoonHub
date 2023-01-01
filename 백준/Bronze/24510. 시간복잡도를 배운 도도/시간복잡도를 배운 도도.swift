import Foundation

let caseNum: Int = Int(readLine()!)!

var MaxRepNum: Int = 0

for _ in 0..<caseNum {
	let inputString = readLine()!

	let getRepetitive = { (inp: String) -> Int in
		var s = inp
		s = s.replacingOccurrences(of: "for", with: "1")
		s = s.replacingOccurrences(of: "while", with: "1")
		let str = s.map{String($0)}

		var numOfRepetitive = 0

		for i in str {
			if i == "1"{
				numOfRepetitive += 1
			}
		}
		return numOfRepetitive
	}

	let repNum: Int = getRepetitive(inputString)

	if MaxRepNum < repNum {
		MaxRepNum = repNum
	}
}

print(MaxRepNum)

