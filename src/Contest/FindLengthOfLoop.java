package Contest;

import java.util.*;
import java.io.*;
import java.lang.*;

public class FindLengthOfLoop {


    class Node
    {
        int data;
        Node next;

        Node(int x)
        {
            data = x;
            next = null;
        }
    }

//    class Main
//    {
//        public static void makeLoop(Node head, Node tail, int x){
//            if (x == 0) return;
//
//            Node curr = head;
//            for(int i=1; i<x; i++)
//                curr = curr.next;
//
//            tail.next = curr;
//        }
//
//        public static void main (String[] args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            int num = sc.nextInt();
//            Node head = new Node(num);
//            Node tail = head;
//
//            for(int i=0; i<n-1; i++)
//            {
//                num = sc.nextInt();
//                tail.next = new Node(num);
//                tail = tail.next;
//            }
//
//            int pos = sc.nextInt();
//            makeLoop(head, tail, pos);
//            Solution x = new Solution();
//            System.out.print(x.countNodesinLoop(head));
//        }
//    }
    class Solution{
        public static int countNodesinLoop(Node head)
        {
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next!= null)
            {
                fast = fast.next.next ;
                slow = slow.next;
                if (slow == fast)
                {
                    break;
                }
            }
            if (fast == null || fast.next == null) return 0;
            slow = head;
            while (fast != slow)
            {
                slow = slow.next;
                fast = fast.next;
            }
            int cnt = 1 ;
            if (fast.next != null) fast = fast.next;
            while (fast != slow)
            {
                fast = fast.next;
                cnt++ ;
            }return cnt ;
        }
    }
}
