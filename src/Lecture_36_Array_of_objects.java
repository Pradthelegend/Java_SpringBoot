
public class Lecture_36_Array_of_objects extends Students {

    public static void main(String args[]){

        Students students1 = new Students();
        Students students2 = new Students();
        Students students3 = new Students();

        students1.name="Prad";
        students1.age=22;

        students2.name="Chin Chin";
        students2.age=2;

        students3.name="Harsh";
        students3.age=22;

        Students students[] = new Students[3];
        students[0]=students1;
        students[1]=students2;
        students[2]=students3;

        for (int i=0; i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].age);
        }
        System.out.println();

        // Implimenting the same in a for each loop
        for (Students stud : students){

            System.out.println(stud.name + " : " + stud.age);

        }





    }
}
