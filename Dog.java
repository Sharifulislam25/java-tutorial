//Class
public class Dog {
    // Private Instance Variables (Encapsulation)
    private String breed;
    private String size;
    private int age;
    private String color;

    // Constructor
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    // Getter Method
    public String getInfo() {
        return String.format("Breed: %s, Size: %s, Age: %d, Color: %s", breed, size, age, color);
    }

    // Main Method
    public static void main(String[] args) {
        Dog maltese = new Dog("Maltese", "Small", 2, "White");
        System.out.println(maltese.getInfo());
    }
}
