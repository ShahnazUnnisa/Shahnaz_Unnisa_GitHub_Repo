package programs;

public class Tester {
	public static void main(String args[]) {

        LinkedList linkedList = new LinkedList();
        LinkedList reversedLinkedList = new LinkedList();
            
        linkedList.addAtEnd("Data");
        linkedList.addAtEnd("Structures");
        linkedList.addAtEnd("and");
        linkedList.addAtEnd("Algorithms");
            
        System.out.println("Initial List");
        linkedList.display();

        System.out.println();
            
        reverseList(linkedList.getHead(), reversedLinkedList);
        System.out.println("Reversed List");
        reversedLinkedList.display();
    }

    public static void reverseList(Node head, LinkedList reversedLinkedList) {
        //Implement your code here    
    	  Node current = head;
          while (current != null) {
              reversedLinkedList.addAtBeginning(current.getData());
              current = current.getNext();
          }
    }

}
