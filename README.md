# <img src="app/src/main/resources/library.png" alt="Library Icon" width="50"/>  Library Management System 
**A console-based Library Management System that demonstrates understanding of Kotlin's core concepts including OOP, functional programming, collections (HashMaps), recursion, and more.**

<img src="app/src/main/resources/cmd.png" alt="Console Icon" width="50"/> <img src="app/src/main/resources/kotlin.png" alt="Kotlin Icon" width="50"/>

## ❓How To Run
Navigate to `app/src/main/kotlin/org/example/Main.kt`

Run `fun main()`

## ⭐️ Features
## 🔶 Object-Oriented Programming ##
✅ Abstraction

An abstract LibraryItem class with core variables and abstract functions 

`app/src/main/kotlin/org/example/LibraryItem.kt`

✅ Inheritance & Polymorphism

Book, DVD and Magazine classes which inherit variables from LibraryItem and uniquely implement abstract functions 

`app/src/main/kotlin/org/example/Book.kt`
`app/src/main/kotlin/org/example/DVD.kt`
`app/src/main/kotlin/org/example/Magazine.kt`

✅ Encapsulation 

A Member class which encapsulates all variables and functions required for Member objects

`app/src/main/kotlin/org/example/Member.kt`

## 🔶 Collections & HashMaps ##

A Library class which uses HashMaps to hold collections of LibraryItems, Members and track Borrowed Items. 

`app/src/main/kotlin/org/example/Library.kt`

## 🔶 Functional Programming ##

✅ Higher-Order Functions & Lambdas

findBookByAuthor(), findItemBy() 

to specify search by criteria

getLibraryStatistics() 

to get formatted display of entire Library data

processOverdueItems() 

to process overdue fees on items borrowed by members

`app/src/main/kotlin/org/example/Library.kt`

✅ Extension Functions

Implemented in the Library class fuctions 

List.filterByAvailability() 

to filter a list of LibraryItems and filter by set Availability (true or false)

String.isValidEmail() 

to varify if a certain string is a valid email

LibraryItem.getFormattedInfo() 

to obtain a well formatted display of LibraryItem information

`app/src/main/kotlin/org/example/Library.kt`

## 🔶 Recursion ##

calculateCompoundLateFee() 

a recursive function which calculates compounded late fees on item based on a base amount and number of days the item is late for return

`app/src/main/kotlin/org/example/RecursiveFunctions.kt`

