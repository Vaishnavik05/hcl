class AnimalBase {
    public String name;
    protected String type;
    String sound;
    private int age;

    public AnimalBase(String name, String type, String sound, int age) {
        this.name  = name;
        this.type  = type;
        this.sound = sound;
        this.age   = age;
    }

    public int getAge() {
        return age;
    }

    private String describe() {
        return name + " is a " + type + ", aged " + age;
    }

    public void showInfo() {
        System.out.println(describe());
        System.out.println("Sound: " + sound);
    }
}

class DogPet extends AnimalBase {
    private String breed;

    public DogPet(String name, String breed, int age) {
        super(name, "Mammal", "Woof", age);
        this.breed = breed;
    }

    public void dogInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Type  : " + type);
        System.out.println("Sound : " + sound);
        System.out.println("Age   : " + getAge());
        System.out.println("Breed : " + breed);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        AnimalBase a = new AnimalBase("Cat", "Mammal", "Meow", 3);
        System.out.println("=== Animal Info ===");
        a.showInfo();
        System.out.println("Age (via getter): " + a.getAge());

        System.out.println("\n=== Dog Info ===");
        DogPet d = new DogPet("Bruno", "Labrador", 5);
        d.dogInfo();
    }
}