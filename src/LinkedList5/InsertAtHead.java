package LinkedList5;


class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
public class InsertAtHead {

    static Node insertAtHead(Node head,int K) {
        if (head == null)
        {
            Node newNode = new Node(K);
            head = newNode;
            return head;
        }

        Node newNode = new Node(K);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
}
