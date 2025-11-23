package Contest;
import java.util.*;
import java.io.*;

public class ExchangeNodes {

    class Solution{
        Node exchangeNodes(LinkedList ll){
            Node head = ll.head;
            if(head == null) return null;
            if (head.next == null) return head;
            Node curr = head;
            while (curr.next != null)
            {
                curr = curr.next;
            }
            Node temp = new Node (head.data);
            head.data = curr.data;
            curr.data = temp.data;
            return head;
        }
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    class LinkedList{
        Node head;
        int sz = 0;
        void add(int data ){
            sz++;
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
                return;
            }
            Node current = head;
            while(current.next !=null){
                current = current.next;
            }
            current.next = new_node;
        }
        void print(Node node){
            while(node != null){
                System.out.print(node.data + " ");
                node = node.next;
            }

        }
    }

//    public class Main {
//        public static void main(String args[]) {
//            Scanner input = new Scanner(System.in);
//            int n = input.nextInt();
//            LinkedList ll = new LinkedList();
//            for(int i = 0; i<n; i++){
//                ll.add(input.nextInt());
//            }
//            Solution Obj = new Solution();
//            Node head = Obj.exchangeNodes(ll);
//            ll.print(head);
//        }
//    }

}
