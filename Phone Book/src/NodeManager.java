/*
Programmer: Kai Schenkel
Class CS 145
Data 10/28/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeManager.java
*/



public class NodeManager {
    //This class is meant for holding the methods for managing the PhoneBook class
    private NodeBook firstNode;
    private NodeBook lastNode;
    String name;
    int nodeIndex = 0;
    //

    //This Constructor create an epmty chain of node that can hold data its name is NodeChain
    public NodeManager() {this("NodeChain");}

    //This Constructor is ment to call the first and last node to make an empty chain of nodes
    public NodeManager(String chainName) {
        name = chainName;
        firstNode = lastNode = null;
    }

     /*
     public void insertNode_AtFront(String insertData1){
        if(isNodeEmpty()){
            firstNode = lastNode = new NodeBook(insertData1);
        }
        else {
            firstNode = new NodeBook(insertData1, firstNode);
        }
    }*/

    public void addNode(String firstName, String lastname, String address, String city, String phoneNumber){
        //This will call the NodeBook class so then we can start makeing methods for the node list 
        NodeBook new_Node = new NodeBook(firstName, lastname, address, city, phoneNumber);
        //This will add a node to the front of the list 
        if(firstNode == null){
            firstNode = new_Node;
            lastNode = new_Node;
        }else{
            //This will add to the end of the node list 
            lastNode.nextNodeBook = new_Node;
            lastNode = new_Node;
        }
        nodeIndex++;
    }

//Need a method 
   
//This method will count the amount of node that have been made and return a int value 
    public int getNode_Chain_Size(){
        NodeBook currentNode = firstNode;
        int nodeCount = 0;
        while(currentNode != null){
                currentNode = currentNode.nextNodeBook;
                nodeCount++;
        }
        return nodeCount;
    }
//End of getNode_Chain_Size method

    public boolean isNodeEmpty(){
        return firstNode == null;
    }

    //This Method will remove a node form the Linked list, and then if need conet any node to together 
    public void removeNode(String firstName, String lastname, String address, String city, String phoneNumber){
        NodeBook current = firstNode;
        NodeBook previous = null;
        while(current != null){
            if(current.firstName == firstName){
                if(previous == null){
                firstNode = current.nextNodeBook;
                }else{
                previous.nextNodeBook = current.nextNodeBook;
                }
                break;
            }
            previous = current;
            current = current.nextNodeBook;
        } 
    }
//This method will read what is in the node and the print it to the Terminal
    public void nodeReader(){
        NodeBook current = firstNode;
        while (current != null){
            System.out.println("||" + current.firstName + "||" + current.lastName  + "||" + current.address  + "||" + current.city + "||" + current.phoneNumber + "||");

            current = current.nextNodeBook;
        }
        System.out.println();
    }

//This next method will be for grabing for the index of a node in the chain
    public int getNodeIndex(){
        return nodeIndex;
    }
    
}
