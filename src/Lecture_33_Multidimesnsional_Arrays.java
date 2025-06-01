import java.lang.reflect.Array;

public class Lecture_33_Multidimesnsional_Arrays {

    public static void main(String args[]){

        int nums[][] = new int[3][5];

        for(int i =0;i<nums.length;i++){

            for(int j=0;j<5;j++){
                nums[i][j] =(int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int[] randnum : nums){

            for (int Elements : randnum){
                System.out.print(Elements + " ");
            }
            System.out.println();
        }

    }
}
