class A2{

    public void show(){
        System.out.println("In A2 show");
    }
}

public class Lecture_72_Anonymous_Inner_Class {

    public static void main(String args[]) {

        A2 obj = new A2(); // Just creating an object.
        obj.show();

        A2 obj1 = new A2(){/* We are creating an object of anonymous Inner class
                           This is called a new Inplimentation. This is an anonymous inner class, it's an inner class cause its indside "Lecture_72_Anonymous_Inner_Class".
                           This class does not have a name but when we compile a new class file will be created like always.(Note : Class files are created for every class whenever compiled
                           /* let's say we extend a class even the "parent class" .class file will be created).

                           /*
                           You're creating a new unnamed subclass of A2.
                           In that subclass, you're overriding the show() method.
                           Then, you're instantiating it and assigning it to obj1.
                            */

                           /*
                           obj1 uses the overridden show() method (from anonymous class).
                           ❌ obj does not use the overridden method — it uses the method from the original class.
                            */

                          /*
                           Anonymous inner classes are useful when:
                           You need to override a method for one-time use.
                           You want to avoid creating a full subclass just for a small behavior change.
                            */



            public void show(){ // obj1 will have both the show() and shalom() method but shalom can't be called cause the object type is "A2". Does NOT work, because A2 doesn’t define shalom()
                System.out.println("In new show");
            }

            public void shalom(){
                System.out.println("In Shalom Method");
            }
        };
        obj1.show();
        /*
        obj1.shalom() // Compile-time error: cannot find symbol

        You're creating an anonymous subclass of A2 that includes an extra method shalom().
        But — obj1 is declared as type A2, and the A2 class doesn't know about the shalom() method.
         */



    }


}
