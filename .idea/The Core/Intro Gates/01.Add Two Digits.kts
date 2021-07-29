/*The question is:
 You are given a two-digit integer n. Return the sum of its digits.
*/

fun addTwoDigits(n: Int): Int = if (n >= 10) n % 10 + addTwoDigits(n / 10) else n