package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val newLong = number.toLong()
        val result = mutableListOf(newLong)
        var x = 0L

        while (!result.isNullOrEmpty()) {
            val current = result.last()
            result.indexOfLast {
                result.remove(it)
            }

            x += current*current
            for (i in current - 1 downTo 0) {
                if (x - i*i >= 0) {
                    x -= i*i
                    result.add(i)

                    if (x == 0L) {
                        result.sort()
                        return result.map { it.toInt() }.toTypedArray()
                    }
                }
            }
        }
        return null
    }
}
