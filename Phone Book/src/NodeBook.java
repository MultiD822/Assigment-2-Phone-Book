/*
Programmer: Kai Schenkel
Class CS 145
Data 10/19/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeBook.java
*/

public class NodeBook {
    //This class is just an object that is called PhoneBook, it holds the data and hold the constertor to then be called
    String data;
    NodeBook next;

    public NodeBook(String data){
        this.data = data;
        this.next = null;
    }

}
