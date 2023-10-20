/*
Programmer: Kai Schenkel
Class CS 145
Data 10/19/2023
Assigment 2 PhoneBook
Sources: This was from the book and from Class and pass labs
TestMain.java
*/
public class TestMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ObjectManager list = new ObjectManager();
        list.addNode("Bob", "Grand","Green lane", "Blue Ville", "532-412-8795");
        list.addNode("Sally", "Valley","Red rd", "Groud Town", "349-789-3495");
        list.addNode("Jon", "Batter","Diamond St", "Mineal Vally", "265-024-0942");
        System.out.println("Here are the names");
        list.nodeReader();
        list.removeNode("Jon", "Batter","Diamond St", "Mineal Vally", "265-024-0942");
        System.out.println("Here is the list afer a remove");
        list.nodeReader();
    }
}
