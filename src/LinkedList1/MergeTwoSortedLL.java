package LinkedList1;

public class MergeTwoSortedLL {
    static Node merge(Node x, Node y){
        Node dummy = new Node(-1);
        Node k = dummy;
        while (x != null && y != null)
        {
            if(x.data < y.data)
            {
                k.next = x;
                x =x.next;
            }else{
                k.next = y;
                y = y.next;
            }
            k = k.next;
        }
        if(x != null) k.next = x;
        if(y != null) k.next =y;
        return dummy.next;
    }
}
