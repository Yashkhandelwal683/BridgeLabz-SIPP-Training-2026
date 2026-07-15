public class ReverseHistory {

    static Node reverseHistory(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Before reversal (most recent first):");
        Node.printList(head);

        head = reverseHistory(head);
        System.out.println("After reversal (oldest first):");
        Node.printList(head);
    }
}
