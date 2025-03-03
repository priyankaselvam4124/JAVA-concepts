//4 ABSTRACTION
//TASK : create abstract class Animal with abstract method makeSound()
// subclasses cat and dog implementing makeSound()
//in main() create objects for cat and dog and call makeSound()
abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
}}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat says meow");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Animal myDog =new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
    
}
