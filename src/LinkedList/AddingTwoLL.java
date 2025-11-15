package LinkedList;

public class AddingTwoLL {
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node AddNo (Node h1, Node h2)
    {
        int carry = 0;
        Node dummy = new Node(-1);
        Node k = dummy;
        while (h1 != null || h2 != null)
        {
            int val1 = (h1 == null) ? 0 :h1.data;
            int val2 = (h2 == null) ? 0:h2.data;
            int sum = val1 +val2 + carry;
            carry = sum/10;
            Node newNode = new Node[sum%10];
            k.next = newNode;
            h1 = h1.next; h2 = h2.next;
            k = k.next;
        }
        if (carry >0)
        {
            Node newNode = new Node(carry);
            k.next = newNode;
            k = k.next;
        }
        return dummy.next;
}
