package LinkedList5;


public class InsertionInCircularLinkedList {
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            newNode.next = head;
            return ;
        }
        Node curr = head;
        while (curr.next != head)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }
}

