public class Abstract {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}
abstract class Animal{
    abstract void eat();
    void sound(){
        System.out.println("Sound");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eats");
    }
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}