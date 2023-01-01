import Foundation

func Q10039(){
	var total = 0

	for _ in 0..<5{

		var input = Int(readLine()!)!
		if input < 40 {
			input = 40
		}

		total += input
	}

	print (total/5)
}
Q10039()