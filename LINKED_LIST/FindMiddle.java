public class FindMiddle {

    static Node findMiddleServer(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Server chain: ");
        Node.printList(head);

        Node mid = findMiddleServer(head);
        System.out.println("Midpoint server: " + mid.val);

        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);

        System.out.print("Even-length chain: ");
        Node.printList(head2);

        Node mid2 = findMiddleServer(head2);
        System.out.println("Midpoint server (upper): " + mid2.val);
    }
}
