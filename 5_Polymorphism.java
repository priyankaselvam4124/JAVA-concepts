//5 Polymorphism compile time(overloading) and run time (overriding)
// TASK: Create shape class with draw() having 2 overloaded versions
//create circle n rectangle class inheriting shape and overrriding draw()
class Shape{
    //overloading draw()
    void draw(){
        System.out.println("Drawing a shape");
    
    }
    //overloading draw() 
    void draw(String color){
        System.out.println("Drawing a shape with color : " + color);
    }
}
//circle class overriding draw() 
class Circle extends Shape{
 @Override
 void draw(){
    System.out.println("Drawing a circle");
 }
}
//square class overriding draw()
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }
}
public class 5_Polymorphism {
    public static void main(String[] args) {
    //method overloading - compile time polymorphism
    Shape s1 = new  Shape();
    s1.draw();
    s1.draw("Blue");
    //method overriding - run time polymorphism
    Shape myShape = new Circle();
    myShape.draw();

    myShape = new Square();
    myShape.draw();
}
}
