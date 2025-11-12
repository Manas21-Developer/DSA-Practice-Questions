package LinkedList1;

public class InsertNodeAtASpecificPositionInALinkedList {
    static Node insert(Node head, int n, int pos, int val) {
        Node curr = head;
        Node newNode = new Node(val);
        if (pos == 0)
        {
            newNode.next = head;
            head = newNode ;
            return head;
        }
        int cnt = 0;
        while (curr != null && cnt < pos -1)
        {
            curr = curr.next;
            cnt++;
        }
        newNode.next = curr.next ;
        curr.next = newNode;
        return head;
    }
}
