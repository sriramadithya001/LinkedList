import LinkedListPackage.Node;

public class LinkedList {
    
    public static void printList(Node cur) {
        if(cur != null) {
            System.out.println(cur.val);
            printList(cur.next);
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        a.next = b;
        printList(a);
    }
}
