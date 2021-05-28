class Node3{
    String s;
    Node next;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Node3(String s) {
        this.s = s;
    }
}

public class ListDummy {
    public static void main(String args[]){
        Node n1 = new Node("a");
        Node n2 = new Node("b");
        Node n3 = new Node("c");
        Node n4 = new Node("d");
        Node n5 = new Node("e");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        removeKthLastEle(n1);
    }
    private static void removeKthLastEle(Node head){

    }
}
