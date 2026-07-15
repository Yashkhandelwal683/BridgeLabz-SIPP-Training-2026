public class RemoveTask {

    static Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        if (head.val == taskId) return head.next;

        Node prev = head, curr = head.next;
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before removal:");
        Node.printList(head);

        head = removeTask(head, 30);
        System.out.println("After removing task 30:");
        Node.printList(head);

        head = removeTask(head, 10);
        System.out.println("After removing task 10 (head):");
        Node.printList(head);
    }
}
