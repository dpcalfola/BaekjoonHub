
import Foundation

let inputNum: [Int] = readLine()!.components(separatedBy: " ").map { Int( String($0))! }
let set1: Set<Int> = Set<Int>(readLine()!.components(separatedBy: " ").map{ Int(String($0))! })
let set2: Set<Int> = Set<Int>(readLine()!.components(separatedBy: " ").map{ Int(String($0))! })

//let set = (set1.subtracting(set2)).union(set2.subtracting(set1))
let set = set1.symmetricDifference(set2)
print(set.count)