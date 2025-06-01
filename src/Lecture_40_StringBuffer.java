public class Lecture_40_StringBuffer {

    public static void main(String args[]) {

        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        buffer.append(" Prad");
        System.out.println(buffer);

        String str = buffer.toString(); // Converting it to type String
        System.out.println(str);
        System.out.println(buffer.insert(1,"Hi"));
        System.out.println(buffer.deleteCharAt(3));
        buffer.ensureCapacity(50);
        System.out.println(buffer.capacity());
    }
}
