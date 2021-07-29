/*The question is:
 Given an integer n, return the largest number that contains exactly n digits.
 */

fun largestNumber(n: Int): Int {
    var n = n
    var result = 0
    while (n != 0) {
        result = result * 10 + 9
        n--
    }
    return result
}