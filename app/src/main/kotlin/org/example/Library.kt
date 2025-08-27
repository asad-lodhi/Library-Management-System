package org.example

class Library {
    // Map of item id to LibraryItem
    private val itemsById = HashMap<String, LibraryItem>()

    // Map of category to list of LibraryItems in category
    private val itemsByCategory = HashMap<String, MutableList<LibraryItem>>()

    // Map of memberId to Member
    private val members = HashMap<String, Member>()

    // Map of memberId to Member.borrowedItems
    private val borrowedItems = HashMap<String, MutableList<String>>()

    //library.addItem(Book("B001", "The Kotlin Guide", "John Doe", "978-1234567890", 300))
    fun addItem(item: LibraryItem) {
        itemsById[item.id] = item
        itemsByCategory[item.getItemType()]?.add(item)
    }
    //library.registerMember(Member("M001", "Alice Johnson", "alice@email.com"))
    fun registerMember(member: Member) {
        members[member.getMemberId()] = member
    }
    //borrowItem("M001", "B001")
    fun borrowItem(memberId: String, itemId: String) {
//        val member = members.get(memberId)
//        val item = itemsById.get(itemId)
//
//        member?.borrowItem(item)

        borrowedItems[memberId]?.add(itemId)

    }

    fun returningItem(itemId: String) {

    }
    
    //library.findBooksByAuthor("John Doe")
    fun searchItemByCriteria() {

    }

}