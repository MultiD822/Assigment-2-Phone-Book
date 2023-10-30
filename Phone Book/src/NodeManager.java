/*
Programmer: Kai Schenkel
Class CS 145
Data 10/28/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeManager.java
*/

import java.util.Scanner;

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
    
    //This method will be for removing a node at a given Index
    public void removeNode_AtIndex(int nodeIndex){
        if (nodeIndex < 0 || nodeIndex >= indexCounter) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        if (indexCounter == 1) {
            //if there is only one node in the chain, remove it
            firstNode = lastNode = null;
        } else if (nodeIndex == 0) {
            //Remove the first node
            firstNode = firstNode.nextNodeBook;
            firstNode.prevNodeBook = null;
        } else {
            NodeBook<D> currentNode = firstNode;

            for (int i = 0; i < nodeIndex; i++) {
                currentNode = currentNode.nextNodeBook;
            }

            currentNode.prevNodeBook.nextNodeBook = currentNode.nextNodeBook;
            currentNode.nextNodeBook.prevNodeBook = currentNode.prevNodeBook;
        }
        indexCounter--;
    }

    //This method will make a new contact in and index the node to 0
    public void addContact(NodeManager<String> phoneBook){
        Scanner termianlScanner = new Scanner(System.in);

        System.out.println("Please enter the First name:");
        String userInput_String1 = termianlScanner.nextLine();
        String firstNameData = userInput_String1;

        System.out.println("Please enter the Last name:");
        String userInput_String2 = termianlScanner.nextLine();
        String lastNameData = userInput_String2;

        System.out.println("Please enter the Address:");
        String userInput_String3 = termianlScanner.nextLine();
        String addressData = userInput_String3;

        System.out.println("Please enter the City:");
        String userInput_String4 = termianlScanner.nextLine();
        String cityData = userInput_String4;

        System.out.println("Please enter the Phone Number:");
        String userInput_String5 = termianlScanner.nextLine();
        String phoneNumberData = userInput_String5;

        phoneBook.insertNode_AtIndex(0,firstNameData,lastNameData,addressData,cityData,phoneNumberData);
        termianlScanner.close();
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
            System.out.println("||" + currentNode.getFirstName() + "||" + currentNode.getLastName() + "||" + currentNode.getAddress() + "||" + currentNode.getCity() + "||" + currentNode.getPhoneNumber() + "||");

            currentNode = currentNode.nextNodeBook;
        }
        System.out.println();
    }

    public void printSelectNode(int nodeIndex){
        if (nodeIndex < 0 || nodeIndex >= indexCounter){
            System.out.println("Invalid index");
        }else {
            NodeBook<D> currentNode = firstNode;
            for (int i = 0; i < nodeIndex; i++) {
                currentNode = currentNode.nextNodeBook;
            }
            System.out.println("||" + currentNode.getFirstName() + "||" + currentNode.getLastName() + "||" + currentNode.getAddress() + "||" + currentNode.getCity() + "||" + currentNode.getPhoneNumber() + "||");
        }
    }
    //This method checks if this chian of nodes is Empty or not 
    public boolean isChainEmpty() {return firstNode == null;}
}
