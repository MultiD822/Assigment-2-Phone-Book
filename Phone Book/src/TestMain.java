/*
Programmer: Kai Schenkel
Class CS 145
Data 10/28/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
TestMain.java
*/



public class TestMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        NodeManager<String> list = new NodeManager<>();
         list.insertNode_AtFront(0, "null", "null", "null", "null", "null");
         list.insertNode_AtFront(1, "null", "null", "null", "null", "null");
         list.insertNode_AtFront(2, "null", "null", "null", "null", "null");
         list.insertNode_AtFront(3, "null", "null", "null", "null", "null");
         list.insertNode_AtFront(4, "null", "null", "null", "null", "null");

         list.insertNode_AtIndex(0, "Grant", "Stone", "6923 New Haven St", "Blood Moon", "123 456 7890");

         list.printChainOfNodes();
    }
}

