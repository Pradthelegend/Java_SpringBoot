class Calc{

    public int add(int num1, int num2){

        int ans = num1 + num2;
        return ans;
    }

    public int sub(int num1, int num2){

        int ans = num1 - num2;
        return ans;
    }
}

class AdvanceCalc extends Calc{

    public int add(int num1, int num2){

        int ans = num1 + num2 + 1; // This is called method over riding the parent class and the child class have the same method name
                                   // but when we create a new object of the child class and when we call a method the control first checks if
                                  // the method is first present inside the child class if not only then goes to the parent class. Here the child class has the method so
                                  //that method is called. Technically method of the child class overrides the method of the parent class.
        return ans;
    }
}

public class Lecture_56_Method_Overriding {

    public static void main(String args[]){

        AdvanceCalc advanceCalc = new AdvanceCalc();
        System.out.println(advanceCalc.add(1,3));

    }

}
