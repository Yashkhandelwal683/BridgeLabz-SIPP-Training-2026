public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println(" -> null");
    }
}
