package LinkedList5;

public class InsertAtTheEnd{

    class Node{
        int data;
        LinkedList5.Node next;
        LinkedList5.Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public class InsertAtEnd {

        static LinkedList5.Node insertAtHead(Node head, int K) {
            if (head == null)
            {
                LinkedList5.Node newNode = new LinkedList5.Node(K);
                head = newNode;
                return head;
            }
            Node curr = head;
            while (curr.next != null)
            {
                curr = curr.next;
            }
            Node newNode = new Node(K);
            curr.next = newNode;
            newNode.prev = curr;
            return head;

        }
    }

}
