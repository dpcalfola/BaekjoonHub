import Foundation
let N = Int(readLine()!)!
for i in 1...N {
	print(String(repeating: " ", count: i-1), terminator: "")
	print(String(repeating: "*", count: -2*i+2*N+1))
}