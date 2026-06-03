# Laboratory Work No.6: Java Collections and Generics

## Overview
This repository contains the implementation of Laboratory Work No.6 for the Moscow Technical University of Communications and Informatics (MTUCI). 

The primary focus of this project is to study and practically apply the Java Collections Framework and Generics. The work consists of three practical tasks that involve frequency analysis, designing custom generic data structures, and building an object-oriented business logic system.

## Tasks Description

### Task 1: Word Frequency Analyzer (TopWords)
A program that reads a text file and determines the top 10 most frequently used words.
* Mechanics: Utilizes the Scanner class for file reading and regular expressions to filter out punctuation, leaving only Latin and Cyrillic letters.
* Data Structures: Uses a HashMap<String, Integer> to store words as keys and their occurrences as values. 
* Sorting: The map entries are transferred to an ArrayList and sorted in descending order using a custom Comparator.

### Task 2: Custom Generic Stack (Stack<T>)
Implementation of a custom generic LIFO (Last In, First Out) stack data structure based on a fixed-size array.
* Mechanics: Supports standard stack operations including push (add), pop (remove and return), and peek (return top element without removing).
* Type Safety: Utilizes Java Generics (<T>) to allow the stack to store objects of any type while maintaining type safety.
* Error Handling: Throws an IllegalStateException upon capacity overflow and an EmptyStackException when attempting to pop or peek an empty stack. Clears references upon pop to prevent memory leaks.

### Task 3: Store Sales Tracking System (SalesTracker)
An object-oriented program designed to track store sales, manage inventory records, and calculate revenue.
* Data Models: Operates with an Item class containing properties such as name and price.
* Transaction History: Uses a LinkedList to efficiently store and append the history of sold items.
* Analytics: Includes a method to calculate total revenue by iterating through the list, and a method that uses a HashMap to aggregate item frequencies to identify the most popular sold product.

## Technologies Used
* Language: Java
* Core Concepts: Java Collections Framework (HashMap, ArrayList, LinkedList), Generics (<T>), File I/O (Scanner, File), Custom Comparators, Exception Handling, Regular Expressions.

## Key Learnings and Conclusion
Throughout this laboratory work, fundamental mechanisms of dynamic data structures and Java Collections were successfully mastered. The project demonstrates how to efficiently combine different collections — such as using a LinkedList for sequential transaction tracking and a HashMap for fast data aggregation and frequency counting. Additionally, the creation of a generic stack reinforced the understanding of memory management, the LIFO principle, and type-safe class design.

---

## Author
* Name: Pavel Petrovich Koshelev
* Group: BST 2401
* Institution: MTUCI
* Year: 2026
