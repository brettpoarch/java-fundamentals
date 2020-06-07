package labs_examples.arrays.examples;

public class ForEachLoop {

    public static void main(String[] args) {

        //single array
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("------------------------");
        
        //two D array
        int[][] twoDArray = new int[3][5];
        int count = 0;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = count;
                count++;
            }
        }

        for (int[] outter : twoDArray) {
            for (int inner : outter) {
                System.out.print(inner + " | ");
            }
            System.out.println();
        }
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++){
//                System.out.print(twoDArray[i][j] + " | ");
//            }
//            System.out.println();
//        }

    }
}
