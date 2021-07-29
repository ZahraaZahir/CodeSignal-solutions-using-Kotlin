/*The question is:
  After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free,
but there's a rumour that all the free rooms are haunted!
Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms,
or any of the rooms below any of the free rooms.

  Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
your task is to return the total sum of all rooms that are suitable for the CodeBots
(ie: add up all the values that don't appear below a 0).
*/
fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var room = 0
    var columnSize = matrix[0].size
    var rowSize = matrix.size
    for(i in 0 .. columnSize -1) {
        for(j in 0..  rowSize-1 ){
            if(matrix[j][i]==0) break room+= matrix[j][i]
        }
    }
    return room
}
