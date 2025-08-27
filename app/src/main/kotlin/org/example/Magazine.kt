package org.example

class Magazine(
    id: String,
    title: String,
    val issueNumber: Int,
    val publisher: String
) : LibraryItem(id, title) {
    override fun getItemType(): String = "Magazine"
    override fun calculateLateFee(daysLate: Int): Double {
        return daysLate * 0.25
    }
}