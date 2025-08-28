package org.example

fun calculateCompoundLateFee(baseFee: Double, days: Int): Double {
    // Using Math
//        val fee: Double = baseFee * (1.05).pow(days)
//        return fee

    // Recursive Function
    var fee = baseFee
    if(days != 0) {
        fee = fee + baseFee * 1.05
        calculateCompoundLateFee(baseFee = fee, days = days - 1 )
    }
    return fee
}