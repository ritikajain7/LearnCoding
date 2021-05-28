class Node{
    String s;
    Node next;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Node(String s) {
        this.s = s;
    }
}

/**
 * Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.
 *
 * The list is very long, so making more than one pass is prohibitively expensive.
 */
public class RemoveKthLastElement {
    public static void main(String args[]){
        Node head = null;
        Node n1 = new Node("a");
        Node n2 = new Node("b");
        Node n3 = new Node("c");
        Node n4 = new Node("d");
        Node n5 = new Node("e");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next=null;
        head = n1;
        printList(head);
        head = n1;
        removeKthLastEle(head, 2);
        head = n1;
        System.out.println("========== After removal =========");
        printList(head);
    }
    private static void removeKthLastEle(Node head, int k){
        Node p1 = head;
        Node p2 = head;
        int count = 0;
        while(p1!=null){

            if(count==k+1){
                p2=head;
            }
            System.out.println(p1+"   ::    "+p2);
            p1 = p1.next;
            p2 = p2.next;
            count++;

        }
        System.out.println(p2.getS());
        p2.next = p2.next.next;
    }
    private static void printList(Node head){
        while(head!=null){
            System.out.println(head.getS());
            head = head.next;
        }
    }
}
