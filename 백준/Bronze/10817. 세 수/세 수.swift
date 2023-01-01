import Foundation
var arr: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
arr.sort()
print(arr[1])
