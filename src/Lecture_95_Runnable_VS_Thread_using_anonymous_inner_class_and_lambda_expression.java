public class Lecture_95_Runnable_VS_Thread_using_anonymous_inner_class_and_lambda_expression {

    public static void main(String[] args) {

        Runnable obj = new Runnable() {

            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi from anonymous inner class");
                }
            }
        };

        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from anonymous inner class");
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();


    }

    //Making the above code simpler using Lambda expression.

//    public static void main(String[] args) {
//
//        Runnable obj = new Runnable() {
//
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi from anonymous inner class");
//                }
//            }
//        };
//
//        Runnable obj1 = new Runnable() {
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hello from anonymous inner class");
//                }
//            }
//        };
//
//        Thread t1 = new Thread(obj);
//        Thread t2 = new Thread(obj1);
//
//        t1.start();
//        t2.start();
//
//
//    }
}
