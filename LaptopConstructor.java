class LaptopConstructor {
    String brand;
    int ram;
    // Default constructor
    LaptopConstructor() {
        this.brand = "Unknown";
        this.ram = 0;
    }
    // Constructor with brand
    LaptopConstructor(String brand) {
        this.brand = brand;
        this.ram = 0;
    }
    // Constructor with brand and ram
    LaptopConstructor(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB");
    }
    public static void main(String[] args) {
        LaptopConstructor l1 = new LaptopConstructor();
        LaptopConstructor l2 = new LaptopConstructor("Dell");
        LaptopConstructor l3 = new LaptopConstructor("HP", 16);
        l1.display();
        l2.display();
        l3.display();
    }
}