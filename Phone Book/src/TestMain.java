/*
Programmer: Kai Schenkel
Class CS 145
Data 10/30/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
TestMain.java
*/

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception {
        boolean programStillRunning = true;
        System.out.println("Hello, World!");
        NodeManager<String> list = new NodeManager<>();

        for (int i = 0; i < 8; i++) {
            list.insertNode_AtIndex(i, "Test Name", "Test Lname", "Test Address", "Test City", "Test PH");
        }
        System.out.println("Wellcome to the PhoneBook you can Add, Remove, and Edit Contacts with this program!");
        while (programStillRunning) {
            Scanner termianlScanner = new Scanner(System.in); 
            
            System.out.println("Please Enter 'A' to add a Contact, Enter 'E' to edit a Contact, Enter 'R' to remove a contact,\n Enter 'P' to Print out all Contacts, Enter 'I' to print a give contact, and Enter 'Q' to quit ");
            String input = termianlScanner.nextLine();
            
            switch (input.toUpperCase().charAt(0)) {
                case 'A':
                    list.addContact(list);
                    break;
                case 'P':
                    list.printChainOfNodes();
                    break;
                case 'I':
                 int indexToPrint = termianlScanner.nextInt();
                    list.printSelectNode(indexToPrint);
                    break;
                case 'E':
                    int index = termianlScanner.nextInt();
                    
                    list.editNodeBook_AtIndex(list, index);
                    break;
                case 'R':
                    int indexRemove = termianlScanner.nextInt();
                    
                    list.removeNode_AtIndex(indexRemove);
                    break;
                case 'Q':
                    termianlScanner.close();
                    programStillRunning = false;
                    break;
                default:
                    break;
            }
        }
    }    
}

