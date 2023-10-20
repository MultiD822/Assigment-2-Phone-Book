/*
Programmer: Kai Schenkel
Class CS 145
Data 10/19/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
ObjectManager.java
*/
public class ObjectManager {
    //This class is meant for holding the methods for managing the PhoneBook class
    NodeBook fristNode;
    NodeBook lastNode;

    public void addNode(String firstName, String lastname, String address, String city, String phoneNumber){
        //This will call the NodeBook class so then we can start makeing methods for the node list 
        NodeBook new_Node = new NodeBook(firstName, lastname, address, city, phoneNumber);
        //This will add a node to the front of the list 
        if(fristNode == null){
            fristNode = new_Node;
            lastNode = new_Node;
        }else{
            //This will add to the end of the node list 
            lastNode.next = new_Node;
            lastNode = new_Node;
        }
    }
    //This Method will remove a node form the list, and then sti
    public void removeNode(String firstName, String lastname, String address, String city, String phoneNumber){
        NodeBook current = fristNode;
        NodeBook previous = null;
        while(current != null){
            if(current.firstName == firstName){
                if(previous == null){
                fristNode = current.next;
                }else{
                previous.next = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;
        } 
    }
//This method will read what is in the node and the print it to the Terminal
    public void nodeReader(){
        NodeBook current = fristNode;
        while (current != null){
            System.out.println("||" + current.firstName  + "||" + current.lastName  + "||" + current.address  + "||" + current.city + "||" + current.phoneNumber + "||");

            current = current.next;
        }
        System.out.println();
    }
}
