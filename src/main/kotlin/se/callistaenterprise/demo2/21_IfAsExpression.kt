package se.callistaenterprise.demo2

class ExpressionDemo {
    var noOfUsed = 1
    var noOfUsedInverse = 2

    fun getNoOfUsed(inverse: Boolean): Int {
        if (!inverse) {
            return noOfUsed
        } else {
            return noOfUsedInverse
        }
    }

    fun getNoOfUsed2(inverse: Boolean) = if (!inverse) noOfUsed else noOfUsedInverse


}
