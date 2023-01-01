
import Foundation

//q19532

let n = readLine()!.components(separatedBy: " ").map { Int(String($0))! }

for i in -999...999 {
	for j in -999...999 {
		if i*n[0] + j*n[1] == n[2] && i*n[3] + j*n[4] == n[5] {
			print ("\(i) \(j)")
			break
		}
	}
}
