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

    public void addNode(String data){
        //This will call the NodeBook class so then we can start makeing methods for the node list 
        NodeBook new_Node = new NodeBook(data);
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
    public void removeNode(String data){
        NodeBook current = fristNode;
        NodeBook previous = null;
        while(current != null){
            if(current.data == data){
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

    public void nodeReader(){
        NodeBook current = fristNode;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
