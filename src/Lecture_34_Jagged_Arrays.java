public class Lecture_34_Jagged_Arrays {

    public static void main(String args[]){

        int nums[][] = new int[3][]; // Jagged Array
        nums[0] = new int[5];
        nums[1] = new int[4];
        nums[2] = new int[2];



        for(int i =0;i<nums.length;i++){

            for(int j=0;j<nums[i].length;j++){
                nums[i][j] =(int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // We are doimg the same thing but with a for each loop
        for (int[] randnum : nums){

            for (int Elements : randnum){
                System.out.print(Elements + " ");
            }
            System.out.println();
        }

        int ThreeDimensionalArray[][][] = new int[3][4][5]; // 3D Array

        for(int i =0;i<ThreeDimensionalArray.length;i++){

            for(int j=0;j<ThreeDimensionalArray[i].length;j++) {

                for (int k = 0; k <ThreeDimensionalArray[i][j].length; k++) {
                     ThreeDimensionalArray[i][j][k] = (int) (Math.random() * 100);
                    System.out.print(ThreeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }


    }
}
