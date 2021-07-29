/*The question is:
Given a divisor and a bound, find the largest integer N such that:

N is divisible by divisor.
N is less than or equal to bound.
N is greater than 0.
It is guaranteed that such a number exists.
*/

fun maxMultiple(divisor: Int, bound: Int): Int {
    var result = bound
    while (result > 0) {
        if (result % divisor == 0) {
            return result
        }
        result--
    }
    return result
}