public class Main {
    public static void main(String[] args) {
        MyShoeBoxes shoeBoxes = new MyShoeBoxes();

        // Adding shoe brands
        shoeBoxes.add("Adidas");
        shoeBoxes.add("Nike");
        shoeBoxes.add("Allbirds");

        // Displaying the list
        System.out.println(shoeBoxes);

        // Finding a box
        System.out.println("Finding Nike: " + (shoeBoxes.find("Nike") != null ? "Found" : "Not Found"));

        // Deleting a box
        shoeBoxes.delete("Nike");
        System.out.println("After deleting Nike: " + shoeBoxes);

        // Trying to find the deleted box
        System.out.println("Finding Nike after deletion: " + (shoeBoxes.find("Nike") != null ? "Found" : "Not Found"));
    }
}
