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
    
    //We need to find a way to have the data be set by a method insted of it being hard coded in to the program 
    protected String firstName, lastName, address, city, phoneNumber;
    NodeBook next;

    public NodeBook(String FirstName, String newLastname, String newAddress, String newCity, String newPhoneNumber){
        
        this.firstName = FirstName;
        this.lastName = newLastname;
        this.address = newAddress;
        this.city = newCity;
        this.phoneNumber = newPhoneNumber;
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



}
