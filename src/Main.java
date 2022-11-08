public class Main {

    public static void main(String[] args) {
        int[][] arr = {{3,6,1},{9,5}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max value of this 2D array is: " + max);
    }
}