package LinkedList;

public class LinkedListUpdation {
    Node head;
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
    public void linkedListFirst(int newData)
    {
        if(head == null)
        {
            System.out.print("List is empty");
            return;
        }
        head.data = newData;
    }
    public void linkedListEnd(int newData)
    {
        if(head == null)
        {
            System.out.print("List is empty");
            return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.data = newData;
    }
    public void linkedListMiddle(int newData)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.data = newData;
    }
    public Boolean  linkedListAtPos(int newData , int pos)
    {
        if (pos <0)
        {
            System.out.println("Position is invalid ");
            return false ;
        }
        Node curr = head;
        int i =0;
        while (curr != null && i < pos)
        {
            curr = curr.next;
            i++;
        }
        if (curr != null)
        {
            curr.data = newData;
            return true;
        }else
        {
            System.out.println("Position is out of bound"+pos);
            return false;
        }
    }
}
