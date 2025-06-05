//final keyword can be used on variable,methods and classes.
class Calc1{ // if we use final keyword on the class other classes can't extend it.

    final public void show(){

        final int n =10;
        //n=20; // Possible only if we don't use final keyword on the variable. If you use final keyword the variable will become a constant and you cannot change the value later.
    }

    public void add(int a,int b){ // When we use the final keyword on a method belonging to a patent class  and there is a class that is extending our(parent) class and the class that is inheriting from us also has the same method and when we call the methosd, the subclass method will not override the method of the patent class.

        System.out.println(a+b);
    }
}

class advanceCalc1 extends Calc1{ // if we use final keyword on the class other classes can't extend it.

//    public void show(){ This will throw an error.
//
//        int n =10;
//
//     }

}

public class Lecture_61_Final_Keyword {

    public static void main(String args[]){

    }
}
