class Encapsulation{
    //By making instance variables private, you cannot access them directly from outside the class using an object like obj.name = "Hello";.
    //They can only be accessed or modified through methods inside the same class, typically using getters and setters.
    //This is called encapsulation — we are encapsulating (hiding) the instance variables and controlling access through the class's methods.
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String Name){
        this.name= Name; //The "this" keyword represents the object that is calling the method.So its basically obj.name.
    }

    //If you're not using "this" keyword you woulds be doing it the below way.
    public void setName1(String Name,Encapsulation object){
         object.name= Name; //The "this" keyword represents the object that is calling the method.So its basically obj.name.
    }

    public void setAge(int Age){
        this.age= Age;
    }
}

public class Lecture_44_Encapsulation {

    public static void main(String args[]){

        Encapsulation obj = new Encapsulation();
        obj.setName("Prad");
        obj.setAge(22);
        obj.setName1("Chin Chin",obj); //You are passing the object which you created.
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
