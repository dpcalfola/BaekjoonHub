import Foundation

func Q2438() {

	let input = readLine()

	if let unInput = input {
		let lineNum = Int(unInput)
		//		print(type(of: lineNum))
		if let unLineNum = lineNum {
			let n = unLineNum
//			print(type(of: n))

			for i in 0 ..< n {
				for _ in 0 ... i  {
					print("*" , terminator: "")

				}
				print("")
			}
		}
	}
}


Q2438()



