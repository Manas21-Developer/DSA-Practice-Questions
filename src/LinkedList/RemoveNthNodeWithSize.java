import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RemoveNthNodeWithSize {

    // Make Node static so nested classes can reference it.
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // Simple linked-list helper for building & printing
    static class Insertion {
        Node head;
        Node tail;
        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // main must be inside a class
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input format:
        // First line: N n       (N = number of nodes, n = remove nth from end)
        // Second line: N integers (list values)
        String[] S = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(S[0]);
        int n = Integer.parseInt(S[1]);

        String[] S1 = br.readLine().trim().split("\\s+");
        Insertion llist = new Insertion();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(S1[i]);
            llist.addToTheLast(new Node(a));
        }

        Solution ob = new Solution();
        Node newhead = ob.removeNthFromEnd(llist.head, n);
        llist.printList(newhead);
    }

    // Solution class with removeNthFromEnd
    static class Solution {
        public Node removeNthFromEnd(Node head, int n) {
            if (head == null || n <= 0) return head;

            Node temp = head;
            while (temp != null){

        }return head;
    }
}
