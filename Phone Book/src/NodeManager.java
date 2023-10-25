/*
Programmer: Kai Schenkel
Class CS 145
Data 10/20/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
NodeManager.java
*/

import java.util.Scanner;

public class NodeManager {
    //This class is meant for holding the methods for managing the PhoneBook class
    NodeBook fristNode;
    NodeBook lastNode;


    public void askForData(){
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

        //System.out.printf("%-5s %-5s %-5s %-5s %-5s",firstNameData, lastNameData, addressData, cityData, phoneNumberData);

        addNode(firstNameData, lastNameData, addressData, cityData, phoneNumberData);

        termianlScanner.close();//This will close the scanner to stop data leaks 
    }

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
   
//This method will count the amount of node that have been made and return a int value 
    public int getNode_Chain_Size(){
        NodeBook currentNode = fristNode;
        int nodeCount = 0;
        while(currentNode != null){
                currentNode = currentNode.next;
                nodeCount++;
        }
        return nodeCount;
    }
//End of getNode_Chain_Size method

    public boolean isNodeEmpty(){
        return fristNode == null;
    }

    //This Method will remove a node form the Linked list, and then if need conet any node to together 
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
            System.out.println("||" + current.getFirstName() + "||" + current.lastName  + "||" + current.address  + "||" + current.city + "||" + current.phoneNumber + "||");

            current = current.next;
        }
        System.out.println();
    }

//This next method will be for grabing for the index of a node in the chain

    
}
