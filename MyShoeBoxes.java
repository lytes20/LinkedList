public class MyShoeBoxes {
    Box firstBox; // Think will always act as the beginning of our linked boxes. It is of type Box

    MyShoeBoxes() {
    }

    MyShoeBoxes(Box firstBox) {
        this.firstBox = firstBox;
    }

    public boolean add(String brand) {
        Box newBox = new Box(brand); // Create a new box with the brand
        if (firstBox == null) { // If you dont have any boxes, means this box will be your first
            firstBox = newBox;
        } else {
            Box temp = firstBox;
            while (temp.next != null) { // traverse the thread of boxes until the last, add that box at the end
                temp = temp.next;
            }
            temp.next = newBox;
        }
        return true;
    }

    // Method to find a Box with a given value
    public Box find(String brand) {
        Box temp = firstBox;
        while (temp != null) {
            if (temp.brand.equals(brand)) {
                return temp; // Return the Box if brand matches
            }
            temp = temp.next;
        }
        return null; // Return null if the brand is not found
    }

    // Method to remove a Box with a given brand
    public boolean delete(String brand) {
        if (firstBox == null) {
            System.out.println("List is empty.");
            return false;
        }

        if (firstBox.brand.equals(brand)) { // If the firstBox needs to be removed
            firstBox = firstBox.next;
            return true;
        }

        Box temp = firstBox;
        while (temp.next != null) {
            if (temp.next.brand == brand) {
                temp.next = temp.next.next; // Remove the Box
                return true;
            }
            temp = temp.next;
        }

        System.out.println("Box with brand not found in the connected boxes.");
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shoe Boxes: ");
        Box temp = firstBox;
        while (temp != null) {
            sb.append(temp.brand);
            if (temp.next != null) {
                sb.append(" -> ");
            }
            temp = temp.next;
        }
        return sb.toString();
    }
}
