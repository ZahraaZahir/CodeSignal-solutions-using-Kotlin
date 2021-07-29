/*The question is:
 Given an array of integers, find the pair of adjacent elements
 that has the largest product and return that product.
*/

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int = (0..inputArray.size - 2).map {
    inputArray[it] * inputArray[it + 1]
}.max() ?: Integer .MIN_VALUE