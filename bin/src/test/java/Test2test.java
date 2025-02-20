public class Test2test {
    
    // Instance variables
    private String name;
    private int id;

    // Constructor
    public Test2test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    // Main method for execution
    public static void main(String[] args) {
        // Creating an object
        Test2test obj = new Test2test("John Doe", 101);
        
        // Display initial details
        obj.displayInfo();

        // Modify values
        obj.setName("Jane Smith");
        obj.setId(102);

        // Display updated details
        System.out.println("\nAfter modification:");
        obj.displayInfo();
    }
}

    
}
