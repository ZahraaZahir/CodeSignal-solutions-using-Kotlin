/*The question is:
Given a sequence of integers as an array,
determine whether it is possible to obtain a strictly increasing
sequence by removing no more than one element from the array.
*/

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var count1 = 0
    var count2 = 0
    for (i in 0 until sequence.size - 1) {
        if (sequence[i] >= sequence[i + 1]) count1++
    }
    for (i in 0 until sequence.size - 2) {
        if (sequence[i] >= sequence[i + 2]) count2++
    }
    return count1 <= 1 && count2 <= 1
}