public class Node {
    String value; // We called this brand. In the industry it is normally called value or data.

    Node next; // next is a pointer. Points to the next Node.

    // Constructor to create a new Node.
    Node(String value) {
        this.value = value;
        this.next = null;
    }
}
