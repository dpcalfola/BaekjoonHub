import Foundation

Q2751()

func Q2751() {

	let N = Int(readLine()!)!
	var arr: [Int] = []

	for _ in 0 ..< N {
		arr.append(Int(readLine()!)!)
	}

	arr.sort()

	for i in arr {
		print(i)
	}

}
