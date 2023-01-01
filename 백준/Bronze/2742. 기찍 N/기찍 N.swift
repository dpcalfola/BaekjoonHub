import Foundation

let input = Int(readLine()!)

if let input = input {
	for i in stride(from: input , to: 0, by: -1) {
		print(i)
	}
}