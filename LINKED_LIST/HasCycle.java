public class HasCycle {

    static boolean hasRedirectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("List without cycle:");
        System.out.println("Has redirect loop: " + hasRedirectLoop(head));

        Node cycleHead = new Node(1);
        cycleHead.next = new Node(2);
        cycleHead.next.next = new Node(3);
        cycleHead.next.next.next = new Node(4);
        cycleHead.next.next.next.next = cycleHead.next;
        System.out.println("\nList with cycle (4 -> 2):");
        System.out.println("Has redirect loop: " + hasRedirectLoop(cycleHead));
    }
}
