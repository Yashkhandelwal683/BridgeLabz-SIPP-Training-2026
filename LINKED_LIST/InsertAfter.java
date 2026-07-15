public class InsertAfter {

    static void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);

        System.out.println("Before insertion:");
        Node.printList(head);

        Node current = head.next;
        insertAfter(current, 4);

        System.out.println("After inserting 4 after node with value 3:");
        Node.printList(head);
    }
}
