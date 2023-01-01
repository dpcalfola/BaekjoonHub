// q10995

let N = Int(readLine()!)!

var str1 = String(repeating: "* ", count: N)
var str2 = str1
str2.insert(" ", at: str2.firstIndex(of: "*")!)

for i in 1...N {
	if i%2 != 0 {
		print(str1)
	}else{
		print(str2)
	}
}