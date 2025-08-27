package org.example

class Member(
    private val memberId: String,
    private var name: String,
    private var email: String
) {
    private val borrowedItems = mutableListOf<LibraryItem>()

    fun getMemberId(): String = memberId
    fun getName(): String = name
    fun getEmail(): String = email

    fun setName(memberName: String) {
        name = memberName
        println("Member Name set to $name")
    }
    fun setEmail(memberEmail: String) {
        if(
            memberEmail.contains('@')
            &&
            memberEmail.contains('.')
            ) {
            email = memberEmail
            println("Member Email set to $email")
        } else {
            println("invalid email")
        }
    }

    fun borrowItem(item: LibraryItem) {
        if(item.isAvailable) {
            borrowedItems.add(item)
            item.isAvailable = false
            println("Member $memberId $name borrowed item ${item.id} ${item.title}")
        }
        else {
            println("item unavailable")
        }
    }

    fun returnItem(item: LibraryItem) {
        if(borrowedItems.contains(item)) {
            borrowedItems.remove(item)
            item.isAvailable = true
            println("Member $memberId $name returned item ${item.id} ${item.title}")
        } else {
            println("Member $memberId $name did not borrow this item")
        }
    }

    fun totalLateFees(daysLate: Int) {
        if(borrowedItems.isEmpty()) {
            println("no items borrowed")
        }
        else {
            var total = 0.0
            borrowedItems.forEach { item ->
                total += item.calculateLateFee(daysLate)
            }
            println("Total Late Fees = $$total")
        }
    }
}