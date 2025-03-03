// 1 class n object
//TASK: create a class and object'
class Stud{
    String name;
    String school;
    int age;
     
    void display(){
        System.out.println(name 
        +" is from"+ school+" and is "+ age+" years old");
    }
}
public class Class_n_object{
    public static void main (String[] args){
        Stud student =new Stud();
        student.name="julia";
        student.school=" vani vidyalaya";
        student.age= 17;
        student.display();
    }
}
