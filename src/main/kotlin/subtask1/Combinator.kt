package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val c = array[0]
        var n = array[1]
        var result = 0
        for (k in 1..c) {
            val kRed = Integer.min(k, n - k)
            result = 1
            var num = n
            var denominator = 1
            while (denominator <= kRed)
                result = result * num-- / denominator++
            if (result >= c) {
                return k
            }
        }
        return null
    }
}
