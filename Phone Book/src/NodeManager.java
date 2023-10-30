/*
Programmer: Kai Schenkel
Class CS 145
Data 10/28/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeManager.java
*/

import org.w3c.dom.Node;

public class NodeManager<D> {
    //This class is meant for holding the methods for managing the PhoneBook class
    private NodeBook<D> firstNode;
    private NodeBook<D> lastNode;
    private String name;
    private int indexCounter;
    //

    //This Constructor create an epmty chain of node that can hold data its name is NodeChain
    public NodeManager() {this("NodeChain");
        indexCounter = 0;}

    //This Constructor is ment to call the first and last node to make an empty chain of nodes
    public NodeManager(String chainName) {
        name = chainName;
        firstNode = lastNode = null;
        indexCounter = 0;
    }

     //This method will add a node at a given index
     public void insertNode_AtIndex(int nodeIndex, D object_1, D object_2, D object_3, D object_4, D object_5) {
        if (nodeIndex > indexCounter) {
            throw new IndexOutOfBoundsException();
        }
        NodeBook<D> node = new NodeBook<D>(object_1, object_2, object_3, object_4, object_5, null, null);
        if (indexCounter == 0) {
            firstNode = lastNode = node;
        } else {
            if (nodeIndex == 0) {
                node.nextNodeBook = firstNode;
                firstNode.prevNodeBook = node;
                firstNode = node;
            } else if (nodeIndex == indexCounter) {
                node.prevNodeBook = lastNode;
                lastNode.nextNodeBook = node;
                lastNode = node;
            } else {
                NodeBook<D> currentNode = this.firstNode;

                for (int i = 0; i < nodeIndex; i++) {
                    if (currentNode == null){
                        throw new IndexOutOfBoundsException("Invalid index");
                    }
                    currentNode = currentNode.nextNodeBook;
                }
                node.nextNodeBook = currentNode;
                node.prevNodeBook = currentNode.prevNodeBook;
                currentNode.prevNodeBook.nextNodeBook = node;
                currentNode.prevNodeBook = node;
            }
        }
        indexCounter++;
        }
    //Next method will be for just adding nodes to the fount of the chain of Nodes 
    public void insertNode_AtFront (int indexCounter, D object_1, D object_2, D object_3, D object_4, D object_5) {
        if (isChainEmpty()){
            firstNode = lastNode = new NodeBook<D>(object_1, object_2, object_3, object_4, object_5, null, null);
        } else {
            NodeBook<D> newNode = new NodeBook<D>(object_1, object_2, object_3, object_4, object_5, firstNode, null);
            firstNode.prevNodeBook = newNode;
            firstNode = newNode;
        }
        indexCounter++;
    }

    //This method will be for printing the node from the chain and then printing the data from the node itself
    public void printChainOfNodes() {
        if (isChainEmpty()){
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.println("The name of this chain is :\t" + name);
        NodeBook<D> currentNode = firstNode;

        while (currentNode != null) {
            System.out.printf("First Name : %-5s \n", currentNode.firstName);
            System.out.printf("Last Name : %-5s \n", currentNode.lastName);
            System.out.printf("Address : %-5s \n", currentNode.address);
            System.out.printf("City : %-5s \n", currentNode.city);
            System.out.printf("PhoneNumber : %-5s \n", currentNode.phoneNumber);
            currentNode = currentNode.nextNodeBook;
        }
        System.out.println();
    }







    //This method checks if this chian of nodes is Empty or not 
    public boolean isChainEmpty() {return firstNode == null;}
}
