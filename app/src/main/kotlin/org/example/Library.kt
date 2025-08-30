package org.example

import kotlin.math.PI
import kotlin.math.pow

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
        println("New ${item.getItemType()} ${item.title} Added with id:${item.id}")
    }
    //library.registerMember(Member("M001", "Alice Johnson", "alice@email.com"))
    fun registerMember(member: Member) {
        members[member.getMemberId()] = member
        println("New member: ${member.getMemberId()} ${member.getName()} ${member.getEmail()} Added")
    }
    //borrowItem("M001", "B001")
    fun borrowItem(memberId: String, itemId: String) {

        var member: Member? = null
        if(members.contains(memberId)){
            member = members[memberId]
        }

        var item: LibraryItem? = null
        if(itemsById.contains(itemId)) {
            item = itemsById[itemId]
        }

        if(member != null && item != null) {
            member.borrowItem(item)
            borrowedItems[memberId]?.add(itemId)
        }
    }

    fun returningItem(memberId: String, itemId: String) {

        var member: Member? = null
        if(members.contains(memberId)){
            member = members[memberId]
        }

        var item: LibraryItem? = null
        if(itemsById.contains(itemId)) {
            item = itemsById[itemId]
        }

        if(member != null && item != null) {
            member.returnItem(item)
            borrowedItems[memberId]?.remove(itemId)
        }
    }
    
    //library.findBooksByAuthor("John Doe")
    fun findBooksByAuthor(author: String): List<Book> {
//
        val booksInLibrary = itemsByCategory["Book"] as MutableList<Book>?

        val booksByAuthor: MutableList<Book> = mutableListOf()

        booksInLibrary?.forEach { book ->
            if(book.author == author) {
                booksByAuthor.add(book)
            }
        }

        val result = booksByAuthor.toList()

        return result
    }


//    fun <T: LibraryItem> findItemsBy(
//        type: Class<T>,
//        predicate: (T) -> Boolean
//    ) : List<T> {
//        if((itemsByCategory).any(type))
//
//    }

    fun getLibraryStatistics(): Map<String, Any> {
        val numberOfBooks = itemsByCategory["Book"]?.count()
        val numberOfDVDs = itemsByCategory["DVD"]?.count()
        val numberOfMagazines = itemsByCategory["Magazine"]?.count()

        val result: Map<String, Any>

        result = mapOf(
            Pair("Number of Books in Library:",numberOfBooks),
            Pair("Number of DVDs in Library:",numberOfDVDs),
            Pair("Number of Magazines in Library:",numberOfMagazines)

        ) as Map<String, Any>

        return result
    }

    fun processOverdueItems(action: (LibraryItem, Member, Int) -> Unit) {

    }

    fun List<LibraryItem>.filterByAvailability(available: Boolean): List<LibraryItem> {
        val items = itemsById.values

        val resultList: MutableList<LibraryItem> = mutableListOf()

        items.forEach { item ->
            if(item.isAvailable == available) {
                resultList.add(item)
            }
        }

        return resultList.toList()
    }

    fun String.isValidEmail(): Boolean {
        if(
            String.toString().contains('@') &&
            String.toString().contains(".")
            ) {
            return true
        }
        else {
            return false
        }
    }

//    fun LibraryItem.getFormattedInfo(): String {
//        val item: LibraryItem
//        val info: String
//
//        info = "Item ID: ${item.id}"
//    }



}