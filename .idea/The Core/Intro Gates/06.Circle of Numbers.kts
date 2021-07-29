/*The question is:
 Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between
any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
*/

fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    var half = n / 2
    if (half + firstNumber >= n) {
        return (half + firstNumber) % n
    }
    return half + firstNumber
}