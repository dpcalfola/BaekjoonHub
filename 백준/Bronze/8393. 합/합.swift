import Foundation

func Q8393(){
	if let input = readLine(), let N = Int(input) {
		var sum = 0
		for i in 1 ... N {
			sum += i
		}

		print(sum)
	}
}

Q8393()