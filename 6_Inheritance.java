// 6 INHERITANCE
//TASK :creat evechile parent class and a showInfo() method
//child car class inheriting vechile with honk()
class Vehicle{
    String brand;
    int speed;
    void showInfo(){
        System.out.println("Brand "+brand +",Speed "+speed+" km/h");
    }
}
class Caar extends Vehicle{
    void honk(){
        System.out.println("Honk Honk!");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Caar myCaar = new Caar();
        myCaar.brand ="Toyota";
        myCaar.speed= 125;
        myCaar.showInfo();
        myCaar.honk();
    }
}
