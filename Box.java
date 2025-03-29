public class Box {
    String brand; // this represents the brand of the pair of shoes

    Box next; // next is the thread that points the next Box. Notice, it is of type Box
              // because it will point to the next Box

    // Constructor to create a new box. Pass the brand. Initially we leave the
    // thread as null. points to no box
    Box(String brand) {
        this.brand = brand;
        this.next = null;
    }
}
