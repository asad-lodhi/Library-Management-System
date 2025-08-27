package org.example

class DVD(
    id: String,
    title: String,
    val director: String,
    val duration: Int,
    val genre: String
) : LibraryItem(id, title) {
    override fun getItemType(): String = "DVD"
    override fun calculateLateFee(daysLate: Int): Double {
        return daysLate * 1.0
    }
}