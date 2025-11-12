package LinkedList;

public class LLDeletion {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void deleteAtFirst()
        {
            if (head == null) {
                return;
            }
            head = head.next;
        }
        public void deletionEnd()
        {
            if (head == null)
            {
                return;
            }
            if (head.next == null)
            {
                head = null;
                return;
            }
            Node curr = head;
            Node prev = null;
            while (curr.next != null)
            {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        public void deleteAtMiddle()
        {
            if (head == null)
            {
                return;
            }
            if(head.next == null)
            {
                head = null;
                return;
            }
            Node slow = head;
            Node fast = head;
            Node prev = null;
            while (fast != null && fast.next != null )
            {
                prev = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
            prev.next = slow.next;
            return;
        }
}
