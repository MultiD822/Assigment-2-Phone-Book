/*
Programmer: Kai Schenkel
Class CS 145
Data 10/24/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeBook.java
*/

public class NodeBook {
    //This class is just an object that is called PhoneBook, it holds the data and hold the constertor to then be called
    
    
    String firstName, lastName, address, city, phoneNumber;
    NodeBook next;//How do i use this object

    public NodeBook(String firstName, String lastname, String address, String city, String phoneNumber){
        
        this.firstName = firstName;
        this.lastName = lastname;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }

    public NodeBook(NodeBook next, String firstName, String lastname, String address, String city, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastname;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = next;
    }

    public void setFirstName(){

    }

    public String getFirstName(){
        return firstName;
    }
}
