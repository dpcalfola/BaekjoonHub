import Foundation

func Q11021() {

	let num = Int(readLine()!)!

	for i in 1...num {

		let addArry = readLine()!.components(separatedBy: " ")
		let result =  Int(addArry[0])! + Int(addArry[1])!
		print("Case #\(i): \(result)")

	}
}


Q11021()