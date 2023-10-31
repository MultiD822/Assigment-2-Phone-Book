/*
Programmer: Kai Schenkel
Class CS 145
 Data 10/30/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeBook.java
*/



public class NodeBook<D> {
    //This class is just an object that is called PhoneBook, it holds the data and hold the constertor to then be called
    
    //We need to find a way to have the data be set by a method insted of it being hard coded in to the program 
    protected String firstName, lastName, address, city, phoneNumber;
    NodeBook<D> nextNodeBook;
    NodeBook<D> prevNodeBook;

    public NodeBook(String object_1, String object_2, String object_3, String object_4, String object_5){
        this(object_1, object_2, object_3 ,object_4, object_5, null, null);
    }

    public NodeBook(String object_1, String object_2, String object_3, String object_4, String object_5, NodeBook<D> node, NodeBook<D> pNode){
        firstName = object_1;
        lastName = object_2;
        address = object_3;
        city = object_4;
        phoneNumber = object_5;
        nextNodeBook = node;
        prevNodeBook = pNode;
    }
    /*These next methods are for setting the data in the node*/
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastname){
        this.lastName = newLastname;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public void setCity(String newCity){
        this.city = newCity;
    }

    public void setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }

    /*The methods below are getting info for the program like the first name and Address*/
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    NodeBook<D> getNextNode(){return nextNodeBook;}


}
