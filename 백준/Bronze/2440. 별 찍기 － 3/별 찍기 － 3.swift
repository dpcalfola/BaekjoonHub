import Foundation

Q2440()

func Q2440(){

	let N = Int(readLine()!)!

	for i in stride(from: N, through: 1, by: -1) {

		printStar(NumOfStar: i)

	}

	func printStar(NumOfStar: Int){

		var str: String = ""

		for _ in 1 ... NumOfStar {
			str.append("*")
		}

		print (str)

	}

}
