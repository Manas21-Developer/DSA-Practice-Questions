package LinkedList;

public class LinkedListInsertion {
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next = null;
        }
    }
    // Insert at beginning
    public void insertAtFirst(Node node)
    {
        node.next = head;
        head = node;
    }
    // Insert at end
    public void insertAtEnd(Node node)
    {
        if(head == null)
        {
            head = node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = node;
        return ;
    }
    // Insert in (after) middle using fast/slow pointers
    public void insertAtMiddle(Node node)
    {
        if(head == null)
        {
            head = node;
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        node.next= slow.next;
        slow.next = node;
        return;
    }

    // One method that help me to insert the node on any idx it can be First , end , middle ;
    public void insertAtPosition(Node node , int poistion)
    {
        if (head == null || poistion <=0)
        {
            node.next = head;
            head = node;
            return;

        }
        Node curr = head;
        // 0 th based index .
        int cnt = 0;
        while (curr.next != null  && cnt < poistion -1)
        {
            curr = curr.next;
            cnt++;
        }
        node.next = curr.next;
        curr.next = node;
    }


}

