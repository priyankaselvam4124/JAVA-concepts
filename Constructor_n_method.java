// Constructor and method implementation
// TASK: implement multiple constructor n method
class Car{
    String name;
    int yr;
    int speed;
    Car()//no parameters constructor
    {
        name ="Toyota";
        yr = 1689;
        speed =70;
    }
    Car(String cname,int cyr,int cspeed)//parametrized constructor
    {
        name=cname;
        yr=cyr;
        speed=cspeed;
    }
    void display()//method
    {
        speed+=10;
        System.out.println ("car name : "+ name +" yr : "+ yr+" speed : "+speed);

    }

}

public class Constructor_n_method {
    public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 =new Car (  "honda",1888,90) ;
    c1.display();
    c2.display();      
    }
}
