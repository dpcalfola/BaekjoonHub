
import Foundation

var inputArr: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }

inputArr.sort()

let answer = inputArr[0]*inputArr[2]
print(answer)
